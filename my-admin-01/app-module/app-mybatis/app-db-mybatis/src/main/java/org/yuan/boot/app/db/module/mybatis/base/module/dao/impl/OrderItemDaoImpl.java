package org.yuan.boot.app.db.module.mybatis.base.module.dao.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.app.db.module.mybatis.base.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.app.db.module.mybatis.base.module.dao.OrderItemDao;
import org.yuan.boot.app.db.module.mybatis.base.module.mapper.OrderItemMapper;
import org.yuan.boot.app.db.module.mybatis.base.module.pojo.OrderItem;

import java.util.List;

/**
 * @program: my-admin-shower
 * @description:
 * @author: yuane
 * @create: 2020-02-25 20:28
 */
@Component
@AllArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class OrderItemDaoImpl extends BaseDaoImpl<OrderItem, OrderItemMapper> implements OrderItemDao {
    @Override
    public void batchInsert(List<OrderItem> items) {
        items.forEach(baseMapper::insert);
    }
}