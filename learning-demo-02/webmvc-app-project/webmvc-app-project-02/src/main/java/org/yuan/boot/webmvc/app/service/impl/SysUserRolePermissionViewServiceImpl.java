package org.yuan.boot.webmvc.app.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yuan.boot.webmvc.app.dao.SysUserRolePermissionViewDao;
import org.yuan.boot.webmvc.app.pojo.SysUserRolePermissionView;
import org.yuan.boot.webmvc.app.pojo.converter.SysUserRolePermissionViewConverter;
import org.yuan.boot.webmvc.app.pojo.result.SysUserRolePermissionViewResult;
import org.yuan.boot.webmvc.app.service.SysUserRolePermissionViewService;
import org.yuan.boot.webmvc.pojo.ResponseResult;
import org.yuan.boot.webmvc.utils.ResponseResults;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-13 23:38
 */
@Service
@AllArgsConstructor
public class SysUserRolePermissionViewServiceImpl implements SysUserRolePermissionViewService {
    private SysUserRolePermissionViewDao sysUserRolePermissionViewDao;
    private SysUserRolePermissionViewConverter sysUserRolePermissionViewConverter;

    @Override
    public ResponseResult list() {
        List<SysUserRolePermissionView> sysUserRolePermissionViews = sysUserRolePermissionViewDao.list();
        SysUserRolePermissionViewResult sysUserRolePermissionViewResult = sysUserRolePermissionViewConverter.convertOne(sysUserRolePermissionViews);
        return ResponseResults.data(sysUserRolePermissionViewResult);
    }

}