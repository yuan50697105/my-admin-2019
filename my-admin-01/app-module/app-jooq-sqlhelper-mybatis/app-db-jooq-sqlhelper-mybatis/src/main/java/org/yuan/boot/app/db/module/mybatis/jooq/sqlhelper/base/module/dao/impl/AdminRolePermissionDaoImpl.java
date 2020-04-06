package org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.dao.impl;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.dao.AdminPermissionDao;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.dao.AdminRoleDao;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.dao.AdminRolePermissionDao;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.mapper.AdminRolePermissionMapper;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.pojo.AdminPermission;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.pojo.AdminRolePermission;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.pojo.vo.AdminRolePermissionVO;

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
public class AdminRolePermissionDaoImpl extends BaseDaoImpl<AdminRolePermission, AdminRolePermissionMapper> implements AdminRolePermissionDao {
    private AdminRoleDao adminRoleDao;
    private AdminPermissionDao adminPermissionDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void batchInsert(List<AdminRolePermission> adminRolePermissions) {
        adminRolePermissions.forEach(baseMapper::insert);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByRoleId(Long roleId) {
        baseMapper.deleteByRoleId(roleId);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByRoleIds(List<Long> roleIds) {
        baseMapper.deleteByRoleIdIn(roleIds);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByPermissionIds(List<Long> permissionIds) {
        baseMapper.deleteByPermissionIdIn(permissionIds);
    }

    @Override
    public List<AdminRolePermission> selectByRoleId(Long roleId) {
        return baseMapper.selectByRoleId(roleId);
    }

    @Override
    public AdminRolePermissionVO getRolePermissionByRoleId(Long roleId) {
        AdminRole adminRole = adminRoleDao.selectById(roleId);
        List<AdminRolePermission> adminRolePermissions = baseMapper.selectByRoleId(roleId);
        List<Long> permissionIds = adminRolePermissions.stream().map(AdminRolePermission::getPermissionId).collect(Collectors.toList());
        List<AdminPermission> adminPermissions = Collections.emptyList();
        if (permissionIds.isEmpty()) {
            adminPermissions = adminPermissionDao.selectByIds(permissionIds);
        }
        return new AdminRolePermissionVO(adminRole, adminPermissions);

    }
}