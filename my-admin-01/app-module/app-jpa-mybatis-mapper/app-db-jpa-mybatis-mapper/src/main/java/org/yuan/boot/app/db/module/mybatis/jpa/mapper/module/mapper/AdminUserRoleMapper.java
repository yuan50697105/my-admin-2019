package org.yuan.boot.app.db.module.mybatis.jpa.mapper.module.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yuan.boot.app.db.module.mybatis.jpa.mapper.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.jpa.mapper.module.pojo.AdminUserRole;

@SuppressWarnings({"AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc", "AlibabaClassMustHaveAuthor"})
@Mapper
public interface AdminUserRoleMapper extends BaseMapper<AdminUserRole> {
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    int deleteByPrimaryKey(Long id);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    AdminUserRole selectByPrimaryKey(Long id);

}