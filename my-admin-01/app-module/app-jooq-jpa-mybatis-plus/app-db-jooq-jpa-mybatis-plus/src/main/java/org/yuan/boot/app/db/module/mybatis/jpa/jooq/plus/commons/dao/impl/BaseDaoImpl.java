package org.yuan.boot.app.db.module.mybatis.jpa.jooq.plus.commons.dao.impl;

import org.yuan.boot.app.db.module.mybatis.jpa.jooq.plus.commons.dao.BaseDao;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.plus.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.plus.commons.repository.BaseRepository;
import org.yuan.boot.commons.base.module.mybatis.jpa.jooq.plus.dao.impl.BaseDbDaoImpl;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 00:39
 */
public class BaseDaoImpl<T, R extends BaseRepository<T>, M extends BaseMapper<T>> extends BaseDbDaoImpl<T, Long, R, M> implements BaseDao<T> {
}