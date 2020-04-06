package org.yuan.boot.commons.core.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: my-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-03-18 23:26
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CommonsQuery extends CommonsPOJO {
    private Integer pageIndex = 1;
    private Integer pageSize;
    private String sort;
    private String order;
}