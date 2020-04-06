package org.yuan.boot.db.base.dao.impl;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.db.base.dao.BaseDao;
import org.yuan.boot.db.base.mapper.BaseMapper;
import org.yuan.boot.db.base.pojo.PageResult;

import java.io.Serializable;
import java.util.Collection;
import java.util.Optional;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-08 10:56
 */
public class BaseDaoImpl<T, ID extends Serializable, M extends BaseMapper<T, ID>> implements BaseDao<T,ID> {
    @Autowired
    private M baseMapper;

    protected M baseMapper() {
        return baseMapper;
    }

    protected PageResult<T> pageResult(PageInfo<T> pageInfo) {
        return new PageResult<>(pageInfo);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insert(T t) {
        baseMapper.insert(t);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insertArray(T... ts) {
        baseMapper.insertArray(ts);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void insertCollection(Collection<T> collection) {
        baseMapper.insertCollection(collection);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(T t) {
        baseMapper.update(t);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deleteArray(ID... ids) {
        baseMapper.deleteArray(ids);
    }

    @Override
    public Optional<T> selectOne(ID id) {
        return Optional.ofNullable(baseMapper.selectOne(id));
    }
}