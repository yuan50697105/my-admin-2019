package org.yuan.boot.app.db.module.mybatis.base.module.dao;

import org.yuan.boot.app.db.module.mybatis.base.commons.dao.BaseDao;
import org.yuan.boot.app.db.module.mybatis.base.module.pojo.AdminRolePermission;
import org.yuan.boot.app.db.module.mybatis.base.module.pojo.dto.AdminRoleWithPermissionDTO;

import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 00:55
 */
@SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
public interface AdminRolePermissionDao extends BaseDao<AdminRolePermission> {
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    void batchInsert(List<AdminRolePermission> adminRolePermissions);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    void deleteByRoleId(Long roleId);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    void deleteByRoleIds(List<Long> roleIds);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    void deleteByPermissionIds(List<Long> permissionIds);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<AdminRolePermission> selectByRoleId(Long roleId);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    AdminRoleWithPermissionDTO getRolePermissionByRoleId(Long roleId);
}
