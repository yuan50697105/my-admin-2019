package org.yuan.boot.db.base.mapper;

import tk.mybatis.mapper.annotation.RegisterMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-08 10:56
 */
@RegisterMapper
public interface BaseMapper<T> extends Mapper<T>, IdsMapper<T>, com.baomidou.mybatisplus.core.mapper.BaseMapper<T> {
}
