package org.yuan.boot.app.db.module.mybatis.base.module.pojo.condition;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.app.db.module.mybatis.base.commons.pojo.BaseQuery;

/**
 * @program: my-admin-01-wx
 * @description:
 * @author: yuane
 * @create: 2020-02-24 21:07
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class CustomerInfoQuery extends BaseQuery {
    private String nickName;
    private String phone;
}