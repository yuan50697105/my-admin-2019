/*
 * This file is generated by jOOQ.
 */
package org.yuan.boot.app.db.module.mybatis.jooq.plus.module.dsl.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;
import org.yuan.boot.app.db.module.mybatis.jooq.plus.module.dsl.tables.AdminUserRole;

import javax.annotation.Generated;
import java.sql.Timestamp;


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
public class AdminUserRoleRecord extends UpdatableRecordImpl<AdminUserRoleRecord> implements Record7<Long, String, String, Timestamp, Timestamp, Long, Long> {

    private static final long serialVersionUID = 1008588618;

    /**
     * Create a detached AdminUserRoleRecord
     */
    public AdminUserRoleRecord() {
        super(AdminUserRole.ADMIN_USER_ROLE);
    }

    /**
     * Create a detached, initialised AdminUserRoleRecord
     */
    public AdminUserRoleRecord(Long id, String createUser, String updateUser, Timestamp createTime, Timestamp updateTime, Long userId, Long roleId) {
        super(AdminUserRole.ADMIN_USER_ROLE);

        set(0, id);
        set(1, createUser);
        set(2, updateUser);
        set(3, createTime);
        set(4, updateTime);
        set(5, userId);
        set(6, roleId);
    }

    /**
     * Getter for <code>my_admin_01.admin_user_role.id</code>. id
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>my_admin_01.admin_user_role.id</code>. id
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>my_admin_01.admin_user_role.create_user</code>. createUser
     */
    public String getCreateUser() {
        return (String) get(1);
    }

    /**
     * Setter for <code>my_admin_01.admin_user_role.create_user</code>. createUser
     */
    public void setCreateUser(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>my_admin_01.admin_user_role.update_user</code>. updateUser
     */
    public String getUpdateUser() {
        return (String) get(2);
    }

    /**
     * Setter for <code>my_admin_01.admin_user_role.update_user</code>. updateUser
     */
    public void setUpdateUser(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>my_admin_01.admin_user_role.create_time</code>. createTime
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>my_admin_01.admin_user_role.create_time</code>. createTime
     */
    public void setCreateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>my_admin_01.admin_user_role.update_time</code>. updateTime
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>my_admin_01.admin_user_role.update_time</code>. updateTime
     */
    public void setUpdateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>my_admin_01.admin_user_role.user_id</code>. userId
     */
    public Long getUserId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>my_admin_01.admin_user_role.user_id</code>. userId
     */
    public void setUserId(Long value) {
        set(5, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>my_admin_01.admin_user_role.role_id</code>. roleId
     */
    public Long getRoleId() {
        return (Long) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>my_admin_01.admin_user_role.role_id</code>. roleId
     */
    public void setRoleId(Long value) {
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
        return AdminUserRole.ADMIN_USER_ROLE.ID;
    }

    @Override
    public Field<String> field2() {
        return AdminUserRole.ADMIN_USER_ROLE.CREATE_USER;
    }

    @Override
    public Field<String> field3() {
        return AdminUserRole.ADMIN_USER_ROLE.UPDATE_USER;
    }

    @Override
    public Field<Timestamp> field4() {
        return AdminUserRole.ADMIN_USER_ROLE.CREATE_TIME;
    }

    @Override
    public Field<Timestamp> field5() {
        return AdminUserRole.ADMIN_USER_ROLE.UPDATE_TIME;
    }

    @Override
    public Field<Long> field6() {
        return AdminUserRole.ADMIN_USER_ROLE.USER_ID;
    }

    @Override
    public Field<Long> field7() {
        return AdminUserRole.ADMIN_USER_ROLE.ROLE_ID;
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
        return getUserId();
    }

    @Override
    public Long component7() {
        return getRoleId();
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
        return getUserId();
    }

    @Override
    public Long value7() {
        return getRoleId();
    }

    @Override
    public AdminUserRoleRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AdminUserRoleRecord value2(String value) {
        setCreateUser(value);
        return this;
    }

    @Override
    public AdminUserRoleRecord value3(String value) {
        setUpdateUser(value);
        return this;
    }

    @Override
    public AdminUserRoleRecord value4(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public AdminUserRoleRecord value5(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    @Override
    public AdminUserRoleRecord value6(Long value) {
        setUserId(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public AdminUserRoleRecord value7(Long value) {
        setRoleId(value);
        return this;
    }

    @Override
    public AdminUserRoleRecord values(Long value1, String value2, String value3, Timestamp value4, Timestamp value5, Long value6, Long value7) {
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
