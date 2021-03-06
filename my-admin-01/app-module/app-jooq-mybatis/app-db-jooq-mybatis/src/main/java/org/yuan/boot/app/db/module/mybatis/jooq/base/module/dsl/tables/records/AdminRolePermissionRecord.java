/*
 * This file is generated by jOOQ.
 */
package org.yuan.boot.app.db.module.mybatis.jooq.base.module.dsl.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;
import org.yuan.boot.app.db.module.mybatis.jooq.base.module.dsl.tables.AdminRolePermission;

import javax.annotation.Generated;
import java.sql.Timestamp;


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
public class AdminRolePermissionRecord extends UpdatableRecordImpl<AdminRolePermissionRecord> implements Record7<Long, String, String, Timestamp, Timestamp, Long, Long> {

    private static final long serialVersionUID = -1956445750;

    /**
     * Create a detached AdminRolePermissionRecord
     */
    public AdminRolePermissionRecord() {
        super(AdminRolePermission.ADMIN_ROLE_PERMISSION);
    }

    /**
     * Create a detached, initialised AdminRolePermissionRecord
     */
    public AdminRolePermissionRecord(Long id, String createUser, String updateUser, Timestamp createTime, Timestamp updateTime, Long roleId, Long permissionId) {
        super(AdminRolePermission.ADMIN_ROLE_PERMISSION);

        set(0, id);
        set(1, createUser);
        set(2, updateUser);
        set(3, createTime);
        set(4, updateTime);
        set(5, roleId);
        set(6, permissionId);
    }

    /**
     * Getter for <code>my_admin_01.admin_role_permission.id</code>. id
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>my_admin_01.admin_role_permission.id</code>. id
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>my_admin_01.admin_role_permission.create_user</code>. createUser
     */
    public String getCreateUser() {
        return (String) get(1);
    }

    /**
     * Setter for <code>my_admin_01.admin_role_permission.create_user</code>. createUser
     */
    public void setCreateUser(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>my_admin_01.admin_role_permission.update_user</code>. updateUser
     */
    public String getUpdateUser() {
        return (String) get(2);
    }

    /**
     * Setter for <code>my_admin_01.admin_role_permission.update_user</code>. updateUser
     */
    public void setUpdateUser(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>my_admin_01.admin_role_permission.create_time</code>. createTime
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>my_admin_01.admin_role_permission.create_time</code>. createTime
     */
    public void setCreateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>my_admin_01.admin_role_permission.update_time</code>. updateTime
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>my_admin_01.admin_role_permission.update_time</code>. updateTime
     */
    public void setUpdateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>my_admin_01.admin_role_permission.role_id</code>. roleId
     */
    public Long getRoleId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>my_admin_01.admin_role_permission.role_id</code>. roleId
     */
    public void setRoleId(Long value) {
        set(5, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>my_admin_01.admin_role_permission.permission_id</code>. permissionId
     */
    public Long getPermissionId() {
        return (Long) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>my_admin_01.admin_role_permission.permission_id</code>. permissionId
     */
    public void setPermissionId(Long value) {
        set(6, value);
    }

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    @Override
    public Row7<Long, String, String, Timestamp, Timestamp, Long, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Long, String, String, Timestamp, Timestamp, Long, Long> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return AdminRolePermission.ADMIN_ROLE_PERMISSION.ID;
    }

    @Override
    public Field<String> field2() {
        return AdminRolePermission.ADMIN_ROLE_PERMISSION.CREATE_USER;
    }

    @Override
    public Field<String> field3() {
        return AdminRolePermission.ADMIN_ROLE_PERMISSION.UPDATE_USER;
    }

    @Override
    public Field<Timestamp> field4() {
        return AdminRolePermission.ADMIN_ROLE_PERMISSION.CREATE_TIME;
    }

    @Override
    public Field<Timestamp> field5() {
        return AdminRolePermission.ADMIN_ROLE_PERMISSION.UPDATE_TIME;
    }

    @Override
    public Field<Long> field6() {
        return AdminRolePermission.ADMIN_ROLE_PERMISSION.ROLE_ID;
    }

    @Override
    public Field<Long> field7() {
        return AdminRolePermission.ADMIN_ROLE_PERMISSION.PERMISSION_ID;
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
    public Long component6() {
        return getRoleId();
    }

    @Override
    public Long component7() {
        return getPermissionId();
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
    public Long value6() {
        return getRoleId();
    }

    @Override
    public Long value7() {
        return getPermissionId();
    }

    @Override
    public AdminRolePermissionRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AdminRolePermissionRecord value2(String value) {
        setCreateUser(value);
        return this;
    }

    @Override
    public AdminRolePermissionRecord value3(String value) {
        setUpdateUser(value);
        return this;
    }

    @Override
    public AdminRolePermissionRecord value4(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public AdminRolePermissionRecord value5(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    @Override
    public AdminRolePermissionRecord value6(Long value) {
        setRoleId(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public AdminRolePermissionRecord value7(Long value) {
        setPermissionId(value);
        return this;
    }

    @Override
    public AdminRolePermissionRecord values(Long value1, String value2, String value3, Timestamp value4, Timestamp value5, Long value6, Long value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }
}
