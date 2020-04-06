package org.yuan.boot.commons.base.module.mybatis.jpq.jooq.sqlhelper.plus.dao.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.querydsl.core.types.Predicate;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.commons.base.module.mybatis.jpq.jooq.sqlhelper.plus.dao.BaseDbDao;
import org.yuan.boot.commons.base.module.mybatis.jpq.jooq.sqlhelper.plus.mapper.BaseDbMapper;
import org.yuan.boot.commons.base.module.mybatis.jpq.jooq.sqlhelper.plus.repository.BaseDbRepository;

import javax.persistence.EntityManager;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuanez
 * @create: 2020-02-19 11:15
 **/
public class BaseDbDaoImpl<T, ID, R extends BaseDbRepository<T, ID>, M extends BaseDbMapper<T>> extends ServiceImpl<M, T> implements BaseDbDao<T, ID> {
    @Autowired
    protected R baseRepository;
    @Autowired
    protected EntityManager entityManager;
    @Autowired
    protected DSLContext dslContext;

    protected JPAQueryFactory queryFactory() {
        return new JPAQueryFactory(entityManager);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public T saveEntity(T t) {
        return baseRepository.save(t);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Iterable<T> saveAll(Iterable<T> iterable) {
        return baseRepository.saveAll(iterable);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteById(ID id) {
        baseRepository.deleteById(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteInBatchById(Iterable<ID> iterable) {
        List<T> list = baseRepository.findAllById(iterable);
        baseRepository.deleteInBatch(Optional.of(list).orElse(Collections.emptyList()));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteAllById(Iterable<ID> iterable) {
        List<T> list = baseRepository.findAllById(iterable);
        baseRepository.deleteAll(Optional.of(list).orElse(Collections.emptyList()));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(T t) {
        baseRepository.delete(t);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteAll(Iterable<T> iterable) {
        baseRepository.deleteAll(iterable);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteInBatch(Iterable<T> iterable) {
        baseRepository.deleteInBatch(iterable);
    }

    @Override
    public Optional<T> findById(ID id) {
        return baseRepository.findById(id);
    }

    @Override
    public List<T> findAllById(Iterable<ID> iterable) {
        return baseRepository.findAllById(iterable);
    }

    @Override
    public Optional<T> findOne(T t) {
        return baseRepository.findOne(Example.of(t));
    }

    @Override
    public Optional<T> findOne(Example<T> example) {
        return baseRepository.findOne(example);
    }

    @Override
    public Optional<T> findOne(Specification<T> specification) {
        return baseRepository.findOne(specification);
    }

    @Override
    public Optional<T> findOne(Predicate predicate) {
        return baseRepository.findOne(predicate);
    }

    @Override
    public List<T> findAll() {
        return baseRepository.findAll();
    }

    @Override
    public List<T> findAll(T t) {
        return baseRepository.findAll(Example.of(t));
    }

    @Override
    public List<T> findAll(Example<T> example) {
        return baseRepository.findAll(example);
    }

    @Override
    public List<T> findAll(Specification<T> specification) {
        return baseRepository.findAll(specification);
    }

    @Override
    public Iterable<T> findAll(Predicate predicate) {
        return baseRepository.findAll(predicate);
    }

    @Override
    public List<T> findAll(Sort sort) {
        return baseRepository.findAll(sort);
    }

    @Override
    public List<T> findAll(T t, Sort sort) {
        return baseRepository.findAll(Example.of(t), sort);
    }

    @Override
    public List<T> findAll(Example<T> example, Sort sort) {
        return baseRepository.findAll(example, sort);
    }

    @Override
    public List<T> findAll(Specification<T> specification, Sort sort) {
        return baseRepository.findAll(specification, sort);
    }

    @Override
    public Iterable<T> findAll(Predicate predicate, Sort sort) {
        return baseRepository.findAll(predicate, sort);
    }

    @Override
    public Page<T> findAll(Pageable pageable) {
        return baseRepository.findAll(pageable);
    }

    @Override
    public Page<T> findAll(T t, Pageable pageable) {
        return baseRepository.findAll(Example.of(t), pageable);
    }

    @Override
    public Page<T> findAll(Example<T> example, Pageable pageable) {
        return baseRepository.findAll(example, pageable);
    }

    @Override
    public Page<T> findAll(Specification<T> specification, Pageable pageable) {
        return baseRepository.findAll(specification, pageable);
    }

    @Override
    public Page<T> findAll(Predicate predicate, Pageable pageable) {
        return baseRepository.findAll(predicate, pageable);
    }

    @Override
    public long count(T t) {
        return baseRepository.count(Example.of(t));
    }

    @Override
    public long count(Example<T> example) {
        return baseRepository.count(example);
    }

    @Override
    public long count(Specification<T> specification) {
        return baseRepository.count(specification);
    }

    @Override
    public long count(Predicate predicate) {
        return baseRepository.count(predicate);
    }

    @Override
    public boolean existsById(ID id) {
        return baseRepository.existsById(id);
    }

    @Override
    public boolean exists(T t) {
        return baseRepository.exists(Example.of(t));
    }

    @Override
    public boolean exists(Example<T> example) {
        return baseRepository.exists(example);
    }

    @Override
    public boolean exists(Predicate predicate) {
        return baseRepository.exists(predicate);
    }
}



