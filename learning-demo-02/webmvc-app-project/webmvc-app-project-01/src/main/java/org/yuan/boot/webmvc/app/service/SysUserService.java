package org.yuan.boot.webmvc.app.service;

import org.yuan.boot.webmvc.app.pojo.SysUser;
import org.yuan.boot.webmvc.app.pojo.condition.SysUserCondition;
import org.yuan.boot.webmvc.app.pojo.vo.SysUserVo;
import org.yuan.boot.webmvc.pojo.ResponseResult;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-11 19:57
 */
public interface SysUserService {
    ResponseResult selectPage(SysUserCondition condition);

    ResponseResult selectList(SysUserCondition condition);

    ResponseResult selectOne(SysUser condition);

    ResponseResult selectById(Long id);

    ResponseResult save(SysUserVo sysUserVo);

    ResponseResult update(SysUserVo sysUserVo);

    ResponseResult updatePwd(SysUserVo sysUserVo);

    ResponseResult updateRole(SysUserVo sysUserVo);

    ResponseResult delete(List<Long> ids);

    ResponseResult delete(Long id);
}
