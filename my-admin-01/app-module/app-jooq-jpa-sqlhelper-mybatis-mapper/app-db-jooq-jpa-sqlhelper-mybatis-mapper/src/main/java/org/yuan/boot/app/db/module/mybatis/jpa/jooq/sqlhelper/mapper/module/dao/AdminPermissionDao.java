package org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.mapper.module.dao;

import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.mapper.commons.dao.BaseDao;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.mapper.module.pojo.AdminPermission;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.mapper.module.pojo.condition.AdminPermissionQuery;
import org.yuan.boot.commons.base.module.mybatis.jpa.jooq.sqlhelper.mapper.pojo.PageResult;

import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 00:53
 */
public interface AdminPermissionDao extends BaseDao<AdminPermission> {
    PageResult<AdminPermission> selectPageByCondition(AdminPermissionQuery condition);

    List<AdminPermission> selectListByCondition(AdminPermissionQuery condition);
}
