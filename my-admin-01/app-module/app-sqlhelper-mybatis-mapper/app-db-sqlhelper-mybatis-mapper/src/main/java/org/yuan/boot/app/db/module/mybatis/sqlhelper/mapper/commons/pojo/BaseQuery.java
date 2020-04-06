package org.yuan.boot.app.db.module.mybatis.sqlhelper.mapper.commons.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.commons.base.module.mybatis.sqlhelper.mapper.pojo.BaseDbQuery;

import java.util.Date;
import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 00:37
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BaseQuery extends BaseDbQuery {
    private Long id;
    private List<Long> ids;
    private String createUser;
    private String updateUser;
    private Date createDateStart;
    private Date createDateEnd;
    private Date updateDateStart;
    private Date updateDateEnd;
}