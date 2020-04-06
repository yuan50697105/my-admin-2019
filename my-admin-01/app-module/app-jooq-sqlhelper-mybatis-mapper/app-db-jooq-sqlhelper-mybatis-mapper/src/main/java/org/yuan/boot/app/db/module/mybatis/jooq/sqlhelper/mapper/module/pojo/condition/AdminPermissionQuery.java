package org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.mapper.module.pojo.condition;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.mapper.commons.pojo.BaseQuery;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-21 19:52
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AdminPermissionQuery extends BaseQuery {
    private String name;
}