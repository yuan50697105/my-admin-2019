package org.yuan.boot.app.db.module.mybatis.base.module.pojo;

import lombok.*;
import org.yuan.boot.app.db.module.mybatis.base.commons.pojo.BaseEntity;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AdminPermission extends BaseEntity {
    /**
     * name
     */
    private String name;

}