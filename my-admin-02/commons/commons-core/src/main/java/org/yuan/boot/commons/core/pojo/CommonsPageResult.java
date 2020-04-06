package org.yuan.boot.commons.core.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @program: my-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-03-18 23:14
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonsPageResult<T> extends CommonsPOJO {
    private Long pageIndex;
    private Long pageSize;
    private Long totalRecords;
    private Long totalPages;
    private Iterable<T> data;
}