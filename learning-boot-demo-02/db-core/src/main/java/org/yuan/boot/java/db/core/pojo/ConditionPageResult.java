package org.yuan.boot.java.db.core.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @program: learning-demo-java-02
 * @description:
 * @author: yuane
 * @create: 2020-02-06 09:50
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ConditionPageResult<T, D> extends BaseCorePageResult<T> {
    private D condition;

    public ConditionPageResult(BaseCorePageResult<T> pageResult, D condition) {
        super(pageResult.getPage(), pageResult.getSize(), pageResult.getContents(), pageResult.getTotalPages(), pageResult.getTotalRecords());
        this.condition = condition;
    }

    public ConditionPageResult(long page, long size, List<T> contents, long totalPages, long totalRecords, D condition) {
        super(page, size, contents, totalPages, totalRecords);
        this.condition = condition;
    }
}