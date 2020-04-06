package org.yuan.boot.app.admin.module.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.app.admin.module.converter.AdminPermissionConverter;
import org.yuan.boot.app.admin.module.pojo.AdminPermissionFormVO;
import org.yuan.boot.app.admin.module.service.AdminPermissionService;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.plus.module.dao.AdminPermissionDao;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.plus.module.dao.AdminRolePermissionDao;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.plus.module.pojo.AdminPermission;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.plus.module.pojo.AdminRolePermission;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.plus.module.pojo.condition.AdminPermissionQuery;
import org.yuan.boot.commons.base.module.mybatis.sqlhelper.plus.pojo.PageResult;
import org.yuan.boot.commons.pojo.ConditionPageResult;
import org.yuan.boot.commons.pojo.Result;

import java.util.List;

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
        adminPermissionDao.save(adminPermission);
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<?> update(AdminPermissionFormVO adminPermissionFormVO) {
        AdminPermission adminPermission = adminPermissionDao.getById(adminPermissionFormVO.getId());
        if (adminPermission != null) {
            adminPermission.copyFrom(adminPermissionFormVO, AdminPermission.class);
            adminPermissionDao.updateById(adminPermission);
        }
        return Result.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<?> delete(List<Long> ids) {
        adminPermissionDao.removeByIds(ids);
        adminRolePermissionDao.removeByRoleIds(ids);
        return Result.ok();
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

    @Override
    public Result<?> get(Long id) {
        AdminRolePermission adminRolePermission = adminRolePermissionDao.getById(id);
        return Result.ok(adminRolePermission);
    }
}