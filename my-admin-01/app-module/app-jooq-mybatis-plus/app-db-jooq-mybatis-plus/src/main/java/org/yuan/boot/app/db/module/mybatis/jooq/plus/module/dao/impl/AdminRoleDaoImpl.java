package org.yuan.boot.app.db.module.mybatis.jooq.plus.module.dao.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Component;
import org.yuan.boot.app.db.module.mybatis.jooq.plus.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.app.db.module.mybatis.jooq.plus.module.dao.AdminRoleDao;
import org.yuan.boot.app.db.module.mybatis.jooq.plus.module.mapper.AdminRoleMapper;
import org.yuan.boot.app.db.module.mybatis.jooq.plus.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.jooq.plus.module.pojo.condition.AdminRoleQuery;
import org.yuan.boot.commons.base.module.mybatis.jooq.plus.pojo.PageResult;

import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 00:54
 */
@Component
public class AdminRoleDaoImpl extends BaseDaoImpl<AdminRole, AdminRoleMapper> implements AdminRoleDao {
    @Override
    public PageResult<AdminRole> selectPageByCondition(AdminRoleQuery condition) {
        PageHelper.startPage(condition);
        return new PageResult<>(PageInfo.of(baseMapper.selectListByCondition(condition)));
    }

    @Override
    public List<AdminRole> selectListByCondition(AdminRoleQuery condition) {
        return baseMapper.selectListByCondition(condition);
    }
}