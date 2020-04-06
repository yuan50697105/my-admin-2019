package org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.pojo.AdminUser;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.pojo.condition.AdminUserQuery;

import java.util.List;

@SuppressWarnings({"AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc", "AlibabaClassMustHaveAuthor"})
@Mapper
public interface AdminUserMapper extends BaseMapper<AdminUser> {
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<AdminUser> selectByCondition(AdminUserQuery condition);
}