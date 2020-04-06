package org.yuan.boot.webmvc.app.dao.impl;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.http.HttpStatus;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.db.dao.impl.BaseDaoImpl;
import org.yuan.boot.db.pojo.PageResult;
import org.yuan.boot.webmvc.app.dao.SysUserService;
import org.yuan.boot.webmvc.app.mapper.SysUserMapper;
import org.yuan.boot.webmvc.app.pojo.SysUser;
import org.yuan.boot.webmvc.app.pojo.condition.SysUserCondition;
import org.yuan.boot.webmvc.app.pojo.converter.SysUserConverter;
import org.yuan.boot.webmvc.app.pojo.vo.SysUserVo;
import org.yuan.boot.webmvc.exception.NoValidateResultRuntimeException;
import org.yuan.boot.webmvc.pojo.ResponseResult;
import org.yuan.boot.webmvc.utils.ResponseResults;

import java.util.Date;
import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 22:31
 */
@Service
public class SysUserServiceImpl extends BaseDaoImpl<SysUser, Long, SysUserMapper> implements SysUserService {
    @Autowired
    private SysUserConverter sysUserConverter;
    @Autowired
    private Snowflake snowflake;

    @Override
    public ResponseResult page(SysUserCondition condition) {
        PageHelper.startPage(condition.getPage(), condition.getSize());
        List<SysUser> list = baseMapper().selectByCondition(condition);
        return ResponseResults.data(new PageResult<>(PageInfo.of(list)));
    }

    @Override
    public ResponseResult list(SysUserCondition condition) {
        return ResponseResults.data(baseMapper().selectByCondition(condition));
    }

    @Override
    public ResponseResult get(SysUser condition) throws NoValidateResultRuntimeException {
        try {
            return ResponseResults.data(baseMapper().selectOne(condition));
        } catch (DataAccessException e) {
            e.printStackTrace();
            throw new NoValidateResultRuntimeException(ResponseResults.error(HttpStatus.HTTP_INTERNAL_ERROR, "访问错误"));
        }
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult save(SysUserVo sysUserVo) {
        SysUser sysUser = sysUserConverter.convertForSave(sysUserVo).setId(snowflake.nextId()).setCreateTime(new Date());
        baseMapper().insertSelective(sysUser);
        return ResponseResults.ok();
    }
}