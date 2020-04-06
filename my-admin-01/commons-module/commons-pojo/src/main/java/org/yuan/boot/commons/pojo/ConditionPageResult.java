package org.yuan.boot.commons.pojo;

import lombok.*;

/**
 * @program: my-admin-01
 * @description: 带有返回条件的分页结果
 * @author: yuanez
 * @create: 2020-02-19 10:41
 **/
@EqualsAndHashCode(callSuper = true)
@Value
@AllArgsConstructor
@With
@Builder
public class ConditionPageResult<T, C> extends BaseCoreEntity {
    private BasePageResult<T> result;
    private C query;

}
