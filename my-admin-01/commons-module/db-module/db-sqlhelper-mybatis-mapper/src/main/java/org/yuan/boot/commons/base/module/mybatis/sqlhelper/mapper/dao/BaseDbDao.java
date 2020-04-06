package org.yuan.boot.commons.base.module.mybatis.sqlhelper.mapper.dao;

import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuanez
 * @create: 2020-02-19 11:14
 **/
public interface BaseDbDao<T> {
    int insert(T t);

    int insertSelective(T t);

    int updateByPrimaryKey(T t);

    int updateByPrimaryKeySelective(T t);

    int updateByExample(T t, Object example);

    int updateByExampleSelective(T t, Object example);

    int deleteByPrimaryKey(Object id);

    int deleteByIds(List<?> ids);

    int deleteByExample(Object example);

    int delete(T t);

    T selectByPrimaryKey(Object id);

    List<T> selectByIds(List<?> ids);

    T selectOne(T t);

    T selectOneBtExample(Object example);

    List<T> select(T t);

    List<T> selectByExample(Object example);

    long selectCount(T t);

    long selectCountByExample(Object example);
}
