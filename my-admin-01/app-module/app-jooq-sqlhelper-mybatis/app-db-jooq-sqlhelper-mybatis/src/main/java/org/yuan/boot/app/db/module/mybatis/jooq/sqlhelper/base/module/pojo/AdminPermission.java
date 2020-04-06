package org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.pojo;

import lombok.*;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.commons.pojo.BaseEntity;

@SuppressWarnings("AlibabaClassMustHaveAuthor")
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdminPermission extends BaseEntity {
    /**
     * name
     */
    private String name;
}