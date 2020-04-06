package org.yuan.boot.app.wx.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.yuan.boot.app.db.module.mybatis.base.module.pojo.CustomerInfo;
import org.yuan.boot.app.wx.pojo.WxCustomerFormVO;

/**
 * @program: my-admin-01-wx
 * @description:
 * @author: yuane
 * @create: 2020-02-24 20:08
 */
@SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
@Mapper(componentModel = "spring")
public interface WxCustomerConverter {
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    @Mapping(target = "gender", ignore = true)
    @Mapping(target = "enabled", ignore = true)
    CustomerInfo createNew(WxCustomerFormVO formVO);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    @Mapping(target = "gender", ignore = true)
    @Mapping(target = "enabled", ignore = true)
    void modifyFromVo(@MappingTarget CustomerInfo customerInfo, WxCustomerFormVO wxCustomerFormVO);
}
