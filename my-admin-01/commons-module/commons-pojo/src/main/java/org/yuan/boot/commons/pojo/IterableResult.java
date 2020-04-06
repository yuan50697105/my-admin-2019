package org.yuan.boot.commons.pojo;

import lombok.*;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-03-01 22:23
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@Builder
@With
public class IterableResult<T,E> extends BaseCoreEntity {
    private Iterable<T> data;
    private E query;

}