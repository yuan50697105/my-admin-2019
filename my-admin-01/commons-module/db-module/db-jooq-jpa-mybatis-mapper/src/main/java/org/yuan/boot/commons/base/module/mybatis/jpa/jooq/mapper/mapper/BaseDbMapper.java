package org.yuan.boot.commons.base.module.mybatis.jpa.jooq.mapper.mapper;

import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuanez
 * @create: 2020-02-19 11:14
 **/
public interface BaseDbMapper<T> extends Mapper<T>, IdsMapper<T> {
}
