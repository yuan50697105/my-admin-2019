package org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.pojo;

import lombok.*;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.commons.pojo.BaseEntity;

import javax.persistence.Entity;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AdminRole extends BaseEntity {
    /**
     * name
     */
    private String name;
}