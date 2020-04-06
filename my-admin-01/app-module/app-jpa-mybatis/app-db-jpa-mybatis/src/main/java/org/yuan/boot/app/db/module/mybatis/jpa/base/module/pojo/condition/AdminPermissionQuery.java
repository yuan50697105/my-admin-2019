package org.yuan.boot.app.db.module.mybatis.jpa.base.module.pojo.condition;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.app.db.module.mybatis.jpa.base.commons.pojo.BaseQuery;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-22 23:04
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class AdminPermissionQuery extends BaseQuery {
    private String name;
}