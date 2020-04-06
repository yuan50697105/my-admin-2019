package org.yuan.boot.app.admin.module.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.app.admin.module.converter.AdminUserConverter;
import org.yuan.boot.app.admin.module.pojo.AdminUserFormVO;
import org.yuan.boot.app.admin.module.service.AdminUserService;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.plus.module.dao.AdminRoleDao;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.plus.module.dao.AdminUserDao;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.plus.module.dao.AdminUserRoleDao;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.plus.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.plus.module.pojo.AdminUser;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.plus.module.pojo.AdminUserRole;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.plus.module.pojo.condition.AdminUserQuery;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.plus.module.pojo.vo.AdminUserRoleVO;
import org.yuan.boot.commons.base.module.mybatis.sqlhelper.plus.pojo.PageResult;
import org.yuan.boot.commons.pojo.ConditionPageResult;
import org.yuan.boot.commons.pojo.Result;

import java.util.Collection;
import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 01:16
 */
@Service
@AllArgsConstructor
public class AdminUserServiceImpl implements AdminUserService {
    private AdminUserConverter adminUserConverter;
    private AdminUserDao adminUserDao;
    private AdminRoleDao adminRoleDao;
    private AdminUserRoleDao adminUserRoleDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<?> add(AdminUserFormVO adminUserFormVO) {
        AdminUser adminUser = adminUserConverter.addUser(adminUserFormVO);
        adminUserDao.save(adminUser);
        Collection<AdminRole> adminRoles = adminRoleDao.listByIds(adminUserFormVO.getRoleIds());
        List<AdminUserRole> adminUserRoles = adminUserConverter.addUserRoleList(adminUser, adminRoles);
        adminUserRoleDao.saveBatch(adminUserRoles);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<?> update(AdminUserFormVO adminUserFormVO) {
        AdminUser adminUser = adminUserDao.getById(adminUserFormVO.getId());
        if (adminUser != null) {
            adminUser.copyFrom(adminUserFormVO, AdminUser.class);
            adminUserDao.updateById(adminUser);
        }
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<?> updateRole(AdminUserFormVO adminUserFormVO) {
        Long userId = adminUserFormVO.getId();
        List<Long> roleIds = adminUserFormVO.getRoleIds();
        adminUserRoleDao.removeByUserId(userId);
        AdminUser adminUser = adminUserDao.getById(userId);
        Collection<AdminRole> adminRoles = adminRoleDao.listByIds(roleIds);
        List<AdminUserRole> adminUserRoles = adminUserConverter.addUserRoleList(adminUser, adminRoles);
        adminUserRoleDao.saveBatch(adminUserRoles);
        return Result.ok();
    }

    @Override
    public Result<?> delete(List<Long> ids) {
        adminUserDao.removeByIds(ids);
        adminUserRoleDao.removeByUserIds(ids);
        return Result.ok();
    }

    @Override
    public Result<?> enable(List<Long> ids) {
        adminUserDao.enableByIds(ids);
        return Result.ok();
    }

    @Override
    public Result<?> disable(List<Long> ids) {
        adminUserDao.disableByIds(ids);
        return Result.ok();
    }

    @Override
    public Result<?> data(AdminUserQuery condition) {
        PageResult<AdminUser> pageResult = adminUserDao.selectPageByCondition(condition);
        ConditionPageResult<AdminUser, AdminUserQuery> conditionPageResult = new ConditionPageResult<>(pageResult, condition);
        return Result.ok(conditionPageResult);
    }

    @Override
    public Result<?> list(AdminUserQuery condition) {
        List<AdminUser> list = adminUserDao.selectListByCondition(condition);
        return Result.ok(list);
    }

    @Override
    public Result<?> get(Long id) {
        AdminUserRoleVO adminUserRoleVO = adminUserRoleDao.getUserRoleByUserId(id);
        return Result.ok(adminUserRoleVO);
    }
}