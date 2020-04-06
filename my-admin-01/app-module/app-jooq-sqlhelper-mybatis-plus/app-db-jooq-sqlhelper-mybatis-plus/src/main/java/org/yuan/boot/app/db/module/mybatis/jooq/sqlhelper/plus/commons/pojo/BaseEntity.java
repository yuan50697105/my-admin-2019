package org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.plus.commons.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.plus.commons.configuration.annotation.CreateTime;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.plus.commons.configuration.annotation.SnowFlakeId;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.plus.commons.configuration.annotation.UpdateTime;
import org.yuan.boot.commons.base.module.pojo.BaseDbEntity;

import java.util.Date;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 00:36
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BaseEntity extends BaseDbEntity {
    @SnowFlakeId
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String createUser;
    private String updateUser;
    @CreateTime
    private Date createTime;
    @UpdateTime
    private Date updateTime;
}