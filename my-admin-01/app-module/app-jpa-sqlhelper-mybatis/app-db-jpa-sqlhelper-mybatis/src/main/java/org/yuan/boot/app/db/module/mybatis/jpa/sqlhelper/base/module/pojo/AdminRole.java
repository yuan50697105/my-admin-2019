package org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.base.module.pojo;

import lombok.*;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.base.commons.pojo.BaseEntity;

import javax.persistence.Entity;

@SuppressWarnings("AlibabaClassMustHaveAuthor")
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