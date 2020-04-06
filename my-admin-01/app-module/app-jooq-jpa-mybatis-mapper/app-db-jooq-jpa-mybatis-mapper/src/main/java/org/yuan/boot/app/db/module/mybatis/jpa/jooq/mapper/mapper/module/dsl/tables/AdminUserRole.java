/*
 * This file is generated by jOOQ.
 */
package org.yuan.boot.app.db.module.mybatis.jpa.jooq.mapper.mapper.module.dsl.tables;


import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.mapper.mapper.module.dsl.Indexes;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.mapper.mapper.module.dsl.Keys;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.mapper.mapper.module.dsl.MyAdmin_01;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.mapper.mapper.module.dsl.tables.records.AdminUserRoleRecord;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * admin_user_role
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.12.3"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class AdminUserRole extends TableImpl<AdminUserRoleRecord> {

    /**
     * The reference instance of <code>my_admin_01.admin_user_role</code>
     */
    public static final AdminUserRole ADMIN_USER_ROLE = new AdminUserRole();
    private static final long serialVersionUID = 750011498;
    /**
     * The column <code>my_admin_01.admin_user_role.id</code>. id
     */
    public final TableField<AdminUserRoleRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "id");
    /**
     * The column <code>my_admin_01.admin_user_role.create_user</code>. createUser
     */
    public final TableField<AdminUserRoleRecord, String> CREATE_USER = createField(DSL.name("create_user"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "createUser");
    /**
     * The column <code>my_admin_01.admin_user_role.update_user</code>. updateUser
     */
    public final TableField<AdminUserRoleRecord, String> UPDATE_USER = createField(DSL.name("update_user"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "updateUser");
    /**
     * The column <code>my_admin_01.admin_user_role.create_time</code>. createTime
     */
    public final TableField<AdminUserRoleRecord, Timestamp> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.TIMESTAMP, this, "createTime");
    /**
     * The column <code>my_admin_01.admin_user_role.update_time</code>. updateTime
     */
    public final TableField<AdminUserRoleRecord, Timestamp> UPDATE_TIME = createField(DSL.name("update_time"), org.jooq.impl.SQLDataType.TIMESTAMP, this, "updateTime");
    /**
     * The column <code>my_admin_01.admin_user_role.user_id</code>. userId
     */
    public final TableField<AdminUserRoleRecord, Long> USER_ID = createField(DSL.name("user_id"), org.jooq.impl.SQLDataType.BIGINT, this, "userId");
    /**
     * The column <code>my_admin_01.admin_user_role.role_id</code>. roleId
     */
    public final TableField<AdminUserRoleRecord, Long> ROLE_ID = createField(DSL.name("role_id"), org.jooq.impl.SQLDataType.BIGINT, this, "roleId");

    /**
     * Create a <code>my_admin_01.admin_user_role</code> table reference
     */
    public AdminUserRole() {
        this(DSL.name("admin_user_role"), null);
    }

    /**
     * Create an aliased <code>my_admin_01.admin_user_role</code> table reference
     */
    public AdminUserRole(String alias) {
        this(DSL.name(alias), ADMIN_USER_ROLE);
    }

    /**
     * Create an aliased <code>my_admin_01.admin_user_role</code> table reference
     */
    public AdminUserRole(Name alias) {
        this(alias, ADMIN_USER_ROLE);
    }

    private AdminUserRole(Name alias, Table<AdminUserRoleRecord> aliased) {
        this(alias, aliased, null);
    }

    private AdminUserRole(Name alias, Table<AdminUserRoleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("admin_user_role"));
    }

    public <O extends Record> AdminUserRole(Table<O> child, ForeignKey<O, AdminUserRoleRecord> key) {
        super(child, key, ADMIN_USER_ROLE);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AdminUserRoleRecord> getRecordType() {
        return AdminUserRoleRecord.class;
    }

    @Override
    public Schema getSchema() {
        return MyAdmin_01.MY_ADMIN_01;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ADMIN_USER_ROLE_PRIMARY);
    }

    @Override
    public UniqueKey<AdminUserRoleRecord> getPrimaryKey() {
        return Keys.KEY_ADMIN_USER_ROLE_PRIMARY;
    }

    @Override
    public List<UniqueKey<AdminUserRoleRecord>> getKeys() {
        return Arrays.<UniqueKey<AdminUserRoleRecord>>asList(Keys.KEY_ADMIN_USER_ROLE_PRIMARY);
    }

    @Override
    public AdminUserRole as(String alias) {
        return new AdminUserRole(DSL.name(alias), this);
    }

    @Override
    public AdminUserRole as(Name alias) {
        return new AdminUserRole(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AdminUserRole rename(String name) {
        return new AdminUserRole(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AdminUserRole rename(Name name) {
        return new AdminUserRole(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, String, String, Timestamp, Timestamp, Long, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
