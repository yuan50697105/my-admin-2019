package org.yuan.boot.app.db.module.mybatis.jpa.mapper.commons.configuration.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Documented
public @interface SnowFlakeId {
}
