package org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.plus.module.dao;

import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.plus.commons.dao.BaseDao;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.plus.module.pojo.AdminUser;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.plus.module.pojo.condition.AdminUserQuery;
import org.yuan.boot.commons.base.module.mybatis.jpq.jooq.sqlhelper.plus.pojo.PageResult;

import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 00:56
 */
public interface AdminUserDao extends BaseDao<AdminUser> {
    void updateEnableByIds(List<Long> ids);

    void updateDisableByIds(List<Long> ids);

    PageResult<AdminUser> selectPageByCondition(AdminUserQuery condition);

    List<AdminUser> selectListByCondition(AdminUserQuery condition);
}
