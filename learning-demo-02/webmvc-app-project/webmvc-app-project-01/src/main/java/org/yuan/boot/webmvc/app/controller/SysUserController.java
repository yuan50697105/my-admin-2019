package org.yuan.boot.webmvc.app.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.yuan.boot.webmvc.app.pojo.SysUser;
import org.yuan.boot.webmvc.app.pojo.condition.SysUserCondition;
import org.yuan.boot.webmvc.app.pojo.vo.SysUserVo;
import org.yuan.boot.webmvc.app.service.SysUserService;
import org.yuan.boot.webmvc.pojo.ResponseResult;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 22:35
 */
@EqualsAndHashCode(callSuper = true)
@Api("用户信息")
@RestController
@RequestMapping("sys/user")
@AllArgsConstructor
public class SysUserController extends ResultController {
    private SysUserService sysUserService;

    @ApiOperation(value = "分页查询", produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "data", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseResult data(@ApiParam SysUserCondition condition) {
        return sysUserService.selectPage(condition);
    }

    @ApiOperation(value = "列表查询", produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseResult list(SysUserCondition condition) {
        return sysUserService.selectList(condition);
    }

    @ApiOperation(value = "列表查询", produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "list/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseResult list(@PathVariable("name") String name) {
        return sysUserService.selectList(new SysUserCondition().setName(name));
    }

    @ApiOperation(value = "精确查询", produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseResult get(SysUser condition) {
        return sysUserService.selectOne(condition);
    }

    @ApiOperation(value = "主键查询")
    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseResult get(@PathVariable("id") Long id) {
        return sysUserService.selectOne(SysUser.builder().id(id).build());
    }

    @ApiOperation(value = "增加", httpMethod = HTTP_METHOD_POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping(value = {"save"}, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseResult save(@RequestBody @Validated(SysUserVo.Save.class) SysUserVo sysUserVo, BindingResult result) {
        validate(result);
        return sysUserService.save(sysUserVo);
    }

    @ApiOperation(value = "修改", httpMethod = HTTP_METHOD_POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping(value = "update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseResult update(@RequestBody @Validated(SysUserVo.Update.class) SysUserVo sysUserVo, BindingResult result) {
        validate(result);
        return sysUserService.update(sysUserVo);
    }

    @ApiOperation(value = "修改密码", consumes = MediaType.APPLICATION_JSON_VALUE, httpMethod = HTTP_METHOD_POST)
    @PostMapping(value = "update/pwd", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseResult changePwd(@RequestBody @Validated(SysUserVo.ChangePwd.class) SysUserVo sysUserVo, BindingResult result) {
        validate(result);
        return sysUserService.updatePwd(sysUserVo);
    }

    @ApiOperation(value = "修改角色", httpMethod = HTTP_METHOD_POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @PostMapping(value = "update/role", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseResult changeRole(@RequestBody @Validated({SysUserVo.ChangeRole.class}) SysUserVo sysUserVo, BindingResult result) {
        validate(result);
        return sysUserService.updateRole(sysUserVo);
    }

    @ApiOperation(value = "删除", httpMethod = HTTP_METHOD_GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "delete", params = "ids", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseResult delete(List<Long> ids) {
        return sysUserService.delete(ids);
    }

    @ApiOperation(value = "删除", httpMethod = HTTP_METHOD_GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "delete", params = "id", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseResult delete(Long id) {
        return sysUserService.delete(id);
    }
}