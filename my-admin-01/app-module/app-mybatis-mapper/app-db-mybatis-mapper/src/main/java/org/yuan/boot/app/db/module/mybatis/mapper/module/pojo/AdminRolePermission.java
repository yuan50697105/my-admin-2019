package org.yuan.boot.app.db.module.mybatis.mapper.module.pojo;

import lombok.*;
import org.yuan.boot.app.db.module.mybatis.mapper.commons.pojo.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;

@SuppressWarnings("AlibabaClassMustHaveAuthor")
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "admin_role_permission")
public class AdminRolePermission extends BaseEntity {
    /**
     * roleId
     */
    @Column(name = "role_id")
    private Long roleId;

    /**
     * permissionId
     */
    @Column(name = "permission_id")
    private Long permissionId;

    public static AdminRolePermissionBuilder builder() {
        return new AdminRolePermissionBuilder();
    }
}