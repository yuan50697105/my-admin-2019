package org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.pojo.condition;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.commons.pojo.BaseQuery;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-22 23:41
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AdminUserQuery extends BaseQuery {
    private String username;
    private String name;
    private Integer enabled;
}