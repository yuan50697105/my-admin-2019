package org.yuan.boot.app.admin.module.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.app.admin.module.converter.AdminRoleConverter;
import org.yuan.boot.app.admin.module.pojo.AdminRoleFormVO;
import org.yuan.boot.app.admin.module.service.AdminRoleService;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.base.module.dao.AdminPermissionDao;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.base.module.dao.AdminRoleDao;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.base.module.dao.AdminRolePermissionDao;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.base.module.dao.AdminUserRoleDao;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.base.module.pojo.AdminPermission;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.base.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.base.module.pojo.AdminRolePermission;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.base.module.pojo.condition.AdminRoleQuery;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.base.module.pojo.vo.AdminRolePermissionVO;
import org.yuan.boot.commons.base.module.mybatis.sqlhelper.base.pojo.PageResult;
import org.yuan.boot.commons.pojo.ConditionPageResult;
import org.yuan.boot.commons.pojo.Result;

import java.util.List;

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
        adminRoleDao.insert(adminRole);
        List<AdminPermission> adminPermissions = adminPermissionDao.selectByIds(adminRoleFormVO.getPermissionIds());
        List<AdminRolePermission> adminRolePermissions = adminRoleConverter.addRolePermissionList(adminRole, adminPermissions);
        adminRolePermissionDao.batchInsert(adminRolePermissions);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<?> update(AdminRoleFormVO adminRoleFormVO) {
        AdminRole adminRole = adminRoleDao.selectById(adminRoleFormVO.getId());
        if (adminRole != null) {
            adminRole.copyFrom(adminRoleFormVO, AdminRole.class);
            adminRoleDao.updateSelective(adminRole);
        }
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<?> updatePermission(AdminRoleFormVO adminRoleFormVO) {
        Long roleId = adminRoleFormVO.getId();
        List<Long> permissionIds = adminRoleFormVO.getPermissionIds();
        adminRolePermissionDao.deleteByRoleId(roleId);
        AdminRole adminRole = adminRoleDao.selectById(roleId);
        List<AdminPermission> adminPermissions = adminPermissionDao.selectByIds(permissionIds);
        List<AdminRolePermission> adminRolePermissions = adminRoleConverter.addRolePermissionList(adminRole, adminPermissions);
        adminRolePermissionDao.batchInsert(adminRolePermissions);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<?> deleteByIds(List<Long> ids) {
        adminRoleDao.deleteByIds(ids);
        adminUserRoleDao.deleteByRoleIds(ids);
        adminRolePermissionDao.deleteByRoleIds(ids);
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