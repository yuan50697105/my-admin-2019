package org.yuan.boot.commons.base.module.mybatis.jpq.jooq.sqlhelper.plus.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuanez
 * @create: 2020-02-19 15:55
 **/
@NoRepositoryBean
public interface BaseDbRepository<T, ID> extends JpaRepositoryImplementation<T, ID>, QuerydslPredicateExecutor<T> {
}
