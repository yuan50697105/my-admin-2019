package org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.plus.module.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.plus.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.plus.module.pojo.AdminUser;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.plus.module.pojo.condition.AdminUserQuery;

import java.util.List;

@SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
@Mapper
public interface AdminUserMapper extends BaseMapper<AdminUser> {
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<AdminUser> selectListByCondition(AdminUserQuery condition);
}