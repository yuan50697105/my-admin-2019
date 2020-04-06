package org.yuan.boot.db.base.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
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
}