package org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.dao.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.dao.AdminRoleDao;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.dao.AdminUserDao;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.dao.AdminUserRoleDao;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.mapper.AdminUserRoleMapper;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.pojo.AdminUser;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.pojo.AdminUserRole;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.pojo.vo.AdminUserRoleVO;
import tk.mybatis.mapper.util.Sqls;

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
    public void batchInsert(List<AdminUserRole> adminUserRoles) {
        adminUserRoles.forEach(this::insert);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByUserId(Long userId) {
        deleteByExample(exampleBuilder().where(Sqls.custom().andEqualTo("userId", userId)).build());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByUserIds(List<Long> userIds) {
        deleteByExample(exampleBuilder().where(Sqls.custom().andIn("userId", userIds)).build());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByRoleIds(List<Long> roleIds) {
        deleteByExample(exampleBuilder().where(Sqls.custom().andIn("roleId", roleIds)).build());
    }

    @Override
    public AdminUserRoleVO getUserRoleByUserId(Long userId) {
        AdminUser adminUser = adminUserDao.selectByPrimaryKey(userId);
        List<AdminUserRole> adminUserRoles = baseMapper.selectByUserId(userId);
        List<Long> roleIds = adminUserRoles.stream().map(AdminUserRole::getRoleId).collect(Collectors.toList());
        List<AdminRole> adminRoles = Collections.emptyList();
        if (!roleIds.isEmpty()) {
            adminRoles = adminRoleDao.selectByExample(exampleBuilder().where(Sqls.custom().andIn("roleId", roleIds)).build());
        }
        return new AdminUserRoleVO(adminUser, adminRoles);
    }
}