package org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.mapper.module.pojo;

import lombok.*;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.mapper.commons.pojo.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "admin_user_role")
public class AdminUserRole extends BaseEntity {
    /**
     * userId
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * roleId
     */
    @Column(name = "role_id")
    private Long roleId;

    public static AdminUserRoleBuilder builder() {
        return new AdminUserRoleBuilder();
    }
}