package org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.mapper.module.repository;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-23 00:16
 */
public class AdminRolePermissionRepositoryJPQL {
    public static final String DELETE_FROM_ADMIN_ROLE_PERMISSION_ARP_WHERE_ARP_PERMISSION_ID_IN_PERMISSION_ID = "delete from AdminRolePermission arp where arp.permissionId in (:permissionId)";
    public static final String DELETE_FROM_ADMIN_ROLE_PERMISSION_ARP_WHERE_ARP_ROLE_ID_ROLE_ID = "delete from AdminRolePermission arp where arp.roleId = :roleId";
    public static final String DELETE_FROM_ADMIN_ROLE_PERMISSION_ARP_WHERE_ARP_ROLE_ID_IN_ROLE_ID = "delete from AdminRolePermission arp where arp.roleId in (:roleId)";
}