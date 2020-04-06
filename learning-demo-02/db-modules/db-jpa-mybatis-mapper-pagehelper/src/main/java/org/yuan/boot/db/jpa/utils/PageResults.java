package org.yuan.boot.db.jpa.utils;

import com.github.pagehelper.PageInfo;
import org.springframework.data.domain.Page;
import org.yuan.boot.db.jpa.pojo.PageResult;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-22 09:39
 */
public class PageResults {
    public static <T> PageResult<T> of(PageInfo<T> pageInfo) {
        return new PageResult<>(pageInfo);
    }

    public static <T> PageResult<T> of(Page<T> page) {
        return new PageResult<>(page);
    }
}