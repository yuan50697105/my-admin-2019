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
@TableName(value = "admin_user_role")
public class AdminUserRole extends BaseEntity {
    /**
     * userId
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * roleId
     */
    @TableField(value = "role_id")
    private Long roleId;

    public static AdminUserRoleBuilder builder() {
        return new AdminUserRoleBuilder();
    }
}