package org.yuan.boot.app.db.module.mybatis.jpa.plus.module.pojo;

import lombok.*;
import org.yuan.boot.app.db.module.mybatis.jpa.plus.commons.pojo.BaseEntity;

import javax.persistence.Entity;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AdminRolePermission extends BaseEntity {
    /**
     * roleId
     */
    private Long roleId;

    /**
     * permissionId
     */
    private Long permissionId;
}