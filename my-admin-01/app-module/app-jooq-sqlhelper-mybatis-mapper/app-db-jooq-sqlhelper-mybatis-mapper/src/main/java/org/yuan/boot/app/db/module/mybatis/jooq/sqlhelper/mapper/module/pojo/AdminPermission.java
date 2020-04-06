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
@Table(name = "admin_permission")
public class AdminPermission extends BaseEntity {
    /**
     * name
     */
    @Column(name = "`name`")
    private String name;

    public static AdminPermissionBuilder builder() {
        return new AdminPermissionBuilder();
    }
}