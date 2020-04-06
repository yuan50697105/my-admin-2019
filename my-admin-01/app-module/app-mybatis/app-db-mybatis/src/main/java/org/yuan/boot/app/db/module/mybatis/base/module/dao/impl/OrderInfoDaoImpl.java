package org.yuan.boot.app.db.module.mybatis.base.module.dao.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.app.db.module.mybatis.base.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.app.db.module.mybatis.base.module.dao.OrderInfoDao;
import org.yuan.boot.app.db.module.mybatis.base.module.mapper.OrderInfoMapper;
import org.yuan.boot.app.db.module.mybatis.base.module.pojo.OrderInfo;
import org.yuan.boot.app.db.module.mybatis.base.module.pojo.condition.OrderInfoQuery;
import org.yuan.boot.commons.base.module.mybaits.base.pojo.PageResult;

import java.util.List;

/**
 * @program: my-admin-shower
 * @description:
 * @author: yuane
 * @create: 2020-02-25 20:06
 */
@Component
@AllArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class OrderInfoDaoImpl extends BaseDaoImpl<OrderInfo, OrderInfoMapper> implements OrderInfoDao {
    @Override
    public void insert(OrderInfo orderInfo) {
        baseMapper.insert(orderInfo);
    }

    @Override
    public PageResult<OrderInfo> selectPage(OrderInfoQuery query) {
        PageHelper.startPage(query);
        return new PageResult<>(PageInfo.of(baseMapper.selectList(query)));
    }

    @Override
    public List<OrderInfo> selectList(OrderInfoQuery query) {
        return baseMapper.selectList(query);
    }
}