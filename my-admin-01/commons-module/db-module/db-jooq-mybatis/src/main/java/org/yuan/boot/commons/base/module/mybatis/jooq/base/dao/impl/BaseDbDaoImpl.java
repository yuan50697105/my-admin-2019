package org.yuan.boot.commons.base.module.mybatis.jooq.base.dao.impl;

import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.yuan.boot.commons.base.module.mybatis.jooq.base.dao.BaseDbDao;
import org.yuan.boot.commons.base.module.mybatis.jooq.base.mapper.BaseDbMapper;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuanez
 * @create: 2020-02-19 11:15
 **/
public class BaseDbDaoImpl<T, M extends BaseDbMapper<T>> implements BaseDbDao<T> {
    @Autowired
    protected M baseMapper;
    @Autowired
    protected DSLContext dslContext;
}
