package org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.dao.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.dao.AdminRoleDao;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.dao.AdminUserDao;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.dao.AdminUserRoleDao;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.mapper.AdminUserRoleMapper;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.pojo.AdminUser;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.pojo.AdminUserRole;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.pojo.vo.AdminUserRoleVO;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.repository.AdminUserRoleRepository;

import java.util.List;
import java.util.stream.Collectors;

import static org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.pojo.QAdminUserRole.adminUserRole;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 00:57
 */
@Component
@AllArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class AdminUserRoleDaoImpl extends BaseDaoImpl<AdminUserRole, AdminUserRoleRepository, AdminUserRoleMapper> implements AdminUserRoleDao {
    private AdminUserDao adminUserDao;
    private AdminRoleDao adminRoleDao;

    @Override
    public void deleteByRoleIds(List<Long> roleIds) {
        queryFactory().delete(adminUserRole).where(adminUserRole.roleId.in(roleIds)).execute();
    }

    @Override
    public void deleteAllByUserId(Long userId) {
        queryFactory().delete(adminUserRole).where(adminUserRole.userId.eq(userId)).execute();
    }

    @Override
    public void deleteAllByUserIds(List<Long> userIds) {
        queryFactory().delete(adminUserRole).where(adminUserRole.userId.in(userIds)).execute();
    }

    @Override
    public AdminUserRoleVO getUserRoleByUserId(Long userId) {
        AdminUser adminUser = adminUserDao.findById(userId).orElse(new AdminUser());
        List<AdminUserRole> adminUserRoles = baseRepository.findAllByUserIdEquals(userId);
        List<Long> roleIds = adminUserRoles.stream().map(AdminUserRole::getRoleId).collect(Collectors.toList());
        List<AdminRole> adminRoles = adminRoleDao.findAllById(roleIds);
        return new AdminUserRoleVO(adminUser, adminRoles);
    }
}