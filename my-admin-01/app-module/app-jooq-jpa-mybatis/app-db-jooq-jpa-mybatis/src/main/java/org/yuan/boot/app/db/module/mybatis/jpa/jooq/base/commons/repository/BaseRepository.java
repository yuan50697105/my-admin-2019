package org.yuan.boot.app.db.module.mybatis.jpa.jooq.base.commons.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.yuan.boot.commons.base.module.mybatis.jpa.jooq.base.repository.BaseDbRepository;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 00:45
 */
@NoRepositoryBean
public interface BaseRepository<T> extends BaseDbRepository<T, Long> {
}