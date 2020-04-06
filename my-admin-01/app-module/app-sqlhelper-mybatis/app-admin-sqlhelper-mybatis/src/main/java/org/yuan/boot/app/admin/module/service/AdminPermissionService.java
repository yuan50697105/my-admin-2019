package org.yuan.boot.app.admin.module.service;

import org.yuan.boot.app.admin.module.pojo.AdminPermissionFormVO;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.base.module.pojo.condition.AdminPermissionQuery;
import org.yuan.boot.commons.pojo.Result;

import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 01:17
 */
@SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
public interface AdminPermissionService {
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    Result<?> add(AdminPermissionFormVO adminPermissionFormVO);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    Result<?> update(AdminPermissionFormVO adminPermissionFormVO);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    Result<?> delete(List<Long> ids);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    Result<?> get(Long id);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    Result<?> data(AdminPermissionQuery condition);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    Result<?> list(AdminPermissionQuery condition);
}
