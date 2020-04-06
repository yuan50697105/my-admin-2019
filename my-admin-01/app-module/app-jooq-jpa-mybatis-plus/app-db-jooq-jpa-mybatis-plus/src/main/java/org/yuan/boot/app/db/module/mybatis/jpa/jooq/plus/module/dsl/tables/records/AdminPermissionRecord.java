/*
 * This file is generated by jOOQ.
 */
package org.yuan.boot.app.db.module.mybatis.jpa.jooq.plus.module.dsl.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.plus.module.dsl.tables.AdminPermission;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * admin_permission
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.12.3"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class AdminPermissionRecord extends UpdatableRecordImpl<AdminPermissionRecord> implements Record6<Long, String, String, Timestamp, Timestamp, String> {

    private static final long serialVersionUID = -1398600184;

    /**
     * Create a detached AdminPermissionRecord
     */
    public AdminPermissionRecord() {
        super(AdminPermission.ADMIN_PERMISSION);
    }

    /**
     * Create a detached, initialised AdminPermissionRecord
     */
    public AdminPermissionRecord(Long id, String createUser, String updateUser, Timestamp createTime, Timestamp updateTime, String name) {
        super(AdminPermission.ADMIN_PERMISSION);

        set(0, id);
        set(1, createUser);
        set(2, updateUser);
        set(3, createTime);
        set(4, updateTime);
        set(5, name);
    }

    /**
     * Getter for <code>my_admin_01.admin_permission.id</code>. id
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>my_admin_01.admin_permission.id</code>. id
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>my_admin_01.admin_permission.create_user</code>. createUser
     */
    public String getCreateUser() {
        return (String) get(1);
    }

    /**
     * Setter for <code>my_admin_01.admin_permission.create_user</code>. createUser
     */
    public void setCreateUser(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>my_admin_01.admin_permission.update_user</code>. updateUser
     */
    public String getUpdateUser() {
        return (String) get(2);
    }

    /**
     * Setter for <code>my_admin_01.admin_permission.update_user</code>. updateUser
     */
    public void setUpdateUser(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>my_admin_01.admin_permission.create_time</code>. createTime
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>my_admin_01.admin_permission.create_time</code>. createTime
     */
    public void setCreateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>my_admin_01.admin_permission.update_time</code>. updateTime
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>my_admin_01.admin_permission.update_time</code>. updateTime
     */
    public void setUpdateTime(Timestamp value) {
        set(4, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>my_admin_01.admin_permission.name</code>. name
     */
    public String getName() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>my_admin_01.admin_permission.name</code>. name
     */
    public void setName(String value) {
        set(5, value);
    }

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    @Override
    public Row6<Long, String, String, Timestamp, Timestamp, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Long, String, String, Timestamp, Timestamp, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return AdminPermission.ADMIN_PERMISSION.ID;
    }

    @Override
    public Field<String> field2() {
        return AdminPermission.ADMIN_PERMISSION.CREATE_USER;
    }

    @Override
    public Field<String> field3() {
        return AdminPermission.ADMIN_PERMISSION.UPDATE_USER;
    }

    @Override
    public Field<Timestamp> field4() {
        return AdminPermission.ADMIN_PERMISSION.CREATE_TIME;
    }

    @Override
    public Field<Timestamp> field5() {
        return AdminPermission.ADMIN_PERMISSION.UPDATE_TIME;
    }

    @Override
    public Field<String> field6() {
        return AdminPermission.ADMIN_PERMISSION.NAME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getCreateUser();
    }

    @Override
    public String component3() {
        return getUpdateUser();
    }

    @Override
    public Timestamp component4() {
        return getCreateTime();
    }

    @Override
    public Timestamp component5() {
        return getUpdateTime();
    }

    @Override
    public String component6() {
        return getName();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getCreateUser();
    }

    @Override
    public String value3() {
        return getUpdateUser();
    }

    @Override
    public Timestamp value4() {
        return getCreateTime();
    }

    @Override
    public Timestamp value5() {
        return getUpdateTime();
    }

    @Override
    public String value6() {
        return getName();
    }

    @Override
    public AdminPermissionRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AdminPermissionRecord value2(String value) {
        setCreateUser(value);
        return this;
    }

    @Override
    public AdminPermissionRecord value3(String value) {
        setUpdateUser(value);
        return this;
    }

    @Override
    public AdminPermissionRecord value4(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public AdminPermissionRecord value5(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public AdminPermissionRecord value6(String value) {
        setName(value);
        return this;
    }

    @Override
    public AdminPermissionRecord values(Long value1, String value2, String value3, Timestamp value4, Timestamp value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }
}
