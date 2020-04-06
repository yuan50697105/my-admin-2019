package org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.plus.module.dao.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.app.db.core.constants.CommonsConstants;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.plus.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.plus.module.dao.AdminUserDao;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.plus.module.mapper.AdminUserMapper;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.plus.module.pojo.AdminUser;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.plus.module.pojo.condition.AdminUserQuery;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.plus.module.repository.AdminUserRepository;
import org.yuan.boot.commons.base.module.mybatis.jpa.sqlhelper.plus.pojo.PageResult;

import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 00:56
 */
@Component
@Transactional(rollbackFor = Exception.class)
public class AdminUserDaoImpl extends BaseDaoImpl<AdminUser, AdminUserRepository, AdminUserMapper> implements AdminUserDao {
    @Override
    public void updateEnableByIds(List<Long> ids) {
        baseMapper.updateEnabledByIdIn(CommonsConstants.UPDATED_ENABLED, ids);
    }

    @Override
    public void updateDisableByIds(List<Long> ids) {
        baseMapper.updateEnabledByIdIn(CommonsConstants.UPDATED_DISABLED, ids);
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