package org.yuan.boot.app.db.module.mybatis.plus.module.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import org.yuan.boot.app.db.module.mybatis.plus.commons.pojo.BaseEntity;

@SuppressWarnings("AlibabaClassMustHaveAuthor")
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "admin_role_permission")
public class AdminRolePermission extends BaseEntity {
    /**
     * roleId
     */
    @TableField(value = "role_id")
    private Long roleId;

    /**
     * permissionId
     */
    @TableField(value = "permission_id")
    private Long permissionId;

    public static AdminRolePermissionBuilder builder() {
        return new AdminRolePermissionBuilder();
    }
}