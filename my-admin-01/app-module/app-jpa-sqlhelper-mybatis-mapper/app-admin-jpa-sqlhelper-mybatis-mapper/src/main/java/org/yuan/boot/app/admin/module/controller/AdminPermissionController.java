package org.yuan.boot.app.admin.module.controller;

import lombok.AllArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.yuan.boot.app.admin.core.constants.form.CommonsFormValidateConstants;
import org.yuan.boot.app.admin.module.pojo.AdminPermissionFormVO;
import org.yuan.boot.app.admin.module.service.AdminPermissionService;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.pojo.condition.AdminPermissionQuery;
import org.yuan.boot.commons.pojo.Result;
import org.yuan.boot.commons.web.mvc.controller.BaseController;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Collections;
import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 01:15
 */
@RestController
@RequestMapping("admin/permission")
@AllArgsConstructor
@Validated
public class AdminPermissionController extends BaseController {
    private AdminPermissionService adminPermissionService;

    @PostMapping("add")
    public Result<?> add(@RequestBody @Validated(AdminPermissionFormVO.Save.class) AdminPermissionFormVO adminPermissionFormVO, BindingResult result) {
        validate(result);
        return adminPermissionService.add(adminPermissionFormVO);
    }

    @PostMapping("update")
    public Result<?> update(@RequestBody @Validated(AdminPermissionFormVO.Update.class) AdminPermissionFormVO adminPermissionFormVO, BindingResult result) {
        validate(result);
        return adminPermissionService.update(adminPermissionFormVO);
    }

    @GetMapping("delete")
    public Result<?> delete(@RequestParam("id") @NotEmpty(message = CommonsFormValidateConstants.ID_NOT_NULL_MSG) List<Long> id) {
        return adminPermissionService.delete(id);
    }

    @GetMapping("delete/{id}")
    public Result<?> delete(@PathVariable("id") @NotNull(message = CommonsFormValidateConstants.ID_NOT_NULL_MSG) Long id) {
        return adminPermissionService.delete(Collections.singletonList(id));
    }

    @GetMapping("get")
    public Result<?> get(@NotNull(message = CommonsFormValidateConstants.ID_NOT_NULL_MSG) Long id) {
        return adminPermissionService.get(id);
    }

    @GetMapping("get/{id}")
    public Result<?> restGet(@PathVariable("id") @NotNull(message = CommonsFormValidateConstants.ID_NOT_NULL_MSG) Long id) {
        return get(id);
    }

    @GetMapping("data")
    public Result<?> data(AdminPermissionQuery condition) {
        return adminPermissionService.data(condition);
    }

    @GetMapping("list")
    public Result<?> list(AdminPermissionQuery condition) {
        return adminPermissionService.list(condition);
    }

}