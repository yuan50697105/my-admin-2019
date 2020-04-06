package org.yuan.boot.app.db.module.mybatis.sqlhelper.plus.module.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.plus.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.plus.module.pojo.AdminRolePermission;

import java.util.List;

@SuppressWarnings({"AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc", "AlibabaClassMustHaveAuthor"})
@Mapper
public interface AdminRolePermissionMapper extends BaseMapper<AdminRolePermission> {
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<AdminRolePermission> selectByRoleId(Long roleId);
}