package org.yuan.boot.app.admin.module.service;

import org.yuan.boot.app.admin.module.pojo.AdminUserFormVO;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.pojo.condition.AdminUserQuery;
import org.yuan.boot.commons.pojo.Result;

import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 01:16
 */
@SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
public interface AdminUserService {
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    Result<?> add(AdminUserFormVO adminUserFormVO);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    Result<?> update(AdminUserFormVO adminUserFormVO);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    Result<?> updateUserRole(AdminUserFormVO adminUserFormVO);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    Result<?> delete(List<Long> ids);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    Result<?> data(AdminUserQuery condition);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    Result<?> list(AdminUserQuery condition);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    Result<?> get(Long id);
}
