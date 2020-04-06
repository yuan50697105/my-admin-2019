package org.yuan.boot.webmvc.app.dao;

import org.yuan.boot.webmvc.app.pojo.SysPermission;
import org.yuan.boot.webmvc.app.pojo.condition.SysPermissionCondition;
import org.yuan.boot.webmvc.pojo.ResponseResult;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-04 13:15
 */
public interface SysPermissionDao extends BaseDao<SysPermission> {
    ResponseResult page(SysPermissionCondition condition);

    ResponseResult list(SysPermissionCondition condition);

    ResponseResult get(SysPermission sysPermission);

    ResponseResult get(Long id);

    ResponseResult save(SysPermission sysPermission);

    ResponseResult update(SysPermission sysPermissionVo);

    ResponseResult delete(Long id);

    ResponseResult delete(List<Long> ids);

    List<Long> selectByIds(List<Long> permissionIds);
}
