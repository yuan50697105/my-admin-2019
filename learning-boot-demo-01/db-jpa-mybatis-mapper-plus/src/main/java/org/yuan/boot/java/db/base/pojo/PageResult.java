package org.yuan.boot.java.db.base.pojo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.pagehelper.PageInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.domain.Page;
import org.yuan.boot.java.db.core.pojo.BaseCorePageResult;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-08 10:52
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PageResult<T> extends BaseCorePageResult<T> {
    public PageResult(PageInfo<T> pageInfo) {
        super(pageInfo.getPageNum(), pageInfo.getSize(), pageInfo.getPages(), pageInfo.getTotal(), pageInfo.getList());
    }

    public PageResult(Page<T> page) {
        super(page.getPageable().getPageNumber() + 1, page.getPageable().getPageSize(), page.getTotalPages(), page.getTotalElements(), page.getContent());
    }

    public <E extends IPage<T>> PageResult(E iPage) {
        super(iPage.getCurrent(), iPage.getSize(), iPage.getPages(), iPage.getTotal(), iPage.getRecords());
    }

    public PageResult(long page, long size, long totalPages, long totalRecords, Iterable<T> contents) {
        super(page, size, totalPages, totalRecords, contents);
    }


}