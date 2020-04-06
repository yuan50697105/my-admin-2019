package org.yuan.boot.app.db.module.mybatis.base.module.dao.impl;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;
import org.yuan.boot.app.db.module.mybatis.base.module.dao.OrderInfoDao;
import org.yuan.boot.app.db.module.mybatis.base.module.dao.OrderInfoItemDao;
import org.yuan.boot.app.db.module.mybatis.base.module.dao.OrderItemDao;
import org.yuan.boot.app.db.module.mybatis.base.module.pojo.dto.OrderInfoWIthItemDTO;

import java.util.Optional;

/**
 * @program: my-admin-shower
 * @description:
 * @author: yuane
 * @create: 2020-02-25 21:32
 */
@SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
@Component
@AllArgsConstructor
public class OrderInfoItemDaoImpl implements OrderInfoItemDao {
    private OrderInfoDao orderInfoDao;
    private OrderItemDao orderItemDao;

    @SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
    @SneakyThrows
    @Override
    public void insert(@SuppressWarnings("AlibabaLowerCamelCaseVariableNaming") OrderInfoWIthItemDTO orderInfoWIthItemDto) {
        Optional.ofNullable(orderInfoWIthItemDto).orElseThrow(RuntimeException::new);
        orderInfoDao.insert(Optional.ofNullable(orderInfoWIthItemDto.getInfo()).orElseThrow(RuntimeException::new));
        orderItemDao.batchInsert(Optional.ofNullable(orderInfoWIthItemDto.getItems()).orElseThrow(RuntimeException::new));
    }
}