package org.yuan.boot.webmvc.app.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.yuan.boot.webmvc.app.pojo.SysRole;
import org.yuan.boot.webmvc.app.pojo.condition.SysRoleCondition;
import org.yuan.boot.webmvc.app.pojo.vo.SysRoleVo;
import org.yuan.boot.webmvc.app.service.SysRoleService;
import org.yuan.boot.webmvc.pojo.ResponseResult;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-01 18:13
 */
@EqualsAndHashCode(callSuper = true)
@RestController
@RequestMapping("sys/role")
@AllArgsConstructor
@Api("角色信息")
public class SysRoleController extends ResultController {
    private SysRoleService sysRoleService;

    @ApiOperation(value = "分页查询", httpMethod = HTTP_METHOD_GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "data", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseResult data(SysRoleCondition condition) {
        return sysRoleService.selectPage(condition);
    }

    @ApiOperation(value = "列表查询", httpMethod = HTTP_METHOD_GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseResult list(SysRoleCondition condition) {
        return sysRoleService.selectList(condition);
    }

    @ApiOperation(value = "精确查询", httpMethod = HTTP_METHOD_GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseResult get(SysRole sysRole) {
        return sysRoleService.selectOne(sysRole);
    }

    @ApiOperation(value = "主键查询", httpMethod = HTTP_METHOD_GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseResult get(@PathVariable("id") Long id) {
        return sysRoleService.selectById(id);
    }

    @ApiOperation(value = "增加", httpMethod = HTTP_METHOD_POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping(value = {"save"}, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseResult save(@RequestBody @Validated(SysRoleVo.Save.class) SysRoleVo sysRoleVo, BindingResult result) {
        validate(result);
        return sysRoleService.save(sysRoleVo);
    }

    @ApiOperation(value = "修改", httpMethod = HTTP_METHOD_POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping(value = "update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseResult update(@RequestBody @Validated(SysRoleVo.Update.class) SysRoleVo sysRoleVo, BindingResult result) {
        validate(result);
        return sysRoleService.update(sysRoleVo);
    }

    @ApiOperation(value = "修改权限", httpMethod = HTTP_METHOD_POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping(value = "update/permission", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseResult changePermission(@RequestBody @Validated(SysRoleVo.ChangePermission.class) SysRoleVo sysRoleVo, BindingResult result) {
        validate(result);
        return sysRoleService.updatePermission(sysRoleVo);
    }

    @ApiOperation(value = "删除", httpMethod = HTTP_METHOD_GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "delete", params = "ids")
    public ResponseResult delete(List<Long> ids) {
        return sysRoleService.delete(ids);
    }

    @ApiOperation(value = "删除", httpMethod = HTTP_METHOD_GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "delete", params = "id")
    public ResponseResult delete(Long id) {
        return sysRoleService.delete(id);
    }
}
