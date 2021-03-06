package org.yuan.boot.webmvc.app.dao;

import org.yuan.boot.webmvc.app.pojo.SysPermission;
import org.yuan.boot.webmvc.app.pojo.condition.SysPermissionCondition;
import org.yuan.boot.webmvc.app.pojo.vo.SysPermissionVo;
import org.yuan.boot.webmvc.pojo.ResponseResult;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-04 13:15
 */
public interface SysPermissionService extends BaseService<SysPermission> {
    ResponseResult page(SysPermissionCondition condition);

    ResponseResult list(SysPermissionCondition condition);

    ResponseResult get(SysPermission sysPermission);

    ResponseResult get(Long id);

    ResponseResult save(SysPermissionVo sysPermissionVo);

    ResponseResult update(SysPermissionVo sysPermissionVo);

    ResponseResult delete(Long id);

    ResponseResult delete(Long[] ids);
}
