package org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.plus.module.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.plus.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.plus.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.plus.module.pojo.condition.AdminRoleQuery;

import java.util.List;

@SuppressWarnings({"AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc", "AlibabaClassMustHaveAuthor", "AliMissingOverrideAnnotation"})
@Mapper
public interface AdminRoleMapper extends BaseMapper<AdminRole> {
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    int deleteByPrimaryKey(Long id);

    @SuppressWarnings({"AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc", "AliMissingOverrideAnnotation"})
    int insert(AdminRole record);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    int insertSelective(AdminRole record);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    AdminRole selectByPrimaryKey(Long id);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    int updateByPrimaryKeySelective(AdminRole record);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    int updateByPrimaryKey(AdminRole record);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<AdminRole> selectByCondition(AdminRoleQuery condition);
}