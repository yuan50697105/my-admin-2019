package org.yuan.boot.app.db.module.mybatis.mapper.module.dao.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.app.db.module.mybatis.mapper.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.app.db.module.mybatis.mapper.module.dao.AdminPermissionDao;
import org.yuan.boot.app.db.module.mybatis.mapper.module.dao.AdminRoleDao;
import org.yuan.boot.app.db.module.mybatis.mapper.module.dao.AdminRolePermissionDao;
import org.yuan.boot.app.db.module.mybatis.mapper.module.mapper.AdminRolePermissionMapper;
import org.yuan.boot.app.db.module.mybatis.mapper.module.pojo.AdminPermission;
import org.yuan.boot.app.db.module.mybatis.mapper.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.mapper.module.pojo.AdminRolePermission;
import org.yuan.boot.app.db.module.mybatis.mapper.module.pojo.vo.AdminRolePermissionVO;
import tk.mybatis.mapper.util.Sqls;

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
    public void batchInsert(List<AdminRolePermission> adminRolePermissions) {
        adminRolePermissions.forEach(this::insert);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByRoleId(Long roleId) {
        deleteByExample(exampleBuilder().where(Sqls.custom().andEqualTo("roleId", roleId)).build());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByRoleIds(List<Long> roleIds) {
        deleteByExample(exampleBuilder().where(Sqls.custom().andIn("roleId", roleIds)).build());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByPermissionIds(List<Long> permissionIds) {
        deleteByExample(exampleBuilder().where(Sqls.custom().andIn("permissionId", permissionIds)).build());
    }

    @Override
    public AdminRolePermissionVO getRolePermissionByRoleId(Long roleId) {
        AdminRole adminRole = adminRoleDao.selectByPrimaryKey(roleId);
        List<AdminRolePermission> adminRolePermissions = baseMapper.selectByRoleId(roleId);
        List<Long> permissionIds = adminRolePermissions.stream().map(AdminRolePermission::getPermissionId).collect(Collectors.toList());
        List<AdminPermission> adminPermissions = Collections.emptyList();
        if (!permissionIds.isEmpty()) {
            adminPermissions = adminPermissionDao.selectByExample(exampleBuilder().where(Sqls.custom().andIn("permissionId", permissionIds)).build());
        }
        return new AdminRolePermissionVO(adminRole, adminPermissions);
    }
}