package org.yuan.boot.app.db.module.mybatis.sqlhelper.mapper.module.pojo;

import lombok.*;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.mapper.commons.pojo.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;

@SuppressWarnings("AlibabaClassMustHaveAuthor")
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "admin_user")
public class AdminUser extends BaseEntity {
    /**
     * username
     */
    @Column(name = "username")
    private String username;

    /**
     * password
     */
    @Column(name = "`password`")
    private String password;

    /**
     * name
     */
    @Column(name = "`name`")
    private String name;

    /**
     * enabled
     */
    @Column(name = "enabled")
    private Integer enabled;

    public static AdminUserBuilder builder() {
        return new AdminUserBuilder();
    }
}