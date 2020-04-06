package org.yuan.boot.app.db.module.mybatis.mapper.module.dao.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Component;
import org.yuan.boot.app.db.module.mybatis.mapper.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.app.db.module.mybatis.mapper.module.dao.AdminUserDao;
import org.yuan.boot.app.db.module.mybatis.mapper.module.mapper.AdminUserMapper;
import org.yuan.boot.app.db.module.mybatis.mapper.module.pojo.AdminUser;
import org.yuan.boot.app.db.module.mybatis.mapper.module.pojo.condition.AdminUserQuery;
import org.yuan.boot.commons.base.module.mybatis.mapper.pojo.PageResult;

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
    public PageResult<AdminUser> selectPageByCondition(AdminUserQuery condition) {
        PageHelper.startPage(condition);
        return new PageResult<>(PageInfo.of(baseMapper.selectByCondition(condition)));
    }

    @Override
    public List<AdminUser> selectListByCondition(AdminUserQuery condition) {
        return baseMapper.selectByCondition(condition);
    }

}