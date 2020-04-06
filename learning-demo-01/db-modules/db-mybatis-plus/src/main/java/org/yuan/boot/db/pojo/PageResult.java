package org.yuan.boot.db.pojo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.github.pagehelper.PageInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @program: learning-demo-01
 * @description:
 * @author: yuane
 * @create: 2019-12-29 13:55
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PageResult<T> extends AbstractCorePageResult<T> {

    public <E extends IPage<T>> PageResult(E iPage) {
        super(iPage.getCurrent(), iPage.getSize(), iPage.getRecords(), iPage.getTotal(), iPage.getPages());
    }

    public PageResult(PageInfo<T> pageInfo) {
        super(pageInfo.getPageNum(), pageInfo.getSize(), pageInfo.getList(), pageInfo.getTotal(), pageInfo.getPages());
    }

    public PageResult(long page, long size, List<T> data, long totalNumberOfRows, long totalPages) {
        super(page, size, data, totalNumberOfRows, totalPages);
    }
}