package org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.pojo.condition;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.commons.pojo.BaseQuery;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-21 19:45
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class AdminUserQuery extends BaseQuery {
    private String username;
    private String name;
    private Integer enable;
}