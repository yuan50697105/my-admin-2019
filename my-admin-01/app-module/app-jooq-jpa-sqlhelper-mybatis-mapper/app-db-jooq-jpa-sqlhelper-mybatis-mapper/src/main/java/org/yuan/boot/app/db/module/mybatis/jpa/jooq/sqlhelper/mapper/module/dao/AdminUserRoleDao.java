package org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.mapper.module.dao;

import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.mapper.commons.dao.BaseDao;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.mapper.module.pojo.AdminUserRole;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.mapper.module.pojo.vo.AdminUserRoleVO;

import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 00:56
 */
public interface AdminUserRoleDao extends BaseDao<AdminUserRole> {
    void deleteByRoleIds(List<Long> roleIds);

    void deleteAllByUserId(Long userId);

    void deleteAllByUserIds(List<Long> userIds);

    AdminUserRoleVO getUserRoleByUserId(Long userId);
}
