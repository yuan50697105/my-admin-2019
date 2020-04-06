package org.yuan.boot.webmvc.app.service;

import org.yuan.boot.webmvc.app.pojo.SysRole;
import org.yuan.boot.webmvc.app.pojo.condition.SysRoleCondition;
import org.yuan.boot.webmvc.app.pojo.vo.SysRoleVo;
import org.yuan.boot.webmvc.pojo.ResponseResult;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-11 19:58
 */
public interface SysRoleService {
    ResponseResult selectPage(SysRoleCondition condition);

    ResponseResult selectList(SysRoleCondition condition);

    ResponseResult selectOne(SysRole sysRole);

    ResponseResult selectById(Long id);

    ResponseResult save(SysRoleVo sysRoleVo);

    ResponseResult update(SysRoleVo sysRoleVo);

    ResponseResult updatePermission(SysRoleVo sysRoleVo);

    ResponseResult delete(List<Long> ids);

    ResponseResult delete(Long id);
}
