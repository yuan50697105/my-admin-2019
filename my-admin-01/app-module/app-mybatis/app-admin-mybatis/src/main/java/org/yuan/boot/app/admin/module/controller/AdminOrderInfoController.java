package org.yuan.boot.app.admin.module.controller;

import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.boot.app.admin.module.service.AdminOrderInfoService;
import org.yuan.boot.commons.web.mvc.controller.BaseController;

/**
 * @program: my-admin-shower
 * @description:
 * @author: yuane
 * @create: 2020-02-26 21:06
 */
@RestController
@RequestMapping("admin/order")
@AllArgsConstructor
@Validated
public class AdminOrderInfoController extends BaseController {
    private AdminOrderInfoService adminOrderInfoService;
}