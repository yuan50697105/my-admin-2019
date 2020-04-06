package org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.dao.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.dao.AdminPermissionDao;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.mapper.AdminPermissionMapper;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.pojo.AdminPermission;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.pojo.condition.AdminPermissionQuery;
import org.yuan.boot.commons.base.module.mybatis.jooq.sqlhelper.base.pojo.PageResult;

import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 00:53
 */
@Component
public class AdminPermissionDaoImpl extends BaseDaoImpl<AdminPermission, AdminPermissionMapper> implements AdminPermissionDao {
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insert(AdminPermission adminPermission) {
        baseMapper.insert(adminPermission);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateSelective(AdminPermission adminPermission) {
        baseMapper.updateByPrimaryKeySelective(adminPermission);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByIds(List<Long> ids) {
        baseMapper.deleteByIdIn(ids);
    }

    @Override
    public AdminPermission selectById(Long id) {
        return baseMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<AdminPermission> selectByIds(List<Long> ids) {
        return baseMapper.selectByIdIn(ids);
    }

    @Override
    public PageResult<AdminPermission> selectPageByCondition(AdminPermissionQuery condition) {
        PageHelper.startPage(condition);
        return new PageResult<>(PageInfo.of(baseMapper.selectByCondition(condition)));
    }

    @Override
    public List<AdminPermission> selectListByCondition(AdminPermissionQuery condition) {
        return baseMapper.selectByCondition(condition);
    }
}