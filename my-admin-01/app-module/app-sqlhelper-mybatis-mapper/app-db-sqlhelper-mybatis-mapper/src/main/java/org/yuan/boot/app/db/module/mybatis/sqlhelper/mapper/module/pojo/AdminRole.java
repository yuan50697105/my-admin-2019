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