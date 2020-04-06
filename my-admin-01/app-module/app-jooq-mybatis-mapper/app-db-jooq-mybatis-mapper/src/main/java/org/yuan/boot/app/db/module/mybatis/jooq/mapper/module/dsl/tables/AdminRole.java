/*
 * This file is generated by jOOQ.
 */
package org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.dsl.tables;


import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.dsl.Indexes;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.dsl.Keys;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.dsl.MyAdmin_01;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.dsl.tables.records.AdminRoleRecord;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * admin_role
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.12.3"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class AdminRole extends TableImpl<AdminRoleRecord> {

    /**
     * The reference instance of <code>my_admin_01.admin_role</code>
     */
    public static final AdminRole ADMIN_ROLE = new AdminRole();
    private static final long serialVersionUID = 542613573;
    /**
     * The column <code>my_admin_01.admin_role.id</code>. id
     */
    public final TableField<AdminRoleRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "id");
    /**
     * The column <code>my_admin_01.admin_role.create_user</code>. createUser
     */
    public final TableField<AdminRoleRecord, String> CREATE_USER = createField(DSL.name("create_user"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "createUser");
    /**
     * The column <code>my_admin_01.admin_role.update_user</code>. updateUser
     */
    public final TableField<AdminRoleRecord, String> UPDATE_USER = createField(DSL.name("update_user"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "updateUser");
    /**
     * The column <code>my_admin_01.admin_role.create_time</code>. createTime
     */
    public final TableField<AdminRoleRecord, Timestamp> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.TIMESTAMP, this, "createTime");
    /**
     * The column <code>my_admin_01.admin_role.update_time</code>. updateTime
     */
    public final TableField<AdminRoleRecord, Timestamp> UPDATE_TIME = createField(DSL.name("update_time"), org.jooq.impl.SQLDataType.TIMESTAMP, this, "updateTime");
    /**
     * The column <code>my_admin_01.admin_role.name</code>. name
     */
    public final TableField<AdminRoleRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(50), this, "name");

    /**
     * Create a <code>my_admin_01.admin_role</code> table reference
     */
    public AdminRole() {
        this(DSL.name("admin_role"), null);
    }

    /**
     * Create an aliased <code>my_admin_01.admin_role</code> table reference
     */
    public AdminRole(String alias) {
        this(DSL.name(alias), ADMIN_ROLE);
    }

    /**
     * Create an aliased <code>my_admin_01.admin_role</code> table reference
     */
    public AdminRole(Name alias) {
        this(alias, ADMIN_ROLE);
    }

    private AdminRole(Name alias, Table<AdminRoleRecord> aliased) {
        this(alias, aliased, null);
    }

    private AdminRole(Name alias, Table<AdminRoleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("admin_role"));
    }

    public <O extends Record> AdminRole(Table<O> child, ForeignKey<O, AdminRoleRecord> key) {
        super(child, key, ADMIN_ROLE);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AdminRoleRecord> getRecordType() {
        return AdminRoleRecord.class;
    }

    @Override
    public Schema getSchema() {
        return MyAdmin_01.MY_ADMIN_01;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ADMIN_ROLE_PRIMARY);
    }

    @Override
    public UniqueKey<AdminRoleRecord> getPrimaryKey() {
        return Keys.KEY_ADMIN_ROLE_PRIMARY;
    }

    @Override
    public List<UniqueKey<AdminRoleRecord>> getKeys() {
        return Arrays.<UniqueKey<AdminRoleRecord>>asList(Keys.KEY_ADMIN_ROLE_PRIMARY);
    }

    @Override
    public AdminRole as(String alias) {
        return new AdminRole(DSL.name(alias), this);
    }

    @Override
    public AdminRole as(Name alias) {
        return new AdminRole(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AdminRole rename(String name) {
        return new AdminRole(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AdminRole rename(Name name) {
        return new AdminRole(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, String, String, Timestamp, Timestamp, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
