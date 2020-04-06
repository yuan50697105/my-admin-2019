package org.yuan.boot.db.base.dao.impl;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.yuan.boot.db.base.dao.BaseDao;
import org.yuan.boot.db.base.mapper.BaseMapper;
import org.yuan.boot.db.base.pojo.PageResult;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-08 10:56
 */
public class BaseDaoImpl<T, M extends BaseMapper<T>> implements BaseDao<T> {
    @Autowired
    private M baseMapper;

    protected M baseMapper() {
        return baseMapper;
    }

    protected PageResult<T> pageResult(PageInfo<T> pageInfo) {
        return new PageResult<>(pageInfo);
    }
}