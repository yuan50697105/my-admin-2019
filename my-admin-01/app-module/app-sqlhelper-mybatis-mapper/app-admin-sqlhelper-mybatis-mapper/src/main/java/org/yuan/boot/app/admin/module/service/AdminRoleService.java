package org.yuan.boot.app.admin.module.service;

import org.yuan.boot.app.admin.module.pojo.AdminRoleFormVO;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.mapper.module.pojo.condition.AdminRoleQuery;
import org.yuan.boot.commons.pojo.Result;

import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 01:16
 */
@SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
public interface AdminRoleService {
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    Result<?> add(AdminRoleFormVO adminRoleFormVO);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    Result<?> update(AdminRoleFormVO adminRoleFormVO);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    Result<?> updateRolePermission(AdminRoleFormVO adminRoleFormVO);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    Result<?> delete(List<Long> ids);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    Result<?> get(Long id);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    Result<?> data(AdminRoleQuery condition);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    Result<?> list(AdminRoleQuery condition);
}
