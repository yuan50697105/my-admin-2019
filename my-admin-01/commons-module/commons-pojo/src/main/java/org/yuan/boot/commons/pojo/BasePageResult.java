package org.yuan.boot.commons.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @param <T> 结果实体类型
 * @program: my-admin-01
 * @description: 基础分页结果
 * @author: yuanez
 * @create: 2020-02-19 10:38
 **/
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BasePageResult<T> extends BaseCoreEntity {
    /**
     * 当前页码
     */
    private long pageNum;
    /**
     * 分页大小
     */
    private long pageSize;
    /**
     * 总页数
     */
    private long totalPages;
    /**
     * 总记录数
     */
    private long totalRecords;
    /**
     * 数据列表
     */
    private Iterable<T> data;
}
