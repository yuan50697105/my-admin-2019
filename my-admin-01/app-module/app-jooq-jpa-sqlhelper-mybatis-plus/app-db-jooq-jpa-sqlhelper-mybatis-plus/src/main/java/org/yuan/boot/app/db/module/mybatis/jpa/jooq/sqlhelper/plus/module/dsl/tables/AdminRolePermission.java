/*
 * This file is generated by jOOQ.
 */
package org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.plus.module.dsl.tables;


import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.plus.module.dsl.Indexes;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.plus.module.dsl.Keys;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.plus.module.dsl.MyAdmin_01;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.plus.module.dsl.tables.records.AdminRolePermissionRecord;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * admin_role_permission
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.12.3"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class AdminRolePermission extends TableImpl<AdminRolePermissionRecord> {

    /**
     * The reference instance of <code>my_admin_01.admin_role_permission</code>
     */
    public static final AdminRolePermission ADMIN_ROLE_PERMISSION = new AdminRolePermission();
    private static final long serialVersionUID = -1141867346;
    /**
     * The column <code>my_admin_01.admin_role_permission.id</code>. id
     */
    public final TableField<AdminRolePermissionRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "id");
    /**
     * The column <code>my_admin_01.admin_role_permission.create_user</code>. createUser
     */
    public final TableField<AdminRolePermissionRecord, String> CREATE_USER = createField(DSL.name("create_user"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "createUser");
    /**
     * The column <code>my_admin_01.admin_role_permission.update_user</code>. updateUser
     */
    public final TableField<AdminRolePermissionRecord, String> UPDATE_USER = createField(DSL.name("update_user"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "updateUser");
    /**
     * The column <code>my_admin_01.admin_role_permission.create_time</code>. createTime
     */
    public final TableField<AdminRolePermissionRecord, Timestamp> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.TIMESTAMP, this, "createTime");
    /**
     * The column <code>my_admin_01.admin_role_permission.update_time</code>. updateTime
     */
    public final TableField<AdminRolePermissionRecord, Timestamp> UPDATE_TIME = createField(DSL.name("update_time"), org.jooq.impl.SQLDataType.TIMESTAMP, this, "updateTime");
    /**
     * The column <code>my_admin_01.admin_role_permission.role_id</code>. roleId
     */
    public final TableField<AdminRolePermissionRecord, Long> ROLE_ID = createField(DSL.name("role_id"), org.jooq.impl.SQLDataType.BIGINT, this, "roleId");
    /**
     * The column <code>my_admin_01.admin_role_permission.permission_id</code>. permissionId
     */
    public final TableField<AdminRolePermissionRecord, Long> PERMISSION_ID = createField(DSL.name("permission_id"), org.jooq.impl.SQLDataType.BIGINT, this, "permissionId");

    /**
     * Create a <code>my_admin_01.admin_role_permission</code> table reference
     */
    public AdminRolePermission() {
        this(DSL.name("admin_role_permission"), null);
    }

    /**
     * Create an aliased <code>my_admin_01.admin_role_permission</code> table reference
     */
    public AdminRolePermission(String alias) {
        this(DSL.name(alias), ADMIN_ROLE_PERMISSION);
    }

    /**
     * Create an aliased <code>my_admin_01.admin_role_permission</code> table reference
     */
    public AdminRolePermission(Name alias) {
        this(alias, ADMIN_ROLE_PERMISSION);
    }

    private AdminRolePermission(Name alias, Table<AdminRolePermissionRecord> aliased) {
        this(alias, aliased, null);
    }

    private AdminRolePermission(Name alias, Table<AdminRolePermissionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("admin_role_permission"));
    }

    public <O extends Record> AdminRolePermission(Table<O> child, ForeignKey<O, AdminRolePermissionRecord> key) {
        super(child, key, ADMIN_ROLE_PERMISSION);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AdminRolePermissionRecord> getRecordType() {
        return AdminRolePermissionRecord.class;
    }

    @Override
    public Schema getSchema() {
        return MyAdmin_01.MY_ADMIN_01;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ADMIN_ROLE_PERMISSION_PRIMARY);
    }

    @Override
    public UniqueKey<AdminRolePermissionRecord> getPrimaryKey() {
        return Keys.KEY_ADMIN_ROLE_PERMISSION_PRIMARY;
    }

    @Override
    public List<UniqueKey<AdminRolePermissionRecord>> getKeys() {
        return Arrays.<UniqueKey<AdminRolePermissionRecord>>asList(Keys.KEY_ADMIN_ROLE_PERMISSION_PRIMARY);
    }

    @Override
    public AdminRolePermission as(String alias) {
        return new AdminRolePermission(DSL.name(alias), this);
    }

    @Override
    public AdminRolePermission as(Name alias) {
        return new AdminRolePermission(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AdminRolePermission rename(String name) {
        return new AdminRolePermission(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AdminRolePermission rename(Name name) {
        return new AdminRolePermission(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, String, String, Timestamp, Timestamp, Long, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}