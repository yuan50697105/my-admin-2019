package org.yuan.boot.app.db.module.mybatis.base.module.dao;

import org.yuan.boot.app.db.module.mybatis.base.commons.dao.BaseDao;
import org.yuan.boot.app.db.module.mybatis.base.module.pojo.CustomerInfo;
import org.yuan.boot.app.db.module.mybatis.base.module.pojo.condition.CustomerInfoQuery;
import org.yuan.boot.commons.base.module.mybaits.base.pojo.PageResult;

/**
 * @program: my-admin-01-wx
 * @description:
 * @author: yuane
 * @create: 2020-02-24 19:58
 */
@SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
public interface CustomerInfoDao extends BaseDao<CustomerInfo> {
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    void insert(CustomerInfo customerInfo);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    void update(CustomerInfo customerInfo);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    CustomerInfo getById(Long id);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    PageResult<CustomerInfo> selectPage(CustomerInfoQuery condition);
}
