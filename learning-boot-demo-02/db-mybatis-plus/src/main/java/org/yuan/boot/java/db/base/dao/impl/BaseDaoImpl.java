package org.yuan.boot.java.db.base.dao.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageInfo;
import org.yuan.boot.java.db.base.dao.BaseDao;
import org.yuan.boot.java.db.base.mapper.BaseMapper;
import org.yuan.boot.java.db.base.pojo.PageResult;

/**
 * @program: learning-demo-java-02
 * @description:
 * @author: yuane
 * @create: 2020-02-08 12:22
 */
public class BaseDaoImpl<T, M extends BaseMapper<T>> extends ServiceImpl<M, T> implements BaseDao<T> {

    protected M baseMapper() {
        return baseMapper;
    }

    protected PageResult<T> pageResult(PageInfo<T> pageInfo) {
        return new PageResult<>(pageInfo);
    }
}