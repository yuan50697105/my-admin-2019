package org.yuan.boot.webmvc.app.service.impl;

import cn.hutool.core.thread.ThreadUtil;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.webmvc.app.dao.SysRoleDao;
import org.yuan.boot.webmvc.app.dao.SysUserDao;
import org.yuan.boot.webmvc.app.dao.SysUserRoleDao;
import org.yuan.boot.webmvc.app.exception.ExistResultRuntimeException;
import org.yuan.boot.webmvc.app.pojo.SysUser;
import org.yuan.boot.webmvc.app.pojo.condition.SysUserCondition;
import org.yuan.boot.webmvc.app.pojo.converter.SysUserConverter;
import org.yuan.boot.webmvc.app.pojo.converter.SysUserRoleConverter;
import org.yuan.boot.webmvc.app.pojo.vo.SysUserVo;
import org.yuan.boot.webmvc.app.service.SysUserService;
import org.yuan.boot.webmvc.app.utils.ResultConstants;
import org.yuan.boot.webmvc.app.utils.ResultUtils;
import org.yuan.boot.webmvc.pojo.ResponseResult;
import org.yuan.boot.webmvc.utils.ResponseResults;

import java.util.List;
import java.util.Optional;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-11 19:57
 */
@AllArgsConstructor
@Service
@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
public class SysUserServiceImpl implements SysUserService {
    private SysUserConverter sysUserConverter;
    private SysUserRoleConverter sysUserRoleConverter;
    private SysUserDao sysUserDao;
    private PasswordEncoder passwordEncoder;
    private SysUserRoleDao sysUserRoleDao;
    private SysRoleDao sysRoleDao;

    @Override
    public ResponseResult selectPage(SysUserCondition condition) {
        return ResponseResults.data(sysUserDao.selectPage(condition));
    }

    @Override
    public ResponseResult selectList(SysUserCondition condition) {
        return ResponseResults.data(sysUserDao.selectList(condition));
    }

    @Override
    public ResponseResult selectOne(SysUser condition) {
        return ResponseResults.data(sysUserDao.selectOne(condition));
    }

    @Override
    public ResponseResult selectById(Long id) {
        return ResponseResults.data(sysRoleDao.selectById(id));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult save(SysUserVo sysUserVo) {
        SysUser sysUser = sysUserConverter.convertForSave(sysUserVo);
        Optional<SysUser> optional = sysUserDao.selectByUsername(sysUser.getUsername());
        if (optional.isPresent()) {
            throw new ExistResultRuntimeException(ResultUtils.existError("username已存在"));
        }
        sysUserDao.save(sysUser);
        ThreadUtil.execAsync(() -> {
            List<Long> roleIds = sysRoleDao.selectByIds(sysUserVo.getRoleIds());
            sysUserRoleDao.batchSave(sysUserRoleConverter.convert(sysUser.getId(), roleIds));
        });
        return ResponseResults.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult update(SysUserVo sysUserVo) {
        SysUser sysUser = sysUserConverter.convertForUpdate(sysUserVo);
        sysUserDao.update(sysUser);
        return ResponseResults.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult updatePwd(SysUserVo sysUserVo) {
        ResponseResult responseResult;
        Optional<SysUser> optional = sysUserDao.selectByUsername(sysUserVo.getUsername());
        if (!optional.isPresent()) {
            responseResult = ResponseResults.error(ResultConstants.CHANGE_PASSWORD_USER_NOT_HAD, "用户不存在");
        } else {
            SysUser sysUser = optional.get();
            String password = sysUser.getPassword();
            String oldPwd = sysUserVo.getOldPwd();
            String newPwd = sysUserVo.getNewPwd();
            if (passwordEncoder.matches(oldPwd, password)) {
                sysUser.setPassword(passwordEncoder.encode(newPwd));
                sysUserDao.update(sysUser);
                responseResult = ResponseResults.ok();
            } else {
                responseResult = ResponseResults.error(ResultConstants.CHANGE_PASSWORD_USER_OLD_PWD_ERROR, "密码不正确");
            }
        }
        return responseResult;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult updateRole(SysUserVo sysUserVo) {
        Long userId = sysUserVo.getId();
        List<Long> roleIds = sysUserVo.getRoleIds();
        roleIds = sysRoleDao.selectByIds(roleIds);
        sysUserRoleDao.batchUpdate(new SysUser().setId(userId), sysUserRoleConverter.convert(userId, roleIds));
        return ResponseResults.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult delete(List<Long> ids) {
        sysUserDao.delete(ids);
        sysUserRoleDao.deleteByUserIds(ids);
        return ResponseResults.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult delete(Long id) {
        sysUserDao.delete(id);
        sysUserRoleDao.deleteByUserId(id);
        return ResponseResults.ok();
    }
}