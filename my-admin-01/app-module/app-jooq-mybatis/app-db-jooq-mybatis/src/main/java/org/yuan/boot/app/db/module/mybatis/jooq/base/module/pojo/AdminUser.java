package org.yuan.boot.app.db.module.mybatis.jooq.base.module.pojo;

import lombok.*;
import org.yuan.boot.app.db.module.mybatis.jooq.base.commons.pojo.BaseEntity;

@SuppressWarnings("AlibabaClassMustHaveAuthor")
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
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