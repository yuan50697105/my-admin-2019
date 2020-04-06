package org.yuan.boot.commons.base.module.mybatis.plus.pojo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.pagehelper.PageInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;
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
    public <E extends IPage<T>> PageResult(E iPage) {
        super(iPage.getCurrent(), iPage.getSize(), iPage.getPages(), iPage.getTotal(), iPage.getRecords());
    }

    public PageResult(PageInfo<T> pageInfo) {
        super(pageInfo.getPageNum(), pageInfo.getPageSize(), pageInfo.getPages(), pageInfo.getTotal(), pageInfo.getList());
    }

    public PageResult(long pageIndex, long pageSize, long totalPages, long totalRecords, Iterable<T> data) {
        super(pageIndex, pageSize, totalPages, totalRecords, data);
    }
}
