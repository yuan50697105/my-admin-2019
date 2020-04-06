package org.yuan.boot.java.db.base.pojo;

import com.github.pagehelper.PageInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.domain.Page;
import org.yuan.boot.java.db.core.pojo.BaseCorePageResult;

import java.util.List;

/**
 * @program: learning-demo-java-02
 * @description:
 * @author: yuane
 * @create: 2020-02-08 12:21
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PageResult<T> extends BaseCorePageResult<T> {
    public PageResult(PageInfo<T> pageInfo) {
        super(pageInfo.getPageNum(), pageInfo.getSize(), pageInfo.getList(), pageInfo.getPages(), pageInfo.getTotal());
    }

    public PageResult(Page<T> page) {
        super(page.getPageable().getPageNumber() - 1, page.getPageable().getPageSize(), page.getContent(), page.getTotalPages(), page.getTotalElements());
    }

    public PageResult(long page, long size, List<T> contents, long totalPages, long totalRecords) {
        super(page, size, contents, totalPages, totalRecords);
    }
}