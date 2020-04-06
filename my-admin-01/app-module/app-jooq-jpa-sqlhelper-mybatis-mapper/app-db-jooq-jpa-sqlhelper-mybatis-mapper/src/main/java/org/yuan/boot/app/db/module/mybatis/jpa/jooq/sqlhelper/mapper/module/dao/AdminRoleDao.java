package org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.mapper.module.dao;

import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.mapper.commons.dao.BaseDao;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.mapper.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.mapper.module.pojo.condition.AdminRoleQuery;
import org.yuan.boot.commons.base.module.mybatis.jpa.jooq.sqlhelper.mapper.pojo.PageResult;

import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 00:54
 */
public interface AdminRoleDao extends BaseDao<AdminRole> {
    PageResult<AdminRole> selectPageByCondition(AdminRoleQuery condition);

    List<AdminRole> selectListByCondition(AdminRoleQuery condition);
}
