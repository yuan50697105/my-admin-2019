package org.yuan.boot.webmvc.app.dao;

import org.yuan.boot.webmvc.app.pojo.SysUser;
import org.yuan.boot.webmvc.app.pojo.condition.SysUserCondition;
import org.yuan.boot.webmvc.app.pojo.vo.SysUserVo;
import org.yuan.boot.webmvc.exception.NoValidateResultRuntimeException;
import org.yuan.boot.webmvc.pojo.ResponseResult;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 22:31
 */
public interface SysUserService extends BaseService<SysUser> {
    ResponseResult page(SysUserCondition condition);

    ResponseResult list(SysUserCondition condition);

    ResponseResult get(SysUser condition) throws NoValidateResultRuntimeException;

    ResponseResult save(SysUserVo sysUserVo);
}
