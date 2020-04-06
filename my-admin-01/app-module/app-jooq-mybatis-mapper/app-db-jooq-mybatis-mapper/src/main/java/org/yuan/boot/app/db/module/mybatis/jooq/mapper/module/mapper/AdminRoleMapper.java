package org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.pojo.condition.AdminRoleQuery;

import java.util.List;

@SuppressWarnings({"AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc", "AlibabaClassMustHaveAuthor"})
@Mapper
public interface AdminRoleMapper extends BaseMapper<AdminRole> {
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<AdminRole> selectByCondition(AdminRoleQuery condition);
}