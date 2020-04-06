package org.yuan.boot.app.db.module.mybatis.jpa.plus.module.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yuan.boot.app.db.module.mybatis.jpa.plus.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.jpa.plus.module.pojo.AdminRolePermission;

@SuppressWarnings({"AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc", "AlibabaClassMustHaveAuthor", "AliMissingOverrideAnnotation"})
@Mapper
public interface AdminRolePermissionMapper extends BaseMapper<AdminRolePermission> {
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    int deleteByPrimaryKey(Long id);

    @SuppressWarnings({"AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc", "AliMissingOverrideAnnotation"})
    int insert(AdminRolePermission record);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    int insertSelective(AdminRolePermission record);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    AdminRolePermission selectByPrimaryKey(Long id);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    int updateByPrimaryKeySelective(AdminRolePermission record);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    int updateByPrimaryKey(AdminRolePermission record);
}