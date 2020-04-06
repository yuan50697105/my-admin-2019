/*
 * This file is generated by jOOQ.
 */
package org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.dsl;


import org.jooq.UniqueKey;
import org.jooq.impl.Internal;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.dsl.tables.*;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.dsl.tables.records.*;

import javax.annotation.Generated;


/**
 * A class modelling foreign key relationships and constraints of tables of
 * the <code>my_admin_01</code> schema.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.12.3"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AdminPermissionRecord> KEY_ADMIN_PERMISSION_PRIMARY = UniqueKeys0.KEY_ADMIN_PERMISSION_PRIMARY;
    public static final UniqueKey<AdminRoleRecord> KEY_ADMIN_ROLE_PRIMARY = UniqueKeys0.KEY_ADMIN_ROLE_PRIMARY;
    public static final UniqueKey<AdminRolePermissionRecord> KEY_ADMIN_ROLE_PERMISSION_PRIMARY = UniqueKeys0.KEY_ADMIN_ROLE_PERMISSION_PRIMARY;
    public static final UniqueKey<AdminUserRecord> KEY_ADMIN_USER_PRIMARY = UniqueKeys0.KEY_ADMIN_USER_PRIMARY;
    public static final UniqueKey<AdminUserRoleRecord> KEY_ADMIN_USER_ROLE_PRIMARY = UniqueKeys0.KEY_ADMIN_USER_ROLE_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<AdminPermissionRecord> KEY_ADMIN_PERMISSION_PRIMARY = Internal.createUniqueKey(AdminPermission.ADMIN_PERMISSION, "KEY_admin_permission_PRIMARY", AdminPermission.ADMIN_PERMISSION.ID);
        public static final UniqueKey<AdminRoleRecord> KEY_ADMIN_ROLE_PRIMARY = Internal.createUniqueKey(AdminRole.ADMIN_ROLE, "KEY_admin_role_PRIMARY", AdminRole.ADMIN_ROLE.ID);
        public static final UniqueKey<AdminRolePermissionRecord> KEY_ADMIN_ROLE_PERMISSION_PRIMARY = Internal.createUniqueKey(AdminRolePermission.ADMIN_ROLE_PERMISSION, "KEY_admin_role_permission_PRIMARY", AdminRolePermission.ADMIN_ROLE_PERMISSION.ID);
        public static final UniqueKey<AdminUserRecord> KEY_ADMIN_USER_PRIMARY = Internal.createUniqueKey(AdminUser.ADMIN_USER, "KEY_admin_user_PRIMARY", AdminUser.ADMIN_USER.ID);
        public static final UniqueKey<AdminUserRoleRecord> KEY_ADMIN_USER_ROLE_PRIMARY = Internal.createUniqueKey(AdminUserRole.ADMIN_USER_ROLE, "KEY_admin_user_role_PRIMARY", AdminUserRole.ADMIN_USER_ROLE.ID);
    }
}
