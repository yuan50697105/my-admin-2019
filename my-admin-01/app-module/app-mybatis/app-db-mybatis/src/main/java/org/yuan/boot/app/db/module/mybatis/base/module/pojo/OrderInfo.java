package org.yuan.boot.app.db.module.mybatis.base.module.pojo;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.yuan.boot.app.db.module.mybatis.base.commons.pojo.BaseEntity;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class OrderInfo extends BaseEntity {
    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 客户ID
     */
    private String customerId;

    /**
     * 微信OPENID
     */
    private String customerOpenId;

    /**
     * 微信UNIONID
     */
    private String customerUnionId;

    /**
     * 订单总价
     */
    private BigDecimal totalPrice;

    /**
     * 订单类型
     */
    private Integer type;


}