package org.yuan.boot.java.db.base.dao.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageInfo;
import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.java.db.base.dao.BaseDao;
import org.yuan.boot.java.db.base.mapper.BaseMapper;
import org.yuan.boot.java.db.base.pojo.PageResult;
import org.yuan.boot.java.db.base.repository.BaseRepository;

import java.util.List;
import java.util.Optional;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-08 11:03
 */
public class BaseDaoImpl<T, ID, R extends BaseRepository<T, ID>, M extends BaseMapper<T>> extends ServiceImpl<M, T> implements BaseDao<T, ID> {
    @Autowired
    private R baseRepository;

    protected M baseMapper() {
        return baseMapper;
    }

    protected R baseRepository() {
        return baseRepository;
    }

    protected PageResult<T> pageResult(PageInfo<T> pageInfo) {
        return new PageResult<>(pageInfo);
    }

    protected PageResult<T> pageResult(Page<T> page) {
        return new PageResult<>(page);
    }

    protected <E extends IPage<T>> PageResult<T> pageResult(E page) {
        return new PageResult<>(page);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public T saveOne(T t) {
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
    public List<T> findAll(Sort sort) {
        return baseRepository.findAll(sort);
    }

    @Override
    public List<T> findAll(T t) {
        return baseRepository.findAll(Example.of(t));
    }

    @Override
    public List<T> findAll(T t, Sort sort) {
        return baseRepository.findAll(Example.of(t), sort);
    }

    @Override
    public List<T> finAll(Example<T> example) {
        return baseRepository.findAll(example);
    }

    @Override
    public List<T> findAll(Example<T> example, Sort sort) {
        return baseRepository.findAll(example, sort);
    }

    @Override
    public List<T> findAll(Specification<T> specification) {
        return baseRepository.findAll(specification);
    }

    @Override
    public List<T> findAll(Specification<T> specification, Sort sort) {
        return baseRepository.findAll(specification, sort);
    }

    @Override
    public Iterable<T> findAll(Predicate predicate) {
        return baseRepository.findAll(predicate);
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
        return baseRepository.findAll(pageable);
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
}