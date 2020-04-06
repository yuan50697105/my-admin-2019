package org.yuan.boot.java.db.core.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-03 10:35
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ConditionPageResult<T, D> extends BaseCorePageResult<T> {
    private D condition;

    public ConditionPageResult(BaseCorePageResult<T> pageResult, D condition) {
        super(pageResult.getPage(), pageResult.getSize(), pageResult.getTotalPages(), pageResult.getTotalRecords(), pageResult.getContents());
        this.condition = condition;
    }

    public ConditionPageResult(long page, long size, long totalPages, long totalRecords, List<T> contents, D condition) {
        super(page, size, totalPages, totalRecords, contents);
        this.condition = condition;
    }
}