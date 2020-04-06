package org.yuan.boot.app.admin.module.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.app.admin.module.converter.AdminPermissionConverter;
import org.yuan.boot.app.admin.module.pojo.AdminPermissionFormVO;
import org.yuan.boot.app.admin.module.service.AdminPermissionService;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.mapper.mapper.module.dao.AdminPermissionDao;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.mapper.mapper.module.dao.AdminRolePermissionDao;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.mapper.mapper.module.pojo.AdminPermission;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.mapper.mapper.module.pojo.condition.AdminPermissionQuery;
import org.yuan.boot.commons.base.module.mybatis.jpa.jooq.mapper.pojo.PageResult;
import org.yuan.boot.commons.pojo.ConditionPageResult;
import org.yuan.boot.commons.pojo.Result;

import java.util.List;
import java.util.Optional;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 01:17
 */
@Service
@AllArgsConstructor
public class AdminPermissionServiceImpl implements AdminPermissionService {
    private AdminPermissionConverter adminPermissionConverter;
    private AdminPermissionDao adminPermissionDao;
    private AdminRolePermissionDao adminRolePermissionDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<?> add(AdminPermissionFormVO adminPermissionFormVO) {
        AdminPermission adminPermission = adminPermissionConverter.addPermission(adminPermissionFormVO);
        adminPermissionDao.saveEntity(adminPermission);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<?> update(AdminPermissionFormVO adminPermissionFormVO) {
        Optional<AdminPermission> optional = adminPermissionDao.findById(adminPermissionFormVO.getId());
        if (optional.isPresent()) {
            AdminPermission adminPermission = optional.get();
            adminPermission.copyFrom(adminPermissionFormVO, AdminPermission.class);
            adminPermissionDao.saveEntity(adminPermission);
        }
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<?> delete(List<Long> ids) {
        adminPermissionDao.deleteAllById(ids);
        adminRolePermissionDao.deleteAllByPermissionIds(ids);
        return Result.ok();
    }

    @Override
    public Result<?> get(Long id) {
        Optional<AdminPermission> adminPermission = adminPermissionDao.findById(id);
        return Result.ok(adminPermission);
    }

    @Override
    public Result<?> data(AdminPermissionQuery condition) {
        PageResult<AdminPermission> pageResult = adminPermissionDao.selectPageByCondition(condition);
        ConditionPageResult<AdminPermission, AdminPermissionQuery> conditionPageResult = new ConditionPageResult<>(pageResult, condition);
        return Result.ok(conditionPageResult);
    }

    @Override
    public Result<?> list(AdminPermissionQuery condition) {
        List<AdminPermission> list = adminPermissionDao.selectListByCondition(condition);
        return Result.ok(list);
    }

}