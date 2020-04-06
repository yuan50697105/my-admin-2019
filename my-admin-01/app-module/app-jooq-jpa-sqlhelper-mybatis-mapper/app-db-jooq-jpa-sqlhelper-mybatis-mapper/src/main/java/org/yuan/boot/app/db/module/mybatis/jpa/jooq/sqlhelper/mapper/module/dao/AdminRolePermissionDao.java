package org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.mapper.module.dao;

import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.mapper.commons.dao.BaseDao;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.mapper.module.pojo.AdminRolePermission;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.mapper.module.pojo.vo.AdminRolePermissionVO;

import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 00:55
 */
public interface AdminRolePermissionDao extends BaseDao<AdminRolePermission> {
    void deleteAllByPermissionIds(List<Long> permissionIds);

    void deleteAllByRoleId(Long roleId);

    void deleteAllByRoleIds(List<Long> roleIds);

    AdminRolePermissionVO getRolePermissionByRoleId(Long roleId);
}
