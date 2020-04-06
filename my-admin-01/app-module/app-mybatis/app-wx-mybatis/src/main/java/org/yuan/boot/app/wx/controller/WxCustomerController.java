package org.yuan.boot.app.wx.controller;

import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.yuan.boot.app.db.module.mybatis.base.module.pojo.condition.CustomerInfoQuery;
import org.yuan.boot.app.wx.pojo.WxCustomerFormVO;
import org.yuan.boot.app.wx.service.WxCustomerService;
import org.yuan.boot.commons.pojo.Result;
import org.yuan.boot.commons.web.mvc.controller.BaseController;

/**
 * @program: my-admin-01-wx
 * @description: 微信客户控制器
 * @author: yuane
 * @create: 2020-02-24 20:05
 */
@RestController
@RequestMapping("wx/customer")
@AllArgsConstructor
public class WxCustomerController extends BaseController {
    private WxCustomerService wxCustomerService;

    @PostMapping("add")
    public Result<?> add(@RequestBody @Validated(WxCustomerFormVO.Create.class) WxCustomerFormVO wxCustomerFormVO) {
        return wxCustomerService.add(wxCustomerFormVO);
    }

    @PostMapping("update")
    public Result<?> update(@RequestBody @Validated(WxCustomerFormVO.Update.class) WxCustomerFormVO wxCustomerFormVO) {
        return wxCustomerService.update(wxCustomerFormVO);
    }

    @GetMapping("data")
    public Result<?> data(CustomerInfoQuery condition) {
        return wxCustomerService.data(condition);
    }



}