package org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.pojo;

import lombok.*;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.commons.pojo.BaseEntity;

import javax.persistence.Entity;

@SuppressWarnings("AlibabaClassMustHaveAuthor")
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AdminUserRole extends BaseEntity {
    /**
     * userId
     */
    private Long userId;

    /**
     * roleId
     */
    private Long roleId;
}