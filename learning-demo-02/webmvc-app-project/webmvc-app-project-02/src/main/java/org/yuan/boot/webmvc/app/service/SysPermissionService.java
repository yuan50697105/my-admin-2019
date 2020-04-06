package org.yuan.boot.webmvc.app.service;

import org.yuan.boot.webmvc.app.pojo.SysPermission;
import org.yuan.boot.webmvc.app.pojo.condition.SysPermissionCondition;
import org.yuan.boot.webmvc.app.pojo.vo.SysPermissionVo;
import org.yuan.boot.webmvc.pojo.ResponseResult;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-11 19:58
 */
public interface SysPermissionService {
    ResponseResult selectPage(SysPermissionCondition condition);

    ResponseResult selectList(SysPermissionCondition condition);

    ResponseResult selectOne(SysPermission permission);

    ResponseResult selectById(Long id);

    ResponseResult save(SysPermissionVo sysPermissionVo);

    ResponseResult update(SysPermissionVo sysPermissionVo);

    ResponseResult delete(Long id);

    ResponseResult delete(List<Long> ids);
}
