package org.yuan.boot.app.db.module.mybatis.jpa.jooq.mapper.mapper.commons.dao.impl;

import org.yuan.boot.app.db.module.mybatis.jpa.jooq.mapper.mapper.commons.dao.BaseDao;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.mapper.mapper.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.mapper.mapper.commons.repository.BaseRepository;
import org.yuan.boot.commons.base.module.mybatis.jpa.jooq.mapper.dao.impl.BaseDbDaoImpl;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 00:39
 */
public class BaseDaoImpl<T, R extends BaseRepository<T>, M extends BaseMapper<T>> extends BaseDbDaoImpl<T, Long, R, M> implements BaseDao<T> {
}