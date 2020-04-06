package org.yuan.boot.db.jpa.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.db.pojo.AbstractBaseCoreCondition;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 14:30
 */
@EqualsAndHashCode(callSuper = true)
@Data
public abstract class AbstractBaseCondition extends AbstractBaseCoreCondition {
    public AbstractBaseCondition() {
    }

    public AbstractBaseCondition(int page, int size) {
        super(page, size);
    }

    public AbstractBaseCondition(int page, int size, String order, String sort) {
        super(page, size, order, sort);
    }
}