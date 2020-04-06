package org.yuan.boot.commons.base.module.mybatis.jooq.plus.dao.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.yuan.boot.commons.base.module.mybatis.jooq.plus.dao.BaseDbDao;
import org.yuan.boot.commons.base.module.mybatis.jooq.plus.mapper.BaseDbMapper;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuanez
 * @create: 2020-02-19 11:15
 **/
public class BaseDbDaoImpl<T, M extends BaseDbMapper<T>> extends ServiceImpl<M, T> implements BaseDbDao<T> {
    @Autowired
    protected DSLContext dslContext;
}
