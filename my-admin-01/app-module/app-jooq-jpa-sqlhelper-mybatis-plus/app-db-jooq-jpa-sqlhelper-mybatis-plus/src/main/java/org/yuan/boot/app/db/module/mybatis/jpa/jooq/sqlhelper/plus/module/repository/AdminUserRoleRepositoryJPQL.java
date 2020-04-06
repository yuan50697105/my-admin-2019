package org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.plus.module.repository;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-23 00:15
 */
public class AdminUserRoleRepositoryJPQL {
    public static final String DELETE_FROM_ADMIN_USER_ROLE_AUR_WHERE_AUR_ROLE_ID_ROLE_ID = "delete from AdminUserRole aur where aur.roleId = :roleId";
    public static final String DELETE_FROM_ADMIN_USER_ROLE_AUR_WHERE_AUR_ROLE_ID_IN_ROLE_ID = "delete from AdminUserRole aur where aur.roleId in (:roleId)";
    public static final String DELETE_FROM_ADMIN_USER_ROLE_AUR_WHERE_AUR_USER_ID_ROLE_ID = "delete from AdminUserRole aur where aur.userId = :roleId";
    public static final String DELETE_FROM_ADMIN_USER_ROLE_AUR_WHERE_AUR_USER_ID_IN_USER_ID = "delete from AdminUserRole aur where aur.userId in (:userId)";
}