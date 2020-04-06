package org.yuan.boot.java.db.core.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-01 22:29
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BaseCorePageResult<T> extends BaseCoreEntity {
    private long page;
    private long size;
    private long totalPages;
    private long totalRecords;
    private Iterable<T> contents;

    public BaseCorePageResult(long page, long size, long totalPages, long totalRecords, Iterable<T> contents) {
        this.page = page;
        this.size = size;
        this.totalPages = totalPages;
        this.totalRecords = totalRecords;
        this.contents = contents;
    }
}