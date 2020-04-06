package org.yuan.boot.java.db.core.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @program: learning-demo-java-02
 * @description:
 * @author: yuane
 * @create: 2020-01-22 19:23
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseCorePageResult<T> extends BaseCoreEntity {
    private long page;
    private long size;
    private Iterable<T> contents;
    private long totalPages;
    private long totalRecords;


}