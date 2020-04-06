package org.yuan.boot.commons.core.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @program: my-admin-02
 * @description:
 * @author: yuane
 * @create: 2020-03-18 23:16
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CommonsQueryPageResult<E extends CommonsPageResult<?>, C extends CommonsQuery> extends CommonsPOJO {
    private C query;
    private E result;

    public CommonsQueryPageResult(C query, E result) {
        this.query = query;
        this.result = result;
    }
}