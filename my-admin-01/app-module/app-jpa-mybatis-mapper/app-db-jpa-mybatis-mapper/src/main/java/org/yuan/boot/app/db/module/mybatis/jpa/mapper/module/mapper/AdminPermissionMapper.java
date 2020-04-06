package org.yuan.boot.app.db.module.mybatis.jpa.mapper.module.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yuan.boot.app.db.module.mybatis.jpa.mapper.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.jpa.mapper.module.pojo.AdminPermission;
import org.yuan.boot.app.db.module.mybatis.jpa.mapper.module.pojo.condition.AdminPermissionQuery;

import java.util.List;

@SuppressWarnings({"AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc", "AlibabaClassMustHaveAuthor"})
@Mapper
public interface AdminPermissionMapper extends BaseMapper<AdminPermission> {
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    int deleteByPrimaryKey(Long id);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    AdminPermission selectByPrimaryKey(Long id);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<AdminPermission> selectByCondition(AdminPermissionQuery condition);
}