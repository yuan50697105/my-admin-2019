package org.yuan.boot.java.db.core.pojo;

import cn.hutool.core.bean.copier.CopyOptions;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Map;

import static cn.hutool.core.bean.BeanUtil.*;
import static cn.hutool.core.util.XmlUtil.mapToXmlStr;
import static cn.hutool.json.JSONUtil.toJsonPrettyStr;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-01 22:24
 */
@Data
@SuperBuilder
@NoArgsConstructor
public abstract class BaseCoreEntity {
    public void copyFrom(BaseCoreEntity entity, String... ignoreProperties) {
        copyProperties(entity, this, CopyOptions.create().ignoreNullValue().setIgnoreProperties(ignoreProperties));
    }

    public void copyFrom(Map<?, ?> map, String... ignoreProperties) {
        fillBeanWithMap(map, this, CopyOptions.create().ignoreNullValue().setIgnoreProperties(ignoreProperties));
    }

    public Map<String, Object> toMap() {
        return beanToMap(this);
    }

    public String toJson() {
        return toJsonPrettyStr(this);
    }

    public String toXml() {
        return mapToXmlStr(toMap());
    }
}