package org.yuan.boot.app.db.module.mybatis.mapper.module.pojo;

import lombok.*;
import org.yuan.boot.app.db.module.mybatis.mapper.commons.pojo.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "admin_role")
public class AdminRole extends BaseEntity {
    /**
     * name
     */
    @Column(name = "`name`")
    private String name;

    public static AdminRoleBuilder builder() {
        return new AdminRoleBuilder();
    }
}