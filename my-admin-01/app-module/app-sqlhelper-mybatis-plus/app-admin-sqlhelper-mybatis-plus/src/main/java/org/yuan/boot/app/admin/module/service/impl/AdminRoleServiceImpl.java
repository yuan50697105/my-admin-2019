package org.yuan.boot.app.admin.module.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.app.admin.module.converter.AdminRoleConverter;
import org.yuan.boot.app.admin.module.pojo.AdminRoleFormVO;
import org.yuan.boot.app.admin.module.service.AdminRoleService;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.plus.module.dao.AdminPermissionDao;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.plus.module.dao.AdminRoleDao;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.plus.module.dao.AdminRolePermissionDao;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.plus.module.dao.AdminUserRoleDao;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.plus.module.pojo.AdminPermission;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.plus.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.plus.module.pojo.AdminRolePermission;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.plus.module.pojo.condition.AdminRoleQuery;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.plus.module.pojo.vo.AdminRolePermissionVO;
import org.yuan.boot.commons.base.module.mybatis.sqlhelper.plus.pojo.PageResult;
import org.yuan.boot.commons.pojo.ConditionPageResult;
import org.yuan.boot.commons.pojo.Result;

import java.util.Collection;
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
        Collection<AdminPermission> adminPermissions = adminPermissionDao.listByIds(adminRoleFormVO.getPermissionIds());
        List<AdminRolePermission> adminRolePermissions = adminRoleConverter.addRolePermissionList(adminRole, adminPermissions);
        adminRolePermissionDao.saveBatch(adminRolePermissions);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<?> update(AdminRoleFormVO adminRoleFormVO) {
        AdminRole adminRole = adminRoleDao.getById(adminRoleFormVO.getId());
        if (adminRole != null) {
            adminRole.copyFrom(adminRoleFormVO, AdminRole.class);
            adminRoleDao.updateById(adminRole);
        }
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<?> updatePermission(AdminRoleFormVO adminRoleFormVO) {
        adminRolePermissionDao.removeByRoleId(adminRoleFormVO.getId());
        AdminRole adminRole = adminRoleDao.getById(adminRoleFormVO.getId());
        Collection<AdminPermission> adminPermissions = adminPermissionDao.listByIds(adminRoleFormVO.getPermissionIds());
        List<AdminRolePermission> adminRolePermissions = adminRoleConverter.addRolePermissionList(adminRole, adminPermissions);
        adminRolePermissionDao.updateBatchById(adminRolePermissions);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<?> delete(List<Long> ids) {
        adminRoleDao.removeByIds(ids);
        adminUserRoleDao.removeByRoleIds(ids);
        adminRolePermissionDao.removeByRoleIds(ids);
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