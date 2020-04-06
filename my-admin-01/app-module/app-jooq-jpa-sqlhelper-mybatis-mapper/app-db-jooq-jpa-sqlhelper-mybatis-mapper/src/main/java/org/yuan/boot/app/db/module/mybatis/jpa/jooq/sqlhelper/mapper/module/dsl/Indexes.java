/*
 * This file is generated by jOOQ.
 */
package org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.mapper.module.dsl;


import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.mapper.module.dsl.tables.*;

import javax.annotation.Generated;


/**
 * A class modelling indexes of tables of the <code>my_admin_01</code> schema.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.12.3"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index ADMIN_PERMISSION_PRIMARY = Indexes0.ADMIN_PERMISSION_PRIMARY;
    public static final Index ADMIN_ROLE_PRIMARY = Indexes0.ADMIN_ROLE_PRIMARY;
    public static final Index ADMIN_ROLE_PERMISSION_PRIMARY = Indexes0.ADMIN_ROLE_PERMISSION_PRIMARY;
    public static final Index ADMIN_USER_PRIMARY = Indexes0.ADMIN_USER_PRIMARY;
    public static final Index ADMIN_USER_ROLE_PRIMARY = Indexes0.ADMIN_USER_ROLE_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index ADMIN_PERMISSION_PRIMARY = Internal.createIndex("PRIMARY", AdminPermission.ADMIN_PERMISSION, new OrderField[]{AdminPermission.ADMIN_PERMISSION.ID}, true);
        public static Index ADMIN_ROLE_PRIMARY = Internal.createIndex("PRIMARY", AdminRole.ADMIN_ROLE, new OrderField[]{AdminRole.ADMIN_ROLE.ID}, true);
        public static Index ADMIN_ROLE_PERMISSION_PRIMARY = Internal.createIndex("PRIMARY", AdminRolePermission.ADMIN_ROLE_PERMISSION, new OrderField[]{AdminRolePermission.ADMIN_ROLE_PERMISSION.ID}, true);
        public static Index ADMIN_USER_PRIMARY = Internal.createIndex("PRIMARY", AdminUser.ADMIN_USER, new OrderField[]{AdminUser.ADMIN_USER.ID}, true);
        public static Index ADMIN_USER_ROLE_PRIMARY = Internal.createIndex("PRIMARY", AdminUserRole.ADMIN_USER_ROLE, new OrderField[]{AdminUserRole.ADMIN_USER_ROLE.ID}, true);
    }
}
