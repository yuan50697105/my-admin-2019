package org.yuan.boot.app.db.module.mybatis.mapper.module.dao;

import org.yuan.boot.app.db.module.mybatis.mapper.commons.dao.BaseDao;
import org.yuan.boot.app.db.module.mybatis.mapper.module.pojo.AdminUser;
import org.yuan.boot.app.db.module.mybatis.mapper.module.pojo.condition.AdminUserQuery;
import org.yuan.boot.commons.base.module.mybatis.mapper.pojo.PageResult;

import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 00:56
 */
public interface AdminUserDao extends BaseDao<AdminUser> {
    PageResult<AdminUser> selectPageByCondition(AdminUserQuery condition);

    List<AdminUser> selectListByCondition(AdminUserQuery condition);
}
