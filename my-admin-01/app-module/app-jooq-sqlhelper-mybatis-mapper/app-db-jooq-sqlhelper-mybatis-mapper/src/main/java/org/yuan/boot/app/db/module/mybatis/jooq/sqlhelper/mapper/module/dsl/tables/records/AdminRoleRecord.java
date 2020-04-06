/*
 * This file is generated by jOOQ.
 */
package org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.mapper.module.dsl.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.mapper.module.dsl.tables.AdminRole;

import javax.annotation.Generated;
import java.sql.Timestamp;


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
public class AdminRoleRecord extends UpdatableRecordImpl<AdminRoleRecord> implements Record6<Long, String, String, Timestamp, Timestamp, String> {

    private static final long serialVersionUID = 1381468313;

    /**
     * Create a detached AdminRoleRecord
     */
    public AdminRoleRecord() {
        super(AdminRole.ADMIN_ROLE);
    }

    /**
     * Create a detached, initialised AdminRoleRecord
     */
    public AdminRoleRecord(Long id, String createUser, String updateUser, Timestamp createTime, Timestamp updateTime, String name) {
        super(AdminRole.ADMIN_ROLE);

        set(0, id);
        set(1, createUser);
        set(2, updateUser);
        set(3, createTime);
        set(4, updateTime);
        set(5, name);
    }

    /**
     * Getter for <code>my_admin_01.admin_role.id</code>. id
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>my_admin_01.admin_role.id</code>. id
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>my_admin_01.admin_role.create_user</code>. createUser
     */
    public String getCreateUser() {
        return (String) get(1);
    }

    /**
     * Setter for <code>my_admin_01.admin_role.create_user</code>. createUser
     */
    public void setCreateUser(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>my_admin_01.admin_role.update_user</code>. updateUser
     */
    public String getUpdateUser() {
        return (String) get(2);
    }

    /**
     * Setter for <code>my_admin_01.admin_role.update_user</code>. updateUser
     */
    public void setUpdateUser(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>my_admin_01.admin_role.create_time</code>. createTime
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>my_admin_01.admin_role.create_time</code>. createTime
     */
    public void setCreateTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>my_admin_01.admin_role.update_time</code>. updateTime
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>my_admin_01.admin_role.update_time</code>. updateTime
     */
    public void setUpdateTime(Timestamp value) {
        set(4, value);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * Getter for <code>my_admin_01.admin_role.name</code>. name
     */
    public String getName() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>my_admin_01.admin_role.name</code>. name
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
        return AdminRole.ADMIN_ROLE.ID;
    }

    @Override
    public Field<String> field2() {
        return AdminRole.ADMIN_ROLE.CREATE_USER;
    }

    @Override
    public Field<String> field3() {
        return AdminRole.ADMIN_ROLE.UPDATE_USER;
    }

    @Override
    public Field<Timestamp> field4() {
        return AdminRole.ADMIN_ROLE.CREATE_TIME;
    }

    @Override
    public Field<Timestamp> field5() {
        return AdminRole.ADMIN_ROLE.UPDATE_TIME;
    }

    @Override
    public Field<String> field6() {
        return AdminRole.ADMIN_ROLE.NAME;
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
    public AdminRoleRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AdminRoleRecord value2(String value) {
        setCreateUser(value);
        return this;
    }

    @Override
    public AdminRoleRecord value3(String value) {
        setUpdateUser(value);
        return this;
    }

    @Override
    public AdminRoleRecord value4(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public AdminRoleRecord value5(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public AdminRoleRecord value6(String value) {
        setName(value);
        return this;
    }

    @Override
    public AdminRoleRecord values(Long value1, String value2, String value3, Timestamp value4, Timestamp value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }
}
