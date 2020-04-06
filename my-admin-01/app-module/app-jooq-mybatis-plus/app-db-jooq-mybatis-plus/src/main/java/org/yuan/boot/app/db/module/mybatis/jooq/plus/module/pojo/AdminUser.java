package org.yuan.boot.app.db.module.mybatis.jooq.plus.module.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import org.yuan.boot.app.db.module.mybatis.jooq.plus.commons.pojo.BaseEntity;

@SuppressWarnings("AlibabaClassMustHaveAuthor")
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "admin_user")
public class AdminUser extends BaseEntity {
    /**
     * username
     */
    @TableField(value = "username")
    private String username;

    /**
     * password
     */
    @TableField(value = "password")
    private String password;

    /**
     * name
     */
    @TableField(value = "name")
    private String name;

    /**
     * enabled
     */
    @TableField(value = "enabled")
    private Integer enabled;

    public static AdminUserBuilder builder() {
        return new AdminUserBuilder();
    }
}