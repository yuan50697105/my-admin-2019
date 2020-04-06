package org.yuan.boot.webmvc.app.dao.impl;

import cn.hutool.core.lang.Snowflake;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.db.dao.impl.BaseDaoImpl;
import org.yuan.boot.db.pojo.PageResult;
import org.yuan.boot.webmvc.app.dao.SysRoleService;
import org.yuan.boot.webmvc.app.mapper.SysRoleMapper;
import org.yuan.boot.webmvc.app.pojo.SysRole;
import org.yuan.boot.webmvc.app.pojo.SysRoleExample;
import org.yuan.boot.webmvc.app.pojo.condition.SysRoleCondition;
import org.yuan.boot.webmvc.app.pojo.converter.SysRoleConverter;
import org.yuan.boot.webmvc.app.pojo.vo.SysRoleVo;
import org.yuan.boot.webmvc.pojo.ResponseResult;
import org.yuan.boot.webmvc.utils.ResponseResults;

import java.util.Date;
import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-01 18:13
 */
@Service
public class SysRoleServiceImpl extends BaseDaoImpl<SysRole, Long, SysRoleMapper> implements SysRoleService {
    @Autowired
    private SysRoleConverter sysRoleConverter;
    @Autowired
    private Snowflake snowflake;

    @Override
    public ResponseResult page(SysRoleCondition condition) {
        PageHelper.startPage(condition.getPage(), condition.getSize());
        return ResponseResults.data(new PageResult<>(PageInfo.of(baseMapper().selectByCondition(condition))));
    }

    @Override
    public ResponseResult list(SysRoleCondition condition) {
        return ResponseResults.data(baseMapper().selectByCondition(condition));
    }

    @Override
    public ResponseResult get(SysRole sysRole) {
        return ResponseResults.data(baseMapper().selectOne(sysRole));
    }

    @Override
    public ResponseResult get(Long id) {
        return ResponseResults.data(baseMapper().selectByPrimaryKey(id));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult save(SysRoleVo sysRoleVo) {
        SysRole sysRole = sysRoleConverter.convert(sysRoleVo).setId(snowflake.nextId()).setCreateTime(new Date());
        baseMapper().insertSelective(sysRole);
        return ResponseResults.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult update(SysRoleVo sysRoleVo) {
        SysRole sysRole = sysRoleConverter.convert(sysRoleVo).setUpdateTime(new Date());
        baseMapper().updateByPrimaryKeySelective(sysRole);
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
        SysRoleExample example = new SysRoleExample();
        example.createCriteria().andIdIn(ids);
        baseMapper().deleteByExample(example);
        return ResponseResults.ok();
    }

}