package org.yuan.boot.app.db.module.mybatis.base.module.dao;

import org.yuan.boot.app.db.module.mybatis.base.module.pojo.dto.OrderInfoWIthItemDTO;

/**
 * @program: my-admin-shower
 * @description:
 * @author: yuane
 * @create: 2020-02-25 21:32
 */
@SuppressWarnings({"AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc", "AlibabaLowerCamelCaseVariableNaming"})
public interface OrderInfoItemDao {
    @SuppressWarnings({"AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc", "AlibabaLowerCamelCaseVariableNaming"})
    void insert(@SuppressWarnings("AlibabaLowerCamelCaseVariableNaming") OrderInfoWIthItemDTO infoWIthItemDTO);
}