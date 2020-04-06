package org.yuan.boot.app.db.module.mybatis.sqlhelper.base.module.dao;

import org.yuan.boot.app.db.module.mybatis.sqlhelper.base.commons.dao.BaseDao;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.base.module.pojo.AdminRolePermission;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.base.module.pojo.vo.AdminRolePermissionVO;

import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 00:55
 */
public interface AdminRolePermissionDao extends BaseDao<AdminRolePermission> {
    void batchInsert(List<AdminRolePermission> adminRolePermissions);

    void deleteByRoleId(Long roleId);

    void deleteByRoleIds(List<Long> roleIds);

    void deleteByPermissionIds(List<Long> permissionIds);

    List<AdminRolePermission> selectByRoleId(Long roleId);

    AdminRolePermissionVO getRolePermissionByRoleId(Long roleId);
}
