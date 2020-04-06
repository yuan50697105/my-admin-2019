package org.yuan.boot.webmvc.app.dao.impl;

import cn.hutool.core.lang.Snowflake;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.db.dao.impl.BaseDaoImpl;
import org.yuan.boot.db.pojo.PageResult;
import org.yuan.boot.db.utils.PageResults;
import org.yuan.boot.webmvc.app.dao.SysPermissionService;
import org.yuan.boot.webmvc.app.mapper.SysPermissionMapper;
import org.yuan.boot.webmvc.app.pojo.SysPermission;
import org.yuan.boot.webmvc.app.pojo.SysPermissionExample;
import org.yuan.boot.webmvc.app.pojo.condition.SysPermissionCondition;
import org.yuan.boot.webmvc.app.pojo.converter.SysPermissionConverter;
import org.yuan.boot.webmvc.app.pojo.vo.SysPermissionVo;
import org.yuan.boot.webmvc.pojo.ResponseResult;
import org.yuan.boot.webmvc.utils.ResponseResults;

import java.util.Arrays;
import java.util.Date;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-04 13:15
 */
@Service
public class SysPermissionServiceImpl extends BaseDaoImpl<SysPermission, Long, SysPermissionMapper> implements SysPermissionService {
    @Autowired
    private SysPermissionConverter sysPermissionConverter;
    @Autowired
    private Snowflake snowflake;

    @Override
    public ResponseResult page(SysPermissionCondition condition) {
        PageHelper.startPage(condition.getPage(), condition.getSize());
        return ResponseResults.data(PageResults.of(new PageInfo<>(baseMapper().selectByCondition(condition))));
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
    public ResponseResult save(SysPermissionVo sysPermissionVo) {
        SysPermission sysPermission = sysPermissionConverter.convert(sysPermissionVo);
        sysPermission.setId(snowflake.nextId());
        sysPermission.setCreateTime(new Date());
        baseMapper().insertSelective(sysPermission);
        return ResponseResults.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult update(SysPermissionVo sysPermissionVo) {
        SysPermission sysPermission = sysPermissionConverter.convert(sysPermissionVo);
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
    public ResponseResult delete(Long[] ids) {
        SysPermissionExample example = new SysPermissionExample();
        example.or().andIdIn(Arrays.asList(ids));
        baseMapper().deleteByExample(example);
        return ResponseResults.ok();
    }
}