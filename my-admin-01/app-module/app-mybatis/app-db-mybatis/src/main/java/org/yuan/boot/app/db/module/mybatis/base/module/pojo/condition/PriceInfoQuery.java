package org.yuan.boot.app.db.module.mybatis.base.module.pojo.condition;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.app.db.module.mybatis.base.commons.pojo.BaseQuery;

/**
 * @program: my-admin-shower
 * @description:
 * @author: yuane
 * @create: 2020-02-25 20:09
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PriceInfoQuery extends BaseQuery {
    private Integer type;
    private String code;
}