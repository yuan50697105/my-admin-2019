package org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.commons.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.*;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.commons.configuration.SnowFlakeGenId;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.commons.configuration.annotation.CreateTime;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.commons.configuration.annotation.SnowFlakeId;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.commons.configuration.annotation.UpdateTime;
import org.yuan.boot.commons.base.module.mybatis.jpa.sqlhelper.mapper.pojo.BaseDbEntity;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.*;
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
@DynamicInsert
@DynamicUpdate
@SelectBeforeUpdate
public class BaseEntity extends BaseDbEntity {
    @Id
    @SnowFlakeId
    @KeySql(genId = SnowFlakeGenId.class)
    @GeneratedValue(generator = "snow", strategy = GenerationType.AUTO)
    @GenericGenerator(name = "snow", strategy = "org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.commons.configuration.SnowFlakeIdentifyGenerator")
    private Long id;
    private String createUser;
    private String updateUser;
    @CreationTimestamp
    @CreateTime
    @Column(updatable = false)
    private Date createTime;
    @UpdateTimestamp
    @UpdateTime
    private Date updateTime;
}