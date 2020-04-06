package org.yuan.boot.app.wx.service;

import org.yuan.boot.app.db.module.mybatis.base.module.pojo.condition.CustomerInfoQuery;
import org.yuan.boot.app.wx.pojo.WxCustomerFormVO;
import org.yuan.boot.commons.pojo.Result;

/**
 * @program: my-admin-01-wx
 * @description:
 * @author: yuane
 * @create: 2020-02-24 20:07
 */
@SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
public interface WxCustomerService {
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    Result<?> add(WxCustomerFormVO wxCustomerFormVO);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    Result<?> update(WxCustomerFormVO wxCustomerFormVO);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    Result<?> data(CustomerInfoQuery condition);
}
