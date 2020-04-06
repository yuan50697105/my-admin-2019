package org.yuan.boot.app.db.module.mybatis.plus.commons.configuration.intercepter;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.yuan.boot.app.db.module.mybatis.plus.commons.configuration.annotation.CreateTime;
import org.yuan.boot.app.db.module.mybatis.plus.commons.configuration.annotation.SnowFlakeId;
import org.yuan.boot.app.db.module.mybatis.plus.commons.configuration.annotation.UpdateTime;
import org.yuan.boot.commons.base.core.configuration.pojo.SnowFlake;

import java.lang.reflect.Field;
import java.util.*;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuanez
 * @create: 2020-02-21 08:50
 **/
@SuppressWarnings("ALL")
@Component("auditInterceptor")
@Intercepts({
        @Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class})
})
public class AuditInterceptor implements Interceptor {
    @SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
    @Autowired
    private SnowFlake snowFlake;

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        MappedStatement statement = ((MappedStatement) invocation.getArgs()[0]);
        SqlCommandType sqlCommandType = statement.getSqlCommandType();
        Object parameter = invocation.getArgs()[1];
        List<Field> fields = getAllField(parameter);
        for (Field field : fields) {
            if (field.getAnnotation(SnowFlakeId.class) != null) {
                if (SqlCommandType.INSERT.equals(sqlCommandType)) {
                    field.setAccessible(true);
                    field.set(parameter, snowFlake.nextId());
                }
            }
            if (field.getAnnotation(CreateTime.class) != null) {
                if (SqlCommandType.INSERT.equals(sqlCommandType)) {
                    field.setAccessible(true);
                    field.set(parameter, new Date());
                }
            }
            if (field.getAnnotation(UpdateTime.class) != null) {
                if (SqlCommandType.INSERT.equals(sqlCommandType) || SqlCommandType.UPDATE.equals(sqlCommandType)) {
                    field.setAccessible(true);
                    field.set(parameter, new Date());
                }
            }

        }
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }

    private List<Field> getAllField(Object object) {
        Class<?> type = object.getClass();
        Field[] declaredFields = type.getDeclaredFields();
        ArrayList<Field> fields = new ArrayList<>(Arrays.asList(declaredFields));
        while ((type = type.getSuperclass()) != null) {
            fields.addAll(Arrays.asList(type.getDeclaredFields()));
        }
        return fields;
    }
}
