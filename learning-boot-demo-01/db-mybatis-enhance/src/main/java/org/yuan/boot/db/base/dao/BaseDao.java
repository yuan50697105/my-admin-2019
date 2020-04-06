package org.yuan.boot.db.base.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.Optional;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-08 10:56
 */
public interface BaseDao<T,ID extends Serializable> {
    void insert(T t);

    void insertArray(T... ts);

    void insertCollection(Collection<T> collection);

    void update(T t);

    void deleteArray(ID... ids);

    Optional<T> selectOne(ID id);
}
