package org.yuan.boot.app.db.module.mybatis.jooq.plus.module.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;
import org.yuan.boot.app.db.module.mybatis.jooq.plus.commons.pojo.BaseEntity;

@SuppressWarnings("AlibabaClassMustHaveAuthor")
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "admin_role")
public class AdminRole extends BaseEntity {
    /**
     * name
     */
    @TableField(value = "name")
    private String name;

    public static AdminRoleBuilder builder() {
        return new AdminRoleBuilder();
    }
}