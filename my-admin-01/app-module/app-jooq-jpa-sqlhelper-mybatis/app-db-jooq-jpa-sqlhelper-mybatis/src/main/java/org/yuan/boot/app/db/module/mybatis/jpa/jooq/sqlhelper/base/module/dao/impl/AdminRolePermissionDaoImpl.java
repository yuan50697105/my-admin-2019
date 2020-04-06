package org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.base.module.dao.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.base.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.base.module.dao.AdminPermissionDao;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.base.module.dao.AdminRoleDao;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.base.module.dao.AdminRolePermissionDao;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.base.module.mapper.AdminRolePermissionMapper;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.base.module.pojo.AdminPermission;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.base.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.base.module.pojo.AdminRolePermission;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.base.module.pojo.vo.AdminRolePermissionVO;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.base.module.repository.AdminRolePermissionRepository;

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
@Transactional(rollbackFor = Exception.class)
public class AdminRolePermissionDaoImpl extends BaseDaoImpl<AdminRolePermission, AdminRolePermissionRepository, AdminRolePermissionMapper> implements AdminRolePermissionDao {
    private AdminRoleDao adminRoleDao;
    private AdminPermissionDao adminPermissionDao;

    @Override
    public void deleteAllByPermissionIds(List<Long> permissionIds) {
        baseRepository.deleteAllByPermissionIdIn(permissionIds);
    }

    @Override
    public void deleteAllByRoleId(Long roleId) {
        baseRepository.deleteAllByRoleId(roleId);
    }

    @Override
    public void deleteAllByRoleIds(List<Long> roleIds) {
        baseRepository.deleteAllByRoleIdIn(roleIds);
    }

    @Override
    public AdminRolePermissionVO getRolePermissionByRoleId(Long roleId) {
        AdminRole adminRole = adminRoleDao.findById(roleId).orElse(AdminRole.builder().build());
        List<AdminRolePermission> adminRolePermissions = baseRepository.findAllByRoleIdEquals(roleId);
        List<Long> permissionIds = adminRolePermissions.stream().map(AdminRolePermission::getPermissionId).collect(Collectors.toList());
        List<AdminPermission> adminPermissions = adminPermissionDao.findAllById(permissionIds);
        return new AdminRolePermissionVO(adminRole, adminPermissions);
    }
}