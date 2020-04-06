package org.yuan.boot.app.admin.module.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.app.admin.module.converter.AdminRoleConverter;
import org.yuan.boot.app.admin.module.pojo.AdminRoleFormVO;
import org.yuan.boot.app.admin.module.service.AdminRoleService;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.dao.AdminPermissionDao;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.dao.AdminRoleDao;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.dao.AdminRolePermissionDao;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.dao.AdminUserRoleDao;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.pojo.AdminPermission;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.pojo.AdminRolePermission;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.pojo.condition.AdminRoleQuery;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.pojo.vo.AdminRolePermissionVO;
import org.yuan.boot.commons.base.module.mybatis.jpa.sqlhelper.mapper.pojo.PageResult;
import org.yuan.boot.commons.pojo.ConditionPageResult;
import org.yuan.boot.commons.pojo.Result;

import java.util.List;
import java.util.Optional;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 01:17
 */
@Service
@AllArgsConstructor
public class AdminRoleServiceImpl implements AdminRoleService {
    private AdminRoleConverter adminRoleConverter;
    private AdminRoleDao adminRoleDao;
    private AdminPermissionDao adminPermissionDao;
    private AdminRolePermissionDao adminRolePermissionDao;
    private AdminUserRoleDao adminUserRoleDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<?> add(AdminRoleFormVO adminRoleFormVO) {
        AdminRole adminRole = adminRoleConverter.addRole(adminRoleFormVO);
        adminRoleDao.saveOne(adminRole);
        List<AdminPermission> adminPermissions = adminPermissionDao.findAllById(adminRoleFormVO.getPermissionIds());
        List<AdminRolePermission> adminRolePermissions = adminRoleConverter.addRolePermissionList(adminRole, adminPermissions);
        adminRolePermissionDao.saveAll(adminRolePermissions);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<?> update(AdminRoleFormVO adminRoleFormVO) {
        Optional<AdminRole> optional = adminRoleDao.findById(adminRoleFormVO.getId());
        if (optional.isPresent()) {
            AdminRole adminRole = optional.get();
            adminRole.copyFrom(adminRoleFormVO, AdminRole.class);
            adminRoleDao.saveOne(adminRole);
        }
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<?> updatePermission(AdminRoleFormVO adminRoleFormVO) {
        Long roleId = adminRoleFormVO.getId();
        List<Long> permissionIds = adminRoleFormVO.getPermissionIds();
        adminRolePermissionDao.deleteAllByRoleId(roleId);
        AdminRole adminRole = adminRoleDao.findById(roleId).orElse(null);
        List<AdminPermission> adminPermissions = adminPermissionDao.findAllById(permissionIds);
        List<AdminRolePermission> adminRolePermissions = adminRoleConverter.addRolePermissionList(adminRole, adminPermissions);
        adminRolePermissionDao.saveAll(adminRolePermissions);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<?> deleteByIds(List<Long> ids) {
        adminRoleDao.deleteAllById(ids);
        adminUserRoleDao.deleteByRoleIds(ids);
        adminRolePermissionDao.deleteAllByRoleIds(ids);
        return Result.ok();
    }

    @Override
    public Result<?> data(AdminRoleQuery condition) {
        PageResult<AdminRole> pageResult = adminRoleDao.selectPageByCondition(condition);
        ConditionPageResult<AdminRole, AdminRoleQuery> conditionPageResult = new ConditionPageResult<>(pageResult, condition);
        return Result.ok(conditionPageResult);
    }

    @Override
    public Result<?> list(AdminRoleQuery condition) {
        List<AdminRole> list = adminRoleDao.selectListByCondition(condition);
        return Result.ok(list);
    }

    @Override
    public Result<?> get(Long id) {
        AdminRolePermissionVO adminRolePermissionVO = adminRolePermissionDao.getRolePermissionByRoleId(id);
        return Result.ok(adminRolePermissionVO);
    }
}