package org.yuan.boot.java.db.base.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.yuan.boot.java.db.core.pojo.BaseCoreCondition;

/**
 * @program: learning-demo-java-02
 * @description:
 * @author: yuane
 * @create: 2020-02-08 12:57
 */
@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
public class BaseCondition extends BaseCoreCondition {
    public Pageable pageable() {
        try {
            return PageRequest.of(getPage(), getSize(), Sort.by(Sort.Direction.fromString(getSort()), getOrder()));
        } catch (Exception e) {
            return PageRequest.of(getPage(), getSize());
        }
    }
}