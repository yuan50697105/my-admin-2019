package org.yuan.boot.app.db.module.mybatis.mapper.commons.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.app.db.module.mybatis.mapper.commons.configuration.SnowFlakeGenId;
import org.yuan.boot.app.db.module.mybatis.mapper.commons.configuration.annotation.CreateTime;
import org.yuan.boot.app.db.module.mybatis.mapper.commons.configuration.annotation.SnowFlakeId;
import org.yuan.boot.app.db.module.mybatis.mapper.commons.configuration.annotation.UpdateTime;
import org.yuan.boot.commons.base.module.mybatis.mapper.pojo.BaseDbEntity;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 00:36
 */
@EqualsAndHashCode(callSuper = true)
@Data
@MappedSuperclass
public class BaseEntity extends BaseDbEntity {
    @Id
    @KeySql(genId = SnowFlakeGenId.class)
    @SnowFlakeId
    private Long id;
    private String createUser;
    private String updateUser;
    @CreateTime
    private Date createTime;
    @UpdateTime
    private Date updateTime;
}