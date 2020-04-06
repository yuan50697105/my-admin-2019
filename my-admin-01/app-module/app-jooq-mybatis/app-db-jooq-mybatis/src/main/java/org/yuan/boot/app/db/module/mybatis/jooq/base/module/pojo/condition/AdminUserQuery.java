package org.yuan.boot.app.db.module.mybatis.jooq.base.module.pojo.condition;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.app.db.module.mybatis.jooq.base.commons.pojo.BaseQuery;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 23:50
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AdminUserQuery extends BaseQuery {
    private String username;
    private String name;
    private Integer enabled;
}