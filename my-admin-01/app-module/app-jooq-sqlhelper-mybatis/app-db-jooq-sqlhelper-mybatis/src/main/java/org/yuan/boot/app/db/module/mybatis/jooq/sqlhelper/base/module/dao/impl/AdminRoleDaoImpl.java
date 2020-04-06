package org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.dao.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.dao.AdminRoleDao;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.mapper.AdminRoleMapper;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.pojo.condition.AdminRoleQuery;
import org.yuan.boot.commons.base.module.mybatis.jooq.sqlhelper.base.pojo.PageResult;

import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 00:54
 */
@Component
@Transactional(rollbackFor = Exception.class)
public class AdminRoleDaoImpl extends BaseDaoImpl<AdminRole, AdminRoleMapper> implements AdminRoleDao {
    @Override
    public void insert(AdminRole adminRole) {
        baseMapper.insert(adminRole);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateSelective(AdminRole adminRole) {
        baseMapper.updateByPrimaryKeySelective(adminRole);
    }

    @Override
    public AdminRole selectById(Long id) {
        return baseMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<AdminRole> selectByIds(List<Long> ids) {
        return baseMapper.selectByIdIn(ids);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByIds(List<Long> ids) {
        baseMapper.deleteByIdIn(ids);
    }

    @Override
    public PageResult<AdminRole> selectPageByCondition(AdminRoleQuery condition) {
        PageHelper.startPage(condition);
        return new PageResult<>(PageInfo.of(baseMapper.selectByCondition(condition)));
    }

    @Override
    public List<AdminRole> selectListByCondition(AdminRoleQuery condition) {
        return baseMapper.selectByCondition(condition);
    }
}