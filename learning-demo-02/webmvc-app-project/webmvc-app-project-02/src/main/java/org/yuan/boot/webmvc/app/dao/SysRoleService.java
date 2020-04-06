package org.yuan.boot.webmvc.app.dao;

import org.yuan.boot.webmvc.app.pojo.SysRole;
import org.yuan.boot.webmvc.app.pojo.condition.SysRoleCondition;
import org.yuan.boot.webmvc.app.pojo.vo.SysRoleVo;
import org.yuan.boot.webmvc.pojo.ResponseResult;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-01 18:12
 */
public interface SysRoleService extends BaseService<SysRole> {
    ResponseResult page(SysRoleCondition condition);

    ResponseResult list(SysRoleCondition condition);

    ResponseResult get(SysRole sysRole);

    ResponseResult get(Long id);

    ResponseResult save(SysRoleVo sysRoleVo);

    ResponseResult update(SysRoleVo sysRoleVo);

    ResponseResult delete(Long id);

    ResponseResult delete(List<Long> ids);
}
