package org.yuan.boot.app.db.module.mybatis.jpa.plus.module.pojo.condition;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.app.db.module.mybatis.jpa.plus.commons.pojo.BaseQuery;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-22 23:19
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AdminRoleQuery extends BaseQuery {
    private String name;
}