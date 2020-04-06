package org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.plus.commons.configuration;

import cn.hutool.core.lang.Snowflake;
import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-23 00:20
 */
@Primary
@Component
public class SnowFlakeIdentifierGenerator implements IdentifierGenerator {
    @SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
    @Autowired
    private Snowflake snowflake;

    @Override
    public Number nextId(Object entity) {
        return snowflake.nextId();
    }
}