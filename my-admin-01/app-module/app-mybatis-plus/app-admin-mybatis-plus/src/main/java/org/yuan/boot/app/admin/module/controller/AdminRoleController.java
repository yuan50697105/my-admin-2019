package org.yuan.boot.app.admin.module.controller;

import lombok.AllArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.yuan.boot.app.admin.core.constants.form.CommonsFormValidateConstants;
import org.yuan.boot.app.admin.module.pojo.AdminRoleFormVO;
import org.yuan.boot.app.admin.module.service.AdminRoleService;
import org.yuan.boot.app.db.module.mybatis.plus.module.pojo.condition.AdminRoleQuery;
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
@RequestMapping("admin/role")
@AllArgsConstructor
@Validated
public class AdminRoleController extends BaseController {
    private AdminRoleService adminRoleService;

    @PostMapping("add")
    public Result<?> add(@RequestBody @Validated(AdminRoleFormVO.Save.class) AdminRoleFormVO adminRoleFormVO, BindingResult result) {
        validate(result);
        return adminRoleService.add(adminRoleFormVO);
    }

    @PostMapping("update")
    public Result<?> update(@RequestBody @Validated(AdminRoleFormVO.UpdateInfo.class) AdminRoleFormVO adminRoleFormVO, BindingResult result) {
        validate(result);
        return adminRoleService.update(adminRoleFormVO);
    }

    @PostMapping("update/permission")
    public Result<?> updatePermission(@RequestBody @Validated(AdminRoleFormVO.UpdatePermission.class) AdminRoleFormVO adminRoleFormVO, BindingResult result) {
        validate(result);
        return adminRoleService.updatePermission(adminRoleFormVO);
    }

    @GetMapping("delete")
    public Result<?> delete(@RequestParam("id") @NotEmpty(message = CommonsFormValidateConstants.ID_NOT_NULL_MSG) List<Long> id) {
        return adminRoleService.delete(id);
    }

    @GetMapping("delete/{id}")
    public Result<?> delete(@PathVariable("id") @NotNull(message = CommonsFormValidateConstants.ID_NOT_NULL_MSG) Long id) {
        return delete(Collections.singletonList(id));
    }

    @GetMapping("get")
    public Result<?> get(@NotNull(message = CommonsFormValidateConstants.ID_NOT_NULL_MSG) Long id) {
        return adminRoleService.get(id);
    }

    @GetMapping("get/{id}")
    public Result<?> restGet(@PathVariable("id") @NotNull(message = CommonsFormValidateConstants.ID_NOT_NULL_MSG) Long id) {
        return get(id);
    }

    @GetMapping("data")
    public Result<?> data(AdminRoleQuery condition) {
        return adminRoleService.data(condition);
    }

    @GetMapping("list")
    public Result<?> list(AdminRoleQuery condition) {
        return adminRoleService.list(condition);
    }
}