/*
 * This file is generated by jOOQ.
 */
package org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.dsl.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.dsl.tables.AdminUser;

import javax.annotation.Generated;
import java.sql.Timestamp;


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
public class AdminUserRecord extends UpdatableRecordImpl<AdminUserRecord> implements Record9<Long, String, String, Timestamp, Timestamp, String, String, String, Integer> {

    private static final long serialVersionUID = -38280316;

    /**
     * Create a detached AdminUserRecord
     */
    public AdminUserRecord() {
        super(AdminUser.ADMIN_USER);
    }

    /**
     * Create a detached, initialised AdminUserRecord
     */
    public AdminUserRecord(Long id, String createUser, String updateUser, Timestamp createTime, Timestamp updateTime, String username, String password, String name, Integer enabled) {
        super(AdminUser.ADMIN_USER);

        set(0, id);
        set(1, createUser);
        set(2, updateUser);
        set(3, createTime);
        set(4, updateTime);
        set(5, username);
        set(6, password);
        set(7, name);
        set(8, enabled);
    }

    /**
     * Getter for <code>my_admin_01.admin_user.id</code>. id
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>my_admin_01.admin_user.id</code>. id
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>my_admin_01.admin_user.create_user</code>. createUser
     */
    public String getCreateUser() {
        return (String) get(1);
    }

    /**
     * Setter for <code>my_admin_01.admin_user.create_user</code>. createUser
     */
    public void setCreateUser(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>my_admin_01.admin_user.update_user</code>. updateUser
     */
    public String getUpdateUser() {
        return (String) get(2);
    }

    /**
     * Setter for <code>my_admin_01.admin_user.update_user</code>. updateUser
     */
    public void setUpdateUser(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>my_admin_01.admin_user.create_time</code>. createTime
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>my_admin_01.admin_user.create_time</code>. createTime
     */
    public void setCreateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>my_admin_01.admin_user.update_time</code>. updateTime
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>my_admin_01.admin_user.update_time</code>. updateTime
     */
    public void setUpdateTime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>my_admin_01.admin_user.username</code>. username
     */
    public String getUsername() {
        return (String) get(5);
    }

    /**
     * Setter for <code>my_admin_01.admin_user.username</code>. username
     */
    public void setUsername(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>my_admin_01.admin_user.password</code>. password
     */
    public String getPassword() {
        return (String) get(6);
    }

    /**
     * Setter for <code>my_admin_01.admin_user.password</code>. password
     */
    public void setPassword(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>my_admin_01.admin_user.name</code>. name
     */
    public String getName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>my_admin_01.admin_user.name</code>. name
     */
    public void setName(String value) {
        set(7, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>my_admin_01.admin_user.enabled</code>. enabled
     */
    public Integer getEnabled() {
        return (Integer) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>my_admin_01.admin_user.enabled</code>. enabled
     */
    public void setEnabled(Integer value) {
        set(8, value);
    }

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    @Override
    public Row9<Long, String, String, Timestamp, Timestamp, String, String, String, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, String, String, Timestamp, Timestamp, String, String, String, Integer> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return AdminUser.ADMIN_USER.ID;
    }

    @Override
    public Field<String> field2() {
        return AdminUser.ADMIN_USER.CREATE_USER;
    }

    @Override
    public Field<String> field3() {
        return AdminUser.ADMIN_USER.UPDATE_USER;
    }

    @Override
    public Field<Timestamp> field4() {
        return AdminUser.ADMIN_USER.CREATE_TIME;
    }

    @Override
    public Field<Timestamp> field5() {
        return AdminUser.ADMIN_USER.UPDATE_TIME;
    }

    @Override
    public Field<String> field6() {
        return AdminUser.ADMIN_USER.USERNAME;
    }

    @Override
    public Field<String> field7() {
        return AdminUser.ADMIN_USER.PASSWORD;
    }

    @Override
    public Field<String> field8() {
        return AdminUser.ADMIN_USER.NAME;
    }

    @Override
    public Field<Integer> field9() {
        return AdminUser.ADMIN_USER.ENABLED;
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
        return getUsername();
    }

    @Override
    public String component7() {
        return getPassword();
    }

    @Override
    public String component8() {
        return getName();
    }

    @Override
    public Integer component9() {
        return getEnabled();
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
        return getUsername();
    }

    @Override
    public String value7() {
        return getPassword();
    }

    @Override
    public String value8() {
        return getName();
    }

    @Override
    public Integer value9() {
        return getEnabled();
    }

    @Override
    public AdminUserRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AdminUserRecord value2(String value) {
        setCreateUser(value);
        return this;
    }

    @Override
    public AdminUserRecord value3(String value) {
        setUpdateUser(value);
        return this;
    }

    @Override
    public AdminUserRecord value4(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public AdminUserRecord value5(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    @Override
    public AdminUserRecord value6(String value) {
        setUsername(value);
        return this;
    }

    @Override
    public AdminUserRecord value7(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public AdminUserRecord value8(String value) {
        setName(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public AdminUserRecord value9(Integer value) {
        setEnabled(value);
        return this;
    }

    @Override
    public AdminUserRecord values(Long value1, String value2, String value3, Timestamp value4, Timestamp value5, String value6, String value7, String value8, Integer value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }
}