package org.yuan.boot.app.db.module.mybatis.base.module.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import org.yuan.boot.app.db.module.mybatis.base.module.pojo.OrderInfo;
import org.yuan.boot.app.db.module.mybatis.base.module.pojo.OrderItem;

import java.util.List;

/**
 * @program: my-admin-shower
 * @description:
 * @author: yuane
 * @create: 2020-02-25 21:28
 */
@SuppressWarnings("AlibabaClassNamingShouldBeCamel")
@Data
@AllArgsConstructor
@Builder
public class OrderInfoWIthItemDTO {
    private OrderInfo info;
    @Singular
    private List<OrderItem> items;
}