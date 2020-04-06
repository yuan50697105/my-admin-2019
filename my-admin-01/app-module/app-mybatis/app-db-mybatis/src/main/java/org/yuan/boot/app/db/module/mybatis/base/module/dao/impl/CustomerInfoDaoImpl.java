package org.yuan.boot.app.db.module.mybatis.base.module.dao.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.app.db.module.mybatis.base.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.app.db.module.mybatis.base.module.dao.CustomerInfoDao;
import org.yuan.boot.app.db.module.mybatis.base.module.mapper.CustomerInfoMapper;
import org.yuan.boot.app.db.module.mybatis.base.module.pojo.CustomerInfo;
import org.yuan.boot.app.db.module.mybatis.base.module.pojo.condition.CustomerInfoQuery;
import org.yuan.boot.commons.base.module.mybaits.base.pojo.PageResult;

/**
 * @program: my-admin-01-wx
 * @description:
 * @author: yuane
 * @create: 2020-02-24 19:59
 */
@Component
@AllArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class CustomerInfoDaoImpl extends BaseDaoImpl<CustomerInfo, CustomerInfoMapper> implements CustomerInfoDao {
    @Override
    public void insert(CustomerInfo customerInfo) {
        baseMapper.insert(customerInfo);
    }

    @Override
    public void update(CustomerInfo customerInfo) {
        baseMapper.updateByPrimaryKeySelective(customerInfo);
    }


    @Override
    public CustomerInfo getById(Long id) {
        return baseMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageResult<CustomerInfo> selectPage(CustomerInfoQuery condition) {
        PageHelper.startPage(condition);
        return new PageResult<>(PageInfo.of(baseMapper.selectByQueryCondition(condition)));
    }
}