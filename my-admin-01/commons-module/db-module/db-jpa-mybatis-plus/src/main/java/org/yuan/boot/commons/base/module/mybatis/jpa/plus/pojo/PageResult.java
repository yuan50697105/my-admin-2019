package org.yuan.boot.commons.base.module.mybatis.jpa.plus.pojo;

import com.github.pagehelper.PageInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.domain.Page;
import org.yuan.boot.commons.pojo.BasePageResult;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuanez
 * @create: 2020-02-19 11:06
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class PageResult<T> extends BasePageResult<T> {
    public PageResult(PageInfo<T> pageInfo) {
        super(pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getPages(), pageInfo.getTotal(), pageInfo.getList());
    }

    public PageResult(Page<T> page) {
        super(page.getPageable().getPageNumber() + 1, page.getPageable().getPageSize(), page.getTotalPages(), page.getTotalElements(), page.getContent());
    }

    public PageResult(long pageIndex, long pageSize, long totalPages, long totalRecords, Iterable<T> data) {
        super(pageIndex, pageSize, totalPages, totalRecords, data);
    }
}
