package org.yuan.boot.app.admin.module.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.app.admin.module.converter.AdminUserConverter;
import org.yuan.boot.app.admin.module.pojo.AdminUserFormVO;
import org.yuan.boot.app.admin.module.service.AdminUserService;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.dao.AdminRoleDao;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.dao.AdminUserDao;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.dao.AdminUserRoleDao;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.pojo.AdminUser;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.pojo.AdminUserRole;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.pojo.condition.AdminUserQuery;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.pojo.vo.AdminUserRoleVO;
import org.yuan.boot.commons.base.core.configuration.pojo.SnowFlake;
import org.yuan.boot.commons.base.module.mybatis.jooq.sqlhelper.base.pojo.PageResult;
import org.yuan.boot.commons.pojo.ConditionPageResult;
import org.yuan.boot.commons.pojo.Result;

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
    private SnowFlake snowFlake;
    private AdminUserConverter adminUserConverter;
    private AdminUserDao adminUserDao;
    private AdminRoleDao adminRoleDao;
    private AdminUserRoleDao adminUserRoleDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<?> add(AdminUserFormVO adminUserFormVO) {
        AdminUser adminUser = adminUserConverter.addUser(adminUserFormVO);
        adminUserDao.insert(adminUser);
        List<AdminRole> adminRoles = adminRoleDao.selectByIds(adminUserFormVO.getRoleIds());
        List<AdminUserRole> adminUserRoles = adminUserConverter.addUserRoleList(adminUser, adminRoles);
        adminUserRoleDao.batchInsert(adminUserRoles);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<?> update(AdminUserFormVO adminUserFormVO) {
        AdminUser adminUser = adminUserDao.selectById(adminUserFormVO.getId());
        if (adminUser != null) {
            adminUser.copyFrom(adminUserFormVO, AdminUser.class, "username", "password");
            adminUserDao.updateSelective(adminUser);
        }
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<?> updateRole(AdminUserFormVO adminUserFormVO) {
        Long userId = adminUserFormVO.getId();
        List<Long> roleIds = adminUserFormVO.getRoleIds();
        adminUserRoleDao.deleteByUserId(userId);
        AdminUser adminUser = adminUserDao.selectById(userId);
        List<AdminRole> adminRoles = adminRoleDao.selectByIds(roleIds);
        List<AdminUserRole> adminUserRoles = adminUserConverter.addUserRoleList(adminUser, adminRoles);
        adminUserRoleDao.batchInsert(adminUserRoles);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<?> deleteByIds(List<Long> ids) {
        adminUserDao.deleteByIds(ids);
        adminUserRoleDao.deleteByUserIds(ids);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<?> enableByIds(List<Long> ids) {
        adminUserDao.updateEnableByIds(ids);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<?> disableByIds(List<Long> ids) {
        adminUserDao.updateDisableByIds(ids);
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