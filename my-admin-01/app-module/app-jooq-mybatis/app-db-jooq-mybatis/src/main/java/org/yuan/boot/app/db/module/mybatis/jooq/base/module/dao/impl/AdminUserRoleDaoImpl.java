package org.yuan.boot.app.db.module.mybatis.jooq.base.module.dao.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.app.db.module.mybatis.jooq.base.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.app.db.module.mybatis.jooq.base.module.dao.AdminUserDao;
import org.yuan.boot.app.db.module.mybatis.jooq.base.module.dao.AdminUserRoleDao;
import org.yuan.boot.app.db.module.mybatis.jooq.base.module.mapper.AdminRoleMapper;
import org.yuan.boot.app.db.module.mybatis.jooq.base.module.mapper.AdminUserRoleMapper;
import org.yuan.boot.app.db.module.mybatis.jooq.base.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.jooq.base.module.pojo.AdminUser;
import org.yuan.boot.app.db.module.mybatis.jooq.base.module.pojo.AdminUserRole;
import org.yuan.boot.app.db.module.mybatis.jooq.base.module.pojo.vo.AdminUserRoleVO;

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
    private AdminRoleMapper adminRoleMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void batchInsert(List<AdminUserRole> adminUserRoles) {
        adminUserRoles.forEach(baseMapper::insert);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByUserId(Long userId) {
        baseMapper.deleteByUserId(userId);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByUserIds(List<Long> userIds) {
        baseMapper.deleteByUserIdIn(userIds);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByRoleIds(List<Long> roleIds) {
        baseMapper.deleteByRoleIdIn(roleIds);
    }

    @Override
    public List<AdminUserRole> selectByUserId(Long userId) {
        return baseMapper.selectByUserId(userId);
    }

    @Override
    public AdminUserRoleVO getUserRoleByUserId(Long userId) {
        AdminUser adminUser = adminUserDao.selectById(userId);
        List<AdminUserRole> adminUserRoles = baseMapper.selectByUserId(userId);
        List<Long> roleIds = adminUserRoles.stream().map(AdminUserRole::getRoleId).collect(Collectors.toList());
        List<AdminRole> adminRoles = Collections.emptyList();
        if (!roleIds.isEmpty()) {
            adminRoles = adminRoleMapper.selectByIdIn(roleIds);
        }
        return new AdminUserRoleVO(adminUser, adminRoles);

    }
}