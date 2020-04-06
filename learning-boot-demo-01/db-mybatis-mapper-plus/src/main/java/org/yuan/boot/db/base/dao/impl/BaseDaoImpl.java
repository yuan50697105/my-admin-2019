package org.yuan.boot.db.base.dao.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageInfo;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.db.base.dao.BaseDao;
import org.yuan.boot.db.base.mapper.BaseMapper;
import org.yuan.boot.db.base.pojo.PageResult;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-08 10:56
 */
public class BaseDaoImpl<T, M extends BaseMapper<T>> extends ServiceImpl<M, T> implements BaseDao<T> {
    protected M baseMapper() {
        return baseMapper;
    }

    protected PageResult<T> pageResult(PageInfo<T> pageInfo) {
        return new PageResult<>(pageInfo);
    }

    protected <E extends IPage<T>> PageResult<T> pageResult(E page) {
        return new PageResult<>(page);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insert(T t) {
        return baseMapper.insert(t);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insertSelective(T t) {
        return baseMapper.insertSelective(t);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateByPrimaryKey(T t) {
        return baseMapper.updateByPrimaryKey(t);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateByExample(T t, Example example) {
        return baseMapper.updateByExample(t, example);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateSelectiveByPrimaryKey(T t) {
        return baseMapper.updateByPrimaryKeySelective(t);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateSelectiveByExample(T t, Example example) {
        return baseMapper.updateByExampleSelective(t, example);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteByPrimaryKey(Object id) {
        return baseMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteByIds(List<?> ids) {
        StringJoiner joiner = new StringJoiner(",");
        for (Object id : ids) {
            joiner.add(id.toString());
        }
        return baseMapper.deleteByIds(joiner.toString());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteByExample(Example example) {
        return baseMapper.deleteByExample(example);
    }

    @Override
    public Optional<T> selectByPrimaryKey(Object id) {
        return Optional.ofNullable(baseMapper.selectByPrimaryKey(id));
    }

    @Override
    public List<T> selectByIds(List<?> ids) {
        StringJoiner joiner = new StringJoiner(",");
        for (Object id : ids) {
            joiner.add(id.toString());
        }
        return baseMapper.selectByIds(joiner.toString());
    }

    @Override
    public Optional<T> selectOne(T t) {
        return Optional.ofNullable(baseMapper.selectOne(t));
    }

    @Override
    public Optional<T> selectOneByExample(Example example) {
        return Optional.ofNullable(baseMapper.selectOneByExample(example));
    }

    @Override
    public List<T> select(T t) {
        return baseMapper.select(t);
    }

    @Override
    public List<T> selectByExample(Example example) {
        return baseMapper.selectByExample(example);
    }

    @Override
    public long selectCount(T t) {
        return baseMapper.selectCount(t);
    }

    @Override
    public long selectCountByExample(Example example) {
        return baseMapper.selectCountByExample(example);
    }
}