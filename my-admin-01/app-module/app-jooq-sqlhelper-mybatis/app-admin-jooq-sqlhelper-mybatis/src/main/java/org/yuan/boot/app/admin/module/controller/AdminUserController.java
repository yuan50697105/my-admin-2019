package org.yuan.boot.app.admin.module.controller;

import lombok.AllArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.yuan.boot.app.admin.core.constants.form.CommonsFormValidateConstants;
import org.yuan.boot.app.admin.module.pojo.AdminUserFormVO;
import org.yuan.boot.app.admin.module.service.AdminUserService;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.pojo.condition.AdminUserQuery;
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
@RequestMapping("admin/user")
@AllArgsConstructor
@Validated
public class AdminUserController extends BaseController {
    private AdminUserService adminUserService;

    @PostMapping("add")
    public Result<?> add(@RequestBody @Validated(AdminUserFormVO.Save.class) AdminUserFormVO adminUserFormVO, BindingResult result) {
        validate(result);
        return adminUserService.add(adminUserFormVO);
    }

    @PostMapping("update")
    public Result<?> update(@RequestBody @Validated(AdminUserFormVO.Update.class) AdminUserFormVO adminUserFormVO, BindingResult result) {
        validate(result);
        return adminUserService.update(adminUserFormVO);
    }

    @PostMapping("update/role")
    public Result<?> updateRole(@RequestBody @Validated(AdminUserFormVO.UpdateRole.class) AdminUserFormVO adminUserFormVO, BindingResult result) {
        validate(result);
        return adminUserService.updateRole(adminUserFormVO);
    }

    @GetMapping("delete")
    public Result<?> delete(@RequestParam("id") @NotEmpty(message = CommonsFormValidateConstants.ID_NOT_NULL_MSG) List<Long> id) {
        return adminUserService.deleteByIds(id);
    }

    @GetMapping("delete/{id}")
    public Result<?> delete(@PathVariable("id") @NotNull(message = CommonsFormValidateConstants.ID_NOT_NULL_MSG) Long id) {
        return delete(Collections.singletonList(id));
    }

    @GetMapping("enable")
    public Result<?> enable(@RequestParam("id") @NotNull(message = CommonsFormValidateConstants.ID_NOT_NULL_MSG) List<Long> ids) {
        return adminUserService.enableByIds(ids);
    }

    @GetMapping("enable/{id}")
    public Result<?> enable(@PathVariable("id") @NotNull(message = CommonsFormValidateConstants.ID_NOT_NULL_MSG) Long id) {
        return enable(Collections.singletonList(id));
    }

    @GetMapping("disable")
    public Result<?> disable(@RequestParam("id") @NotNull(message = CommonsFormValidateConstants.ID_NOT_NULL_MSG) List<Long> ids) {
        return adminUserService.disableByIds(ids);
    }

    @GetMapping("disable/{id}")
    public Result<?> disable(@PathVariable("id") @NotNull(message = CommonsFormValidateConstants.ID_NOT_NULL_MSG) Long id) {
        return enable(Collections.singletonList(id));
    }

    @GetMapping("data")
    public Result<?> data(AdminUserQuery condition) {
        return adminUserService.data(condition);
    }

    @GetMapping("list")
    public Result<?> list(AdminUserQuery condition) {
        return adminUserService.list(condition);
    }

    @GetMapping("get")
    public Result<?> get(@NotNull(message = CommonsFormValidateConstants.ID_NOT_NULL_MSG) Long id) {
        return adminUserService.get(id);
    }

    @GetMapping("get/{id}")
    public Result<?> jsonGet(@PathVariable("id") @NotNull(message = CommonsFormValidateConstants.ID_NOT_NULL_MSG) Long id) {
        return get(id);
    }

}