package org.yuan.boot.db.utils;

import com.github.pagehelper.PageInfo;
import org.yuan.boot.db.pojo.PageResult;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-22 10:25
 */
public class PageResults {
    public static <T> PageResult<T> of(PageInfo<T> pageInfo) {
        return new PageResult<>(pageInfo);
    }
}