package org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.pojo.AdminUserRole;

import java.util.List;

@SuppressWarnings({"AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc", "AlibabaClassMustHaveAuthor"})
@Mapper
public interface AdminUserRoleMapper extends BaseMapper<AdminUserRole> {
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<AdminUserRole> selectByUserId(Long userId);
}