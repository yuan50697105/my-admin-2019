package org.yuan.boot.webmvc.app.dao.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.db.pojo.PageResult;
import org.yuan.boot.db.utils.PageResults;
import org.yuan.boot.webmvc.app.dao.SysPermissionDao;
import org.yuan.boot.webmvc.app.mapper.SysPermissionMapper;
import org.yuan.boot.webmvc.app.pojo.SysPermission;
import org.yuan.boot.webmvc.app.pojo.SysPermissionExample;
import org.yuan.boot.webmvc.app.pojo.condition.SysPermissionCondition;
import org.yuan.boot.webmvc.pojo.ResponseResult;
import org.yuan.boot.webmvc.utils.ResponseResults;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-04 13:15
 */
@AllArgsConstructor
@Component
public class SysPermissionDaoImpl extends BaseDaoImpl<SysPermission, SysPermissionMapper> implements SysPermissionDao {

    @Override
    public ResponseResult page(SysPermissionCondition condition) {
        PageHelper.startPage(condition.getPage(), condition.getSize());
        return ResponseResults.data(PageResults.of(PageInfo.of(baseMapper().selectByCondition(condition))));
    }

    @Override
    public ResponseResult list(SysPermissionCondition condition) {
        return ResponseResults.data(baseMapper().selectByCondition(condition));
    }

    @Override
    public ResponseResult get(SysPermission sysPermission) {
        return ResponseResults.data(baseMapper().selectOne(sysPermission));
    }

    @Override
    public ResponseResult get(Long id) {
        return ResponseResults.data(baseMapper().selectByPrimaryKey(id));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult save(SysPermission sysPermission) {
        sysPermission.setId(snowflake().nextId());
        sysPermission.setCreateTime(new Date());
        baseMapper().insertSelective(sysPermission);
        return ResponseResults.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult update(SysPermission sysPermission) {
        sysPermission.setUpdateTime(new Date());
        baseMapper().updateByPrimaryKeySelective(sysPermission);
        return ResponseResults.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult delete(Long id) {
        baseMapper().deleteByPrimaryKey(id);
        return ResponseResults.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult delete(List<Long> ids) {
        SysPermissionExample example = new SysPermissionExample();
        example.or().andIdIn(ids);
        baseMapper().deleteByExample(example);
        return ResponseResults.ok();
    }

    @Override
    public List<Long> selectByIds(List<Long> permissionIds) {
        SysPermissionExample example = new SysPermissionExample();
        example.or().andIdIn(permissionIds);
        List<SysPermission> sysPermissions = baseMapper().selectByExample(example);
        if (null != sysPermissions) {
            return sysPermissions.stream().map(SysPermission::getId).collect(Collectors.toList());
        } else {
            return Collections.emptyList();
        }
    }
}