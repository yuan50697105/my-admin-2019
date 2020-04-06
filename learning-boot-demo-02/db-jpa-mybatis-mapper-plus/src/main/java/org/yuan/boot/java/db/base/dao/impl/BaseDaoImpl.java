package org.yuan.boot.java.db.base.dao.impl;

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
import java.util.StringJoiner;

/**
 * @program: learning-demo-java-02
 * @description:
 * @author: yuane
 * @create: 2020-02-08 12:22
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
    public int updateByExample(T t, tk.mybatis.mapper.entity.Example example) {
        return baseMapper.updateByExample(t, example);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateSelectiveByPrimaryKey(T t) {
        return baseMapper.updateByPrimaryKeySelective(t);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateSelectiveByExample(T t, tk.mybatis.mapper.entity.Example example) {
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
    public int deleteByExample(tk.mybatis.mapper.entity.Example example) {
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
    public Optional<T> selectOneByExample(tk.mybatis.mapper.entity.Example example) {
        return Optional.ofNullable(baseMapper.selectOneByExample(example));
    }

    @Override
    public List<T> select(T t) {
        return baseMapper.select(t);
    }

    @Override
    public List<T> selectByExample(tk.mybatis.mapper.entity.Example example) {
        return baseMapper.selectByExample(example);
    }

    @Override
    public long selectCount(T t) {
        return baseMapper.selectCount(t);
    }

    @Override
    public long selectCountByExample(tk.mybatis.mapper.entity.Example example) {
        return baseMapper.selectCountByExample(example);
    }
}