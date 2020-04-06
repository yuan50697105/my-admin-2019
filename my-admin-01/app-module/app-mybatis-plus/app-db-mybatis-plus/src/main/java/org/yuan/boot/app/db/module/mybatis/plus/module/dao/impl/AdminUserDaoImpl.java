package org.yuan.boot.app.db.module.mybatis.plus.module.dao.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.app.db.core.constants.CommonsConstants;
import org.yuan.boot.app.db.module.mybatis.plus.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.app.db.module.mybatis.plus.commons.pojo.BaseEntity;
import org.yuan.boot.app.db.module.mybatis.plus.module.dao.AdminUserDao;
import org.yuan.boot.app.db.module.mybatis.plus.module.mapper.AdminUserMapper;
import org.yuan.boot.app.db.module.mybatis.plus.module.pojo.AdminUser;
import org.yuan.boot.app.db.module.mybatis.plus.module.pojo.condition.AdminUserQuery;
import org.yuan.boot.commons.base.module.mybatis.plus.pojo.PageResult;

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
    public boolean enableByIds(List<Long> ids) {
        return lambdaUpdate().set(AdminUser::getEnabled, CommonsConstants.ENABLE).in(BaseEntity::getId, ids).update();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean disableByIds(List<Long> ids) {
        return lambdaUpdate().set(AdminUser::getEnabled, CommonsConstants.DISABLE).in(BaseEntity::getId, ids).update();
    }

    @Override
    public PageResult<AdminUser> selectPageByCondition(AdminUserQuery condition) {
        PageHelper.startPage(condition);
        return new PageResult<>(PageInfo.of(baseMapper.selectListByCondition(condition)));
    }

    @Override
    public List<AdminUser> selectListByCondition(AdminUserQuery condition) {
        return baseMapper.selectListByCondition(condition);
    }

}