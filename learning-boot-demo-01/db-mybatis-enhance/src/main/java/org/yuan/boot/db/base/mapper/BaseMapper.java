package org.yuan.boot.db.base.mapper;

import com.gitee.hengboy.mybatis.enhance.mapper.EnhanceMapper;

import java.io.Serializable;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-08 10:56
 */
public interface BaseMapper<T, ID extends Serializable> extends EnhanceMapper<T, ID> {
}
