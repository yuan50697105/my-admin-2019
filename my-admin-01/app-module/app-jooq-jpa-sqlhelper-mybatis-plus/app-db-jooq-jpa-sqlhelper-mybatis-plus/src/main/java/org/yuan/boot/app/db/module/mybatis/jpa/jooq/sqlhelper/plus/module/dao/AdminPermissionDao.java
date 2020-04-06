package org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.plus.module.dao;

import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.plus.commons.dao.BaseDao;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.plus.module.pojo.AdminPermission;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.plus.module.pojo.condition.AdminPermissionQuery;
import org.yuan.boot.commons.base.module.mybatis.jpq.jooq.sqlhelper.plus.pojo.PageResult;

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
