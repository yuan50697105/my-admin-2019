package org.yuan.boot.java.db.core.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @program: learning-demo-java-02
 * @description:
 * @author: yuane
 * @create: 2020-01-22 16:46
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public abstract class BaseCoreCondition extends BaseCoreEntity {
    private int page = 1;
    private int size = 10;
    private String order;
    private String sort;

}