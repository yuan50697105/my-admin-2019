package org.yuan.boot.app.admin.module.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.app.admin.module.converter.AdminUserConverter;
import org.yuan.boot.app.admin.module.pojo.AdminUserFormVO;
import org.yuan.boot.app.admin.module.service.AdminUserService;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.dao.AdminRoleDao;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.dao.AdminUserDao;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.dao.AdminUserRoleDao;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.pojo.AdminUser;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.pojo.AdminUserRole;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.pojo.condition.AdminUserQuery;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.pojo.vo.AdminUserRoleVO;
import org.yuan.boot.commons.base.core.configuration.pojo.SnowFlake;
import org.yuan.boot.commons.base.module.mybatis.jpa.sqlhelper.mapper.pojo.PageResult;
import org.yuan.boot.commons.pojo.ConditionPageResult;
import org.yuan.boot.commons.pojo.Result;

import java.util.List;
import java.util.Optional;

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
        adminUserDao.saveOne(adminUser);
        List<AdminRole> adminRoles = adminRoleDao.findAllById(adminUserFormVO.getRoleIds());
        List<AdminUserRole> adminUserRoles = adminUserConverter.addUserRoleList(adminUser, adminRoles);
        adminUserRoleDao.saveAll(adminUserRoles);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<?> update(AdminUserFormVO adminUserFormVO) {
        Optional<AdminUser> optional = adminUserDao.findById(adminUserFormVO.getId());
        if (optional.isPresent()) {
            AdminUser adminUser = optional.get();
            adminUser.copyFrom(adminUserFormVO, AdminUser.class, "username", "password");
            adminUserDao.saveOne(adminUser);
        }
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<?> updateRole(AdminUserFormVO adminUserFormVO) {
        Long userId = adminUserFormVO.getId();
        List<Long> roleIds = adminUserFormVO.getRoleIds();
        adminUserRoleDao.deleteAllByUserId(userId);
        AdminUser adminUser = adminUserDao.findById(userId).orElse(null);
        List<AdminRole> adminRoles = adminRoleDao.findAllById(roleIds);
        List<AdminUserRole> adminUserRoles = adminUserConverter.addUserRoleList(adminUser, adminRoles);
        adminUserRoleDao.saveAll(adminUserRoles);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<?> delete(List<Long> ids) {
        adminUserDao.deleteAllById(ids);
        adminUserRoleDao.deleteAllByUserIds(ids);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<?> enable(List<Long> ids) {
        adminUserDao.updateEnableByIds(ids);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<?> disable(List<Long> ids) {
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