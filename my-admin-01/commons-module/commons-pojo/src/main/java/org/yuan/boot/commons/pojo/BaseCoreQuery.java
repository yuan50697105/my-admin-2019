package org.yuan.boot.commons.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: my-admin-01
 * @description: 基础条件
 * @author: yuanez
 * @create: 2020-02-19 10:43
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class BaseCoreQuery extends BaseCoreEntity{
    /**
     * 当前页码
     */
    private Integer pageNum = 1;
    /**
     * 分页大小
     */
    private Integer pageSize = 20;
    /**
     * 排序字段
     */
    private String order;
    /**
     * 排序方式
     */
    private String sort;
}
