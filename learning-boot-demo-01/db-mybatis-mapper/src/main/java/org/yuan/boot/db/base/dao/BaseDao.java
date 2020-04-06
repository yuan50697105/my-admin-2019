package org.yuan.boot.db.base.dao;

import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.Optional;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-08 10:56
 */
public interface BaseDao<T> {
    int insert(T t);

    int insertSelective(T t);

    int updateByPrimaryKey(T t);

    int updateByExample(T t, Example example);

    int updateSelectiveByPrimaryKey(T t);

    int updateSelectiveByExample(T t, Example example);

    int deleteByPrimaryKey(Object id);

    int deleteByIds(List<?> ids);

    int deleteByExample(Example example);

    Optional<T> selectByPrimaryKey(Object id);

    List<T> selectByIds(List<?> ids);

    Optional<T> selectOne(T t);

    Optional<T> selectOneByExample(Example example);

    List<T> select(T t);

    List<T> selectByExample(Example example);

    long selectCount(T t);

    long selectCountByExample(Example example);
}
