package org.yuan.boot.app.db.module.mybatis.base.module.pojo.condition;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.app.db.module.mybatis.base.commons.pojo.BaseQuery;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-21 00:16
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AdminRoleQuery extends BaseQuery {
    private String name;
}