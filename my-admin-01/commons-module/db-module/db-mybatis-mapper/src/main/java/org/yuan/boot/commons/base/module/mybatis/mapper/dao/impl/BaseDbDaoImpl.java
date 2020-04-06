package org.yuan.boot.commons.base.module.mybatis.mapper.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.commons.base.module.mybatis.mapper.dao.BaseDbDao;
import org.yuan.boot.commons.base.module.mybatis.mapper.mapper.BaseDbMapper;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.weekend.Weekend;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.StringJoiner;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuanez
 * @create: 2020-02-19 11:15
 **/
public class BaseDbDaoImpl<T, M extends BaseDbMapper<T>> implements BaseDbDao<T> {
    @Autowired
    protected M baseMapper;
    protected final Class<T> entityClass;

    @SuppressWarnings("unchecked")
    public BaseDbDaoImpl() {
        entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    protected Example.Builder exampleBuilder() {
        return Example.builder(entityClass);
    }

    protected Weekend.Builder weekendBuilder() {
        return Weekend.builder(entityClass);
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
    public int updateByPrimaryKeySelective(T t) {
        return baseMapper.updateByPrimaryKeySelective(t);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateByExample(T t, Object example) {
        return baseMapper.updateByExample(t, example);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateByExampleSelective(T t, Object example) {
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
    public int deleteByExample(Object example) {
        return baseMapper.deleteByExample(example);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int delete(T t) {
        return baseMapper.delete(t);
    }

    @Override
    public T selectByPrimaryKey(Object id) {
        return baseMapper.selectByPrimaryKey(id);
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
    public T selectOne(T t) {
        return baseMapper.selectOne(t);
    }

    @Override
    public T selectOneBtExample(Object example) {
        return baseMapper.selectOneByExample(example);
    }

    @Override
    public List<T> select(T t) {
        return baseMapper.select(t);
    }

    @Override
    public List<T> selectByExample(Object example) {
        return baseMapper.selectByExample(example);
    }

    @Override
    public long selectCount(T t) {
        return baseMapper.selectCount(t);
    }

    @Override
    public long selectCountByExample(Object example) {
        return baseMapper.selectCountByExample(example);
    }
}
