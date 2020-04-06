package org.yuan.boot.app.db.module.mybatis.base.module.dao;

import org.yuan.boot.app.db.module.mybatis.base.commons.dao.BaseDao;
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
@SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
public interface OrderInfoDao extends BaseDao<OrderInfo> {
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    void insert(OrderInfo orderInfo);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    PageResult<OrderInfo> selectPage(OrderInfoQuery query);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<OrderInfo> selectList(OrderInfoQuery query);
}
