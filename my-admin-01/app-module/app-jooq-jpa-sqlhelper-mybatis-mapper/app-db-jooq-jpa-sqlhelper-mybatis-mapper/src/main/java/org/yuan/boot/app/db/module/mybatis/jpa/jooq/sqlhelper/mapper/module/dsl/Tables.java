/*
 * This file is generated by jOOQ.
 */
package org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.mapper.module.dsl;


import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.mapper.module.dsl.tables.*;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in my_admin_01
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.12.3"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Tables {

    /**
     * admin_permission
     */
    public static final AdminPermission ADMIN_PERMISSION = AdminPermission.ADMIN_PERMISSION;

    /**
     * admin_role
     */
    public static final AdminRole ADMIN_ROLE = AdminRole.ADMIN_ROLE;

    /**
     * admin_role_permission
     */
    public static final AdminRolePermission ADMIN_ROLE_PERMISSION = AdminRolePermission.ADMIN_ROLE_PERMISSION;

    /**
     * admin_user
     */
    public static final AdminUser ADMIN_USER = AdminUser.ADMIN_USER;

    /**
     * admin_user_role
     */
    public static final AdminUserRole ADMIN_USER_ROLE = AdminUserRole.ADMIN_USER_ROLE;
}
