package org.yuan.boot.app.admin.module.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.app.admin.module.converter.AdminUserConverter;
import org.yuan.boot.app.admin.module.pojo.AdminUserFormVO;
import org.yuan.boot.app.admin.module.service.AdminUserService;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.dao.AdminRoleDao;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.dao.AdminUserDao;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.dao.AdminUserRoleDao;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.pojo.AdminUser;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.pojo.AdminUserRole;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.pojo.condition.AdminUserQuery;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.pojo.vo.AdminUserRoleVO;
import org.yuan.boot.commons.base.module.mybatis.jooq.mapper.pojo.PageResult;
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
    private AdminUserConverter adminUserConverter;
    private AdminUserDao adminUserDao;
    private AdminRoleDao adminRoleDao;
    private AdminUserRoleDao adminUserRoleDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<?> add(AdminUserFormVO adminUserFormVO) {
        AdminUser adminUser = adminUserConverter.addUser(adminUserFormVO);
        List<AdminRole> adminRoles = adminRoleDao.selectByIds(adminUserFormVO.getRoleIds());
        List<AdminUserRole> adminUserRoles = adminUserConverter.addUserRoleList(adminUser, adminRoles);
        adminUserRoleDao.batchInsert(adminUserRoles);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<?> update(AdminUserFormVO adminUserFormVO) {
        AdminUser adminUser = adminUserDao.selectByPrimaryKey(adminUserFormVO.getId());
        if (adminUser != null) {
            adminUser.copyFrom(adminUserFormVO, AdminUser.class);
            adminUserDao.updateByPrimaryKeySelective(adminUser);
        }
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<?> updateUserRole(AdminUserFormVO adminUserFormVO) {
        Long userId = adminUserFormVO.getId();
        List<Long> roleIds = adminUserFormVO.getRoleIds();
        adminUserRoleDao.deleteByUserId(userId);
        AdminUser adminUser = adminUserDao.selectByPrimaryKey(userId);
        List<AdminRole> adminRoles = adminRoleDao.selectByIds(roleIds);
        List<AdminUserRole> adminUserRoles = adminUserConverter.addUserRoleList(adminUser, adminRoles);
        adminUserRoleDao.batchInsert(adminUserRoles);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<?> delete(List<Long> ids) {
        adminUserDao.deleteByIds(ids);
        adminUserRoleDao.deleteByUserIds(ids);
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