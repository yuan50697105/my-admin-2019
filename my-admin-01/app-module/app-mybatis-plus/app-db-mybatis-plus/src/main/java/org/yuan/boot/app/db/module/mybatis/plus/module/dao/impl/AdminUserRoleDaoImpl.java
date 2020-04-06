package org.yuan.boot.app.db.module.mybatis.plus.module.dao.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.app.db.module.mybatis.plus.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.app.db.module.mybatis.plus.module.dao.AdminRoleDao;
import org.yuan.boot.app.db.module.mybatis.plus.module.dao.AdminUserDao;
import org.yuan.boot.app.db.module.mybatis.plus.module.dao.AdminUserRoleDao;
import org.yuan.boot.app.db.module.mybatis.plus.module.mapper.AdminUserRoleMapper;
import org.yuan.boot.app.db.module.mybatis.plus.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.plus.module.pojo.AdminUser;
import org.yuan.boot.app.db.module.mybatis.plus.module.pojo.AdminUserRole;
import org.yuan.boot.app.db.module.mybatis.plus.module.pojo.vo.AdminUserRoleVO;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 00:57
 */
@Component
@AllArgsConstructor
public class AdminUserRoleDaoImpl extends BaseDaoImpl<AdminUserRole, AdminUserRoleMapper> implements AdminUserRoleDao {
    private AdminUserDao adminUserDao;
    private AdminRoleDao adminRoleDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean removeByUserId(Long userId) {
        return remove(query().eq("userId", userId));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean removeByUserIds(List<Long> userIds) {
        return remove(query().in("userId", userIds));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean removeByRoleIds(List<Long> roleIds) {
        return remove(query().in("roleId", roleIds));
    }

    @Override
    public AdminUserRoleVO getUserRoleByUserId(Long userId) {
        AdminUser adminUser = adminUserDao.getById(userId);
        List<AdminUserRole> adminUserRoles = lambdaQuery().eq(AdminUserRole::getUserId, userId).list();
        List<Long> roleIds = adminUserRoles.stream().map(AdminUserRole::getRoleId).collect(Collectors.toList());
        List<AdminRole> adminRoles = Collections.emptyList();
        if (!roleIds.isEmpty()) {
            adminRoles = adminRoleDao.listByIds(roleIds);
        }
        return new AdminUserRoleVO(adminUser, adminRoles);
    }
}