package org.yuan.boot.app.db.module.mybatis.plus.module.dao.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Component;
import org.yuan.boot.app.db.module.mybatis.plus.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.app.db.module.mybatis.plus.module.dao.AdminPermissionDao;
import org.yuan.boot.app.db.module.mybatis.plus.module.mapper.AdminPermissionMapper;
import org.yuan.boot.app.db.module.mybatis.plus.module.pojo.AdminPermission;
import org.yuan.boot.app.db.module.mybatis.plus.module.pojo.condition.AdminPermissionQuery;
import org.yuan.boot.commons.base.module.mybatis.plus.pojo.PageResult;

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
    public PageResult<AdminPermission> selectPageByCondition(AdminPermissionQuery condition) {
        PageHelper.startPage(condition);
        return new PageResult<>(PageInfo.of(baseMapper.selectListByCondition(condition)));
    }

    @Override
    public List<AdminPermission> selectListByCondition(AdminPermissionQuery condition) {
        return baseMapper.selectListByCondition(condition);
    }
}