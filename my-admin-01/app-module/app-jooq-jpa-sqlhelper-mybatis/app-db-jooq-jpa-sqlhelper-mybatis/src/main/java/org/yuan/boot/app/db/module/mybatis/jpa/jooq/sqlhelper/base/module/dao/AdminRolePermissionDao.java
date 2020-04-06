package org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.base.module.dao;

import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.base.commons.dao.BaseDao;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.base.module.pojo.AdminRolePermission;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.base.module.pojo.vo.AdminRolePermissionVO;

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
