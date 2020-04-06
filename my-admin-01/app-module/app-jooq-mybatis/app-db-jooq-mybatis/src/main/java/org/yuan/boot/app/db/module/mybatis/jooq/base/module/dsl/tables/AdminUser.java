/*
 * This file is generated by jOOQ.
 */
package org.yuan.boot.app.db.module.mybatis.jooq.base.module.dsl.tables;


import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.yuan.boot.app.db.module.mybatis.jooq.base.module.dsl.Indexes;
import org.yuan.boot.app.db.module.mybatis.jooq.base.module.dsl.Keys;
import org.yuan.boot.app.db.module.mybatis.jooq.base.module.dsl.MyAdmin_01;
import org.yuan.boot.app.db.module.mybatis.jooq.base.module.dsl.tables.records.AdminUserRecord;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * admin_user
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.12.3"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class AdminUser extends TableImpl<AdminUserRecord> {

    /**
     * The reference instance of <code>my_admin_01.admin_user</code>
     */
    public static final AdminUser ADMIN_USER = new AdminUser();
    private static final long serialVersionUID = 1994323450;
    /**
     * The column <code>my_admin_01.admin_user.id</code>. id
     */
    public final TableField<AdminUserRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "id");
    /**
     * The column <code>my_admin_01.admin_user.create_user</code>. createUser
     */
    public final TableField<AdminUserRecord, String> CREATE_USER = createField(DSL.name("create_user"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "createUser");
    /**
     * The column <code>my_admin_01.admin_user.update_user</code>. updateUser
     */
    public final TableField<AdminUserRecord, String> UPDATE_USER = createField(DSL.name("update_user"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "updateUser");
    /**
     * The column <code>my_admin_01.admin_user.create_time</code>. createTime
     */
    public final TableField<AdminUserRecord, Timestamp> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.TIMESTAMP, this, "createTime");
    /**
     * The column <code>my_admin_01.admin_user.update_time</code>. updateTime
     */
    public final TableField<AdminUserRecord, Timestamp> UPDATE_TIME = createField(DSL.name("update_time"), org.jooq.impl.SQLDataType.TIMESTAMP, this, "updateTime");
    /**
     * The column <code>my_admin_01.admin_user.username</code>. username
     */
    public final TableField<AdminUserRecord, String> USERNAME = createField(DSL.name("username"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "username");
    /**
     * The column <code>my_admin_01.admin_user.password</code>. password
     */
    public final TableField<AdminUserRecord, String> PASSWORD = createField(DSL.name("password"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "password");
    /**
     * The column <code>my_admin_01.admin_user.name</code>. name
     */
    public final TableField<AdminUserRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "name");
    /**
     * The column <code>my_admin_01.admin_user.enabled</code>. enabled
     */
    public final TableField<AdminUserRecord, Integer> ENABLED = createField(DSL.name("enabled"), org.jooq.impl.SQLDataType.INTEGER, this, "enabled");

    /**
     * Create a <code>my_admin_01.admin_user</code> table reference
     */
    public AdminUser() {
        this(DSL.name("admin_user"), null);
    }

    /**
     * Create an aliased <code>my_admin_01.admin_user</code> table reference
     */
    public AdminUser(String alias) {
        this(DSL.name(alias), ADMIN_USER);
    }

    /**
     * Create an aliased <code>my_admin_01.admin_user</code> table reference
     */
    public AdminUser(Name alias) {
        this(alias, ADMIN_USER);
    }

    private AdminUser(Name alias, Table<AdminUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private AdminUser(Name alias, Table<AdminUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("admin_user"));
    }

    public <O extends Record> AdminUser(Table<O> child, ForeignKey<O, AdminUserRecord> key) {
        super(child, key, ADMIN_USER);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AdminUserRecord> getRecordType() {
        return AdminUserRecord.class;
    }

    @Override
    public Schema getSchema() {
        return MyAdmin_01.MY_ADMIN_01;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ADMIN_USER_PRIMARY);
    }

    @Override
    public UniqueKey<AdminUserRecord> getPrimaryKey() {
        return Keys.KEY_ADMIN_USER_PRIMARY;
    }

    @Override
    public List<UniqueKey<AdminUserRecord>> getKeys() {
        return Arrays.<UniqueKey<AdminUserRecord>>asList(Keys.KEY_ADMIN_USER_PRIMARY);
    }

    @Override
    public AdminUser as(String alias) {
        return new AdminUser(DSL.name(alias), this);
    }

    @Override
    public AdminUser as(Name alias) {
        return new AdminUser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AdminUser rename(String name) {
        return new AdminUser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AdminUser rename(Name name) {
        return new AdminUser(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, String, String, Timestamp, Timestamp, String, String, String, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
