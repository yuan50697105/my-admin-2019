package org.yuan.boot.app.db.module.mybatis.jpa.jooq.mapper.mapper.module.dao.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Component;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.mapper.mapper.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.mapper.mapper.module.dao.AdminRoleDao;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.mapper.mapper.module.mapper.AdminRoleMapper;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.mapper.mapper.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.mapper.mapper.module.pojo.condition.AdminRoleQuery;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.mapper.mapper.module.repository.AdminRoleRepository;
import org.yuan.boot.commons.base.module.mybatis.jpa.jooq.mapper.pojo.PageResult;

import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 00:54
 */
@Component
public class AdminRoleDaoImpl extends BaseDaoImpl<AdminRole, AdminRoleRepository, AdminRoleMapper> implements AdminRoleDao {
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