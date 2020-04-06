package org.yuan.boot.app.admin.module.controller;

import lombok.AllArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.boot.app.admin.module.pojo.AdminPriceInfoFormVO;
import org.yuan.boot.app.admin.module.service.AdminPriceInfoService;
import org.yuan.boot.commons.pojo.Result;
import org.yuan.boot.commons.web.mvc.controller.BaseController;

/**
 * @program: my-admin-shower
 * @description:
 * @author: yuane
 * @create: 2020-02-26 21:05
 */
@RestController
@RequestMapping("admin/price")
@AllArgsConstructor
public class AdminPriceInfoController extends BaseController {
    private AdminPriceInfoService adminPriceInfoService;

    @PostMapping("add")
    public Result<?> add(AdminPriceInfoFormVO formVO, BindingResult result) {
        validate(result);
        return adminPriceInfoService.add(formVO);
    }
}