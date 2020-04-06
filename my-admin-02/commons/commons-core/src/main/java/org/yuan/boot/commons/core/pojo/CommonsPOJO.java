package org.yuan.boot.commons.core.pojo;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * @program: my-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-03-18 23:06
 */
@Data
public class CommonsPOJO implements Serializable {
    /**
     * 拷贝值
     *
     * @param object           源数据
     * @param ignoreProperties 忽略项目
     */
    public void copyFrom(Object object, String... ignoreProperties) {
        BeanUtil.copyProperties(object, this, CopyOptions.create().ignoreNullValue().setIgnoreProperties(ignoreProperties));
    }

    public Map<String, Object> toMap() {
        return BeanUtil.beanToMap(this, false, true);
    }
}