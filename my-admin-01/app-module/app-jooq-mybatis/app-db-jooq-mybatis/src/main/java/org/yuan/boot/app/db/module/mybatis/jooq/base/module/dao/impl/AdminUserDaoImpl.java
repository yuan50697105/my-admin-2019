package org.yuan.boot.app.db.module.mybatis.jooq.base.module.dao.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.app.db.core.constants.CommonsConstants;
import org.yuan.boot.app.db.module.mybatis.jooq.base.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.app.db.module.mybatis.jooq.base.module.dao.AdminUserDao;
import org.yuan.boot.app.db.module.mybatis.jooq.base.module.mapper.AdminUserMapper;
import org.yuan.boot.app.db.module.mybatis.jooq.base.module.pojo.AdminUser;
import org.yuan.boot.app.db.module.mybatis.jooq.base.module.pojo.condition.AdminUserQuery;
import org.yuan.boot.commons.base.module.mybatis.jooq.base.pojo.PageResult;

import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 00:56
 */
@Component
public class AdminUserDaoImpl extends BaseDaoImpl<AdminUser, AdminUserMapper> implements AdminUserDao {

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insert(AdminUser adminUser) {
        baseMapper.insert(adminUser);
    }


    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateSelective(AdminUser adminUser) {
        baseMapper.updateByPrimaryKeySelective(adminUser);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateEnableByIds(List<Long> ids) {
        baseMapper.updateEnabledByIdIn(CommonsConstants.UPDATED_ENABLED, ids);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updateDisableByIds(List<Long> ids) {
        baseMapper.updateEnabledByIdIn(CommonsConstants.UPDATED_DISABLED, ids);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteById(Long id) {
        baseMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteByIds(List<Long> ids) {
        baseMapper.deleteByIdIn(ids);
    }

    @Override
    public AdminUser selectById(Long id) {
        return baseMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageResult<AdminUser> selectPageByCondition(AdminUserQuery condition) {
        PageHelper.startPage(condition);
        return new PageResult<>(PageInfo.of(baseMapper.selectByCondition(condition)));
    }

    @Override
    public List<AdminUser> selectListByCondition(AdminUserQuery condition) {
        return baseMapper.selectByCondition(condition);
    }

}