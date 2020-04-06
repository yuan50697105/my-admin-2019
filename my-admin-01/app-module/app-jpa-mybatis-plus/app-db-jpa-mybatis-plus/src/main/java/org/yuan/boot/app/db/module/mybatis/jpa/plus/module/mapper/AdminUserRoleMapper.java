package org.yuan.boot.app.db.module.mybatis.jpa.plus.module.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yuan.boot.app.db.module.mybatis.jpa.plus.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.jpa.plus.module.pojo.AdminUserRole;

@SuppressWarnings({"AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc", "AlibabaClassMustHaveAuthor", "AliMissingOverrideAnnotation"})
@Mapper
public interface AdminUserRoleMapper extends BaseMapper<AdminUserRole> {
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    int deleteByPrimaryKey(Long id);

    @SuppressWarnings({"AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc", "AliMissingOverrideAnnotation"})
    int insert(AdminUserRole record);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    int insertSelective(AdminUserRole record);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    AdminUserRole selectByPrimaryKey(Long id);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    int updateByPrimaryKeySelective(AdminUserRole record);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    int updateByPrimaryKey(AdminUserRole record);
}