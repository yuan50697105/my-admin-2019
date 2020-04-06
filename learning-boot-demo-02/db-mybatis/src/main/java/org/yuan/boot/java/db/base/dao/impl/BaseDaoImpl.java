package org.yuan.boot.java.db.base.dao.impl;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.yuan.boot.java.db.base.dao.BaseDao;
import org.yuan.boot.java.db.base.mapper.BaseMapper;
import org.yuan.boot.java.db.base.pojo.PageResult;

/**
 * @program: learning-demo-java-02
 * @description:
 * @author: yuane
 * @create: 2020-02-08 12:22
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