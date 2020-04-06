package org.yuan.boot.app.db.module.mybatis.jpa.jooq.plus.commons.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.*;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.plus.commons.configuration.annotation.CreateTime;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.plus.commons.configuration.annotation.SnowFlakeId;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.plus.commons.configuration.annotation.UpdateTime;
import org.yuan.boot.commons.base.module.mybatis.jpa.jooq.plus.pojo.BaseDbEntity;

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
    @TableId(type = IdType.ASSIGN_ID)
    @SnowFlakeId
    @GeneratedValue(generator = "snow", strategy = GenerationType.AUTO)
    @GenericGenerator(name = "snow", strategy = "org.yuan.boot.app.db.module.mybatis.jpa.jooq.plus.commons.configuration.SnowFlakeIdentifyGenerator")
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