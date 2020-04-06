package org.yuan.boot.app.db.module.mybatis.base.module.pojo.condition;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.app.db.module.mybatis.base.commons.pojo.BaseQuery;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-03-01 22:32
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class OrderInfoQuery extends BaseQuery {
    private String orderNo;
    private String customerId;
    private String customerPhone;
    private String customerNickName;
}