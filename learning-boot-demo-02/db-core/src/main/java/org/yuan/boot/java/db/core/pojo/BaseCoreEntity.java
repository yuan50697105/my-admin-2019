package org.yuan.boot.java.db.core.pojo;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import cn.hutool.core.util.XmlUtil;
import cn.hutool.json.JSONUtil;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.Map;

/**
 * @program: learning-demo-java-02
 * @description:
 * @author: yuane
 * @create: 2020-01-22 16:42
 */
@Data
@NoArgsConstructor
@SuperBuilder
public abstract class BaseCoreEntity implements Serializable {
    public void copyFrom(BaseCoreEntity entity, String... ignoreProperties) {
        BeanUtil.copyProperties(entity, this, CopyOptions.create().ignoreNullValue().setIgnoreProperties(ignoreProperties));
    }

    public void copyFrom(Map<?, ?> map, String... ignoreProperties) {
        BeanUtil.fillBeanWithMap(map, this, CopyOptions.create().ignoreNullValue().setIgnoreProperties(ignoreProperties));
    }

    public Map<String, Object> toMap() {
        return BeanUtil.beanToMap(this);
    }

    public String toJson() {
        return JSONUtil.toJsonPrettyStr(this);
    }

    public String toXml() {
        return XmlUtil.mapToXmlStr(toMap());
    }
}