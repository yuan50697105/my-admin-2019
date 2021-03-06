package org.yuan.boot.commons.base.module.mybatis.jpa.sqlhelper.plus.dao;

import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;
import java.util.Optional;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuanez
 * @create: 2020-02-19 11:14
 **/
public interface BaseDbDao<T, ID> {
    T saveOne(T t);

    Iterable<T> saveAll(Iterable<T> iterable);

    void deleteById(ID id);

    void deleteInBatchById(Iterable<ID> iterable);

    void deleteAllById(Iterable<ID> iterable);

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

    List<T> findAll(T t);

    List<T> findAll(Example<T> example);

    List<T> findAll(Specification<T> specification);

    Iterable<T> findAll(Predicate predicate);

    List<T> findAll(Sort sort);

    List<T> findAll(T t, Sort sort);

    List<T> findAll(Example<T> example, Sort sort);

    List<T> findAll(Specification<T> specification, Sort sort);

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

    boolean existsById(ID id);

    boolean exists(T t);

    boolean exists(Example<T> example);

    boolean exists(Predicate predicate);
}
