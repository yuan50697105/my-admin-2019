package org.yuan.boot.app.db.module.mybatis.jooq.plus.module.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yuan.boot.app.db.module.mybatis.jooq.plus.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.jooq.plus.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.jooq.plus.module.pojo.condition.AdminRoleQuery;

import java.util.List;

@SuppressWarnings({"AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc", "AlibabaClassMustHaveAuthor"})
@Mapper
public interface AdminRoleMapper extends BaseMapper<AdminRole> {
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<AdminRole> selectListByCondition(AdminRoleQuery condition);
}