package org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.commons.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.yuan.boot.commons.base.module.mybatis.jooq.sqlhelper.base.pojo.BaseDbQuery;

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
@NoArgsConstructor
public class BaseQuery extends BaseDbQuery {
    private Long id;
    private List<Long> ids;
    private String createUser;
    private String updateUser;
    private Date createDate;
    private Date createDateStart;
    private Date createDateEnd;
    private Date updateDate;
    private Date updateDateStart;
    private Date updateDateEnd;
}