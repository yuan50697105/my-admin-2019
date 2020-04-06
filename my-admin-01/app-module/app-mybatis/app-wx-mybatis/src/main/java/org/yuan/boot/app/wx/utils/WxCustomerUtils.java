package org.yuan.boot.app.wx.utils;

import cn.hutool.extra.spring.SpringUtil;
import org.yuan.boot.app.db.core.constants.CustomerInfoConstants;
import org.yuan.boot.app.db.module.mybatis.base.module.pojo.CustomerInfo;
import org.yuan.boot.app.wx.converter.WxCustomerConverter;
import org.yuan.boot.app.wx.pojo.WxCustomerFormVO;

/**
 * @program: my-admin-01-wx
 * @description:
 * @author: yuane
 * @create: 2020-02-24 20:08
 */
public class WxCustomerUtils {
    public static CustomerInfo createNew(WxCustomerFormVO formVO) {
        WxCustomerConverter converter = converter();
        CustomerInfo customerInfo = converter.createNew(formVO);
        customerInfo.setEnabled(CustomerInfoConstants.ENABLE);
        return customerInfo;
    }

    public static void modifyFromVo(CustomerInfo customerInfo, WxCustomerFormVO wxCustomerFormVO) {
        WxCustomerConverter converter = converter();
        converter.modifyFromVo(customerInfo, wxCustomerFormVO);
    }

    private static WxCustomerConverter converter() {
        return SpringUtil.getBean(WxCustomerConverter.class);
    }
}