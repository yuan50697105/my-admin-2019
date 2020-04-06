package org.yuan.boot.app.db.module.mybatis.jpa.jooq.base.module.pojo;

import lombok.*;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.base.commons.pojo.BaseEntity;

import javax.persistence.Entity;

@SuppressWarnings("AlibabaClassMustHaveAuthor")
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AdminUser extends BaseEntity {
    /**
     * username
     */
    private String username;

    /**
     * password
     */
    private String password;

    /**
     * name
     */
    private String name;

    /**
     * enabled
     */
    private Integer enabled;
}