package org.yuan.boot.java.db.base.dao;

import com.baomidou.mybatisplus.extension.service.IService;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;
import java.util.Optional;

/**
 * @program: learning-demo-java-02
 * @description:
 * @author: yuane
 * @create: 2020-02-08 12:22
 */
public interface BaseDao<T, ID> extends IService<T> {
    T saveOne(T t);

    Iterable<T> saveAll(Iterable<T> iterable);

    void deleteById(ID id);

    void delete(T t);

    void deleteAll(Iterable<T> iterable);

    void deleteInBatch(Iterable<T> iterable);

    Optional<T> findById(ID id);

    List<T> findAllById(Iterable<ID> iterable);

    Optional<T> findOne(T t);

    Optional<T> findOne(Example<T> example);

    Optional<T> findOne(Specification<T> specification);

    Optional<T> findOne(Predicate predicate);

    List<T> findAll();

    List<T> findAll(Sort sort);

    List<T> findAll(T t);

    List<T> findAll(T t, Sort sort);

    List<T> finAll(Example<T> example);

    List<T> findAll(Example<T> example, Sort sort);

    List<T> findAll(Specification<T> specification);

    List<T> findAll(Specification<T> specification, Sort sort);

    Iterable<T> findAll(Predicate predicate);

    Iterable<T> findAll(Predicate predicate, Sort sort);

    Page<T> findAll(Pageable pageable);

    Page<T> findAll(T t, Pageable pageable);

    Page<T> findAll(Example<T> example, Pageable pageable);

    Page<T> findAll(Specification<T> specification, Pageable pageable);

    Page<T> findAll(Predicate predicate, Pageable pageable);

    long count(T t);

    long count(Example<T> example);

    long count(Specification<T> specification);

    long count(Predicate predicate);

    int insert(T t);

    int insertSelective(T t);

    int updateByPrimaryKey(T t);

    int updateByExample(T t, tk.mybatis.mapper.entity.Example example);

    int updateSelectiveByPrimaryKey(T t);

    int updateSelectiveByExample(T t, tk.mybatis.mapper.entity.Example example);

    int deleteByPrimaryKey(Object id);

    int deleteByIds(List<?> ids);

    int deleteByExample(tk.mybatis.mapper.entity.Example example);

    Optional<T> selectByPrimaryKey(Object id);

    List<T> selectByIds(List<?> ids);

    Optional<T> selectOne(T t);

    Optional<T> selectOneByExample(tk.mybatis.mapper.entity.Example example);

    List<T> select(T t);

    List<T> selectByExample(tk.mybatis.mapper.entity.Example example);

    long selectCount(T t);

    long selectCountByExample(tk.mybatis.mapper.entity.Example example);
}
