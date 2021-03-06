package org.yuan.boot.java.db.base.dao;

import com.baomidou.mybatisplus.extension.service.IService;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.Optional;

/**
 * @program: learning-demo-java-02
 * @description:
 * @author: yuane
 * @create: 2020-02-08 12:22
 */
public interface BaseDao<T> extends IService<T> {
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
