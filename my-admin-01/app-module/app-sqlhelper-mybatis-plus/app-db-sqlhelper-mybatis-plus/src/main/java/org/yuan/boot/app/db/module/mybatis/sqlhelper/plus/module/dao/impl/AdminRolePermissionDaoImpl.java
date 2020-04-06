package org.yuan.boot.app.db.module.mybatis.sqlhelper.plus.module.dao.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.plus.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.plus.module.dao.AdminPermissionDao;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.plus.module.dao.AdminRoleDao;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.plus.module.dao.AdminRolePermissionDao;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.plus.module.mapper.AdminRolePermissionMapper;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.plus.module.pojo.AdminPermission;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.plus.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.plus.module.pojo.AdminRolePermission;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.plus.module.pojo.vo.AdminRolePermissionVO;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 00:55
 */
@Component
@AllArgsConstructor
public class AdminRolePermissionDaoImpl extends BaseDaoImpl<AdminRolePermission, AdminRolePermissionMapper> implements AdminRolePermissionDao {
    private AdminRoleDao adminRoleDao;
    private AdminPermissionDao adminPermissionDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean removeByRoleId(Long roleId) {
        return remove(query().eq("roleId", roleId));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean removeByRoleIds(List<Long> roleIds) {
        return remove(query().in("roleId", roleIds));
    }

    @Override
    public AdminRolePermissionVO getRolePermissionByRoleId(Long roleId) {
        AdminRole adminRole = adminRoleDao.getById(roleId);
        List<AdminRolePermission> adminRolePermissions = lambdaQuery().eq(AdminRolePermission::getRoleId, roleId).list();
        List<Long> permissionIds = adminRolePermissions.stream().map(AdminRolePermission::getPermissionId).collect(Collectors.toList());
        Collection<AdminPermission> adminPermissions = Collections.emptyList();
        if (!permissionIds.isEmpty()) {
            adminPermissions = adminPermissionDao.listByIds(permissionIds);
        }
        return new AdminRolePermissionVO(adminRole, adminPermissions);
    }
}