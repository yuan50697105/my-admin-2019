package org.yuan.boot.app.db.module.mybatis.jooq.mapper.commons.dao.impl;

import org.yuan.boot.app.db.module.mybatis.jooq.mapper.commons.dao.BaseDao;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.commons.mapper.BaseMapper;
import org.yuan.boot.commons.base.module.mybatis.jooq.mapper.dao.impl.BaseDbDaoImpl;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 00:39
 */
public class BaseDaoImpl<T, M extends BaseMapper<T>> extends BaseDbDaoImpl<T, M> implements BaseDao<T> {
}