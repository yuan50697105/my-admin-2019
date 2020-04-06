package org.yuan.boot.commons.pojo;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import cn.hutool.json.JSONUtil;
import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * @program: my-admin-01
 * @description: 基础数据模型
 * @author: yuanez
 * @create: 2020-02-19 10:31
 **/
@Data
public class BaseCoreEntity implements Serializable {
    /**
     * 拷贝实体属性，可以使用Map
     *
     * @param entity  需要拷贝的源头实体或者Map
     * @param options 拷贝配置
     */
    public void copyFrom(Object entity, CopyOptions options) {
        BeanUtil.copyProperties(entity, this, options);
    }

    /**
     * 自动忽略null字段拷贝实体属性，可以使用Map
     *
     * @param entity           需要拷贝的源头实体或者Map
     * @param ignoreProperties 忽略处理字段
     */
    public void copyFrom(Object entity, String... ignoreProperties) {
        copyFrom(entity, CopyOptions.create().ignoreNullValue().setIgnoreProperties(ignoreProperties));
    }

    /**
     * 自动忽略null字段拷贝实体属性，可以使用Map
     *
     * @param entity           需要拷贝的源头实体或者Map
     * @param editable         限制实体类型
     * @param ignoreProperties 忽略处理字段
     */
    public void copyFrom(Object entity, Class<?> editable, String... ignoreProperties) {
        copyFrom(entity, CopyOptions.create().ignoreNullValue().setIgnoreProperties(ignoreProperties).setEditable(editable));
    }

    /**
     * 自动忽略null字段拷贝实体属性，可以使用Map
     *
     * @param entity           需要拷贝的源头实体或者Map
     * @param fieldMapping     字段名称映射
     * @param ignoreProperties 忽略处理字段
     */
    public void copyFrom(Object entity, Map<String, String> fieldMapping, String... ignoreProperties) {
        copyFrom(entity, CopyOptions.create().setFieldMapping(fieldMapping).ignoreNullValue().setIgnoreProperties(ignoreProperties));
    }

    /**
     * 将实体转换成Map
     *
     * @return 转换后的Map
     */
    public Map<String, Object> toMap() {
        return BeanUtil.beanToMap(this);
    }

    /**
     * 将实体转换为json字符串
     *
     * @return json字符串
     */
    public String toJsonStr() {
        return JSONUtil.toJsonStr(this);
    }
}
