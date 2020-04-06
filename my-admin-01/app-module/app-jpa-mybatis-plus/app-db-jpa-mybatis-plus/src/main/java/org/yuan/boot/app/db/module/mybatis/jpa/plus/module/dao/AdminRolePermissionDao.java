package org.yuan.boot.app.db.module.mybatis.jpa.plus.module.dao;

import org.yuan.boot.app.db.module.mybatis.jpa.plus.commons.dao.BaseDao;
import org.yuan.boot.app.db.module.mybatis.jpa.plus.module.pojo.AdminRolePermission;
import org.yuan.boot.app.db.module.mybatis.jpa.plus.module.pojo.vo.AdminRolePermissionVO;

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
    void deleteAllByPermissionIds(List<Long> permissionIds);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    void deleteAllByRoleId(Long roleId);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    void deleteAllByRoleIds(List<Long> roleIds);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    AdminRolePermissionVO getRolePermissionByRoleId(Long roleId);
}
