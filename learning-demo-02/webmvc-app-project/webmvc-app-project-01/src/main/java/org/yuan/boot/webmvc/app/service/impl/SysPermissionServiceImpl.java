package org.yuan.boot.webmvc.app.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.webmvc.app.dao.SysPermissionDao;
import org.yuan.boot.webmvc.app.dao.SysRolePermissionDao;
import org.yuan.boot.webmvc.app.pojo.SysPermission;
import org.yuan.boot.webmvc.app.pojo.condition.SysPermissionCondition;
import org.yuan.boot.webmvc.app.pojo.converter.SysPermissionConverter;
import org.yuan.boot.webmvc.app.pojo.vo.SysPermissionVo;
import org.yuan.boot.webmvc.app.service.SysPermissionService;
import org.yuan.boot.webmvc.pojo.ResponseResult;
import org.yuan.boot.webmvc.utils.ResponseResults;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-11 19:58
 */
@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
@AllArgsConstructor
public class SysPermissionServiceImpl implements SysPermissionService {
    private SysPermissionDao sysPermissionDao;
    private SysRolePermissionDao sysRolePermissionDao;
    private SysPermissionConverter sysPermissionConverter;

    @Override
    public ResponseResult selectPage(SysPermissionCondition condition) {
        return ResponseResults.data(sysPermissionDao.page(condition));
    }

    @Override
    public ResponseResult selectList(SysPermissionCondition condition) {
        return ResponseResults.data(sysPermissionDao.list(condition));
    }

    @Override
    public ResponseResult selectOne(SysPermission permission) {
        return ResponseResults.data(sysPermissionDao.get(permission));
    }

    @Override
    public ResponseResult selectById(Long id) {
        return ResponseResults.data(sysPermissionDao.get(id));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult save(SysPermissionVo sysPermissionVo) {
        SysPermission sysPermission = sysPermissionConverter.convert(sysPermissionVo);
        sysPermissionDao.save(sysPermission);
        return ResponseResults.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult update(SysPermissionVo sysPermissionVo) {
        SysPermission sysPermission = sysPermissionConverter.convert(sysPermissionVo);
        sysPermissionDao.update(sysPermission);
        return ResponseResults.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult delete(Long id) {
        sysPermissionDao.delete(id);
        sysRolePermissionDao.deleteByPermissionId(id);
        return ResponseResults.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult delete(List<Long> ids) {
        sysPermissionDao.delete(ids);
        sysRolePermissionDao.deleteByPermissionIds(ids);
        return ResponseResults.ok();
    }
}