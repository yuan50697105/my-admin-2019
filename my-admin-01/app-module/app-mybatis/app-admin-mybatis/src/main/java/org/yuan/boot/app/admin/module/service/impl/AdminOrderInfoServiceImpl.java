package org.yuan.boot.app.admin.module.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.app.admin.module.service.AdminOrderInfoService;
import org.yuan.boot.app.db.module.mybatis.base.module.dao.OrderInfoDao;
import org.yuan.boot.app.db.module.mybatis.base.module.dao.OrderItemDao;
import org.yuan.boot.app.db.module.mybatis.base.module.pojo.condition.OrderInfoQuery;
import org.yuan.boot.commons.pojo.Result;

/**
 * @program: my-admin-shower
 * @description:
 * @author: yuane
 * @create: 2020-02-26 21:09
 */
@Service
@AllArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class AdminOrderInfoServiceImpl implements AdminOrderInfoService {
    private OrderInfoDao orderInfoDao;
    private OrderItemDao orderItemDao;

    public Result<?> data(OrderInfoQuery query) {
        return Result.data(orderInfoDao.selectPage(query), query);
    }
}