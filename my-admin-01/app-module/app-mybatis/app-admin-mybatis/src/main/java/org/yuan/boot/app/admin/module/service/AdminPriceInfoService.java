package org.yuan.boot.app.admin.module.service;

import org.yuan.boot.app.admin.module.pojo.AdminPriceInfoFormVO;
import org.yuan.boot.commons.pojo.Result;

/**
 * @program: my-admin-shower
 * @description:
 * @author: yuane
 * @create: 2020-02-26 21:05
 */
@SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
public interface AdminPriceInfoService {
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    Result<?> add(AdminPriceInfoFormVO formVO);
}
