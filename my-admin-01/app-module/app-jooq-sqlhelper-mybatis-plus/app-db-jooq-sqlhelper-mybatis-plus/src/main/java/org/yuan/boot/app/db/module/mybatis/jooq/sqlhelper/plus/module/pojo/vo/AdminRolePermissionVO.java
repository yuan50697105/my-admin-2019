package org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.plus.module.pojo.vo;

import lombok.Data;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.plus.module.pojo.AdminPermission;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.plus.module.pojo.AdminRole;

import java.util.Collection;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-21 23:26
 */
@Data
public class AdminRolePermissionVO {
    private final AdminRole role;
    private final Iterable<AdminPermission> permissions;

    public AdminRolePermissionVO(AdminRole role, Collection<AdminPermission> permissions) {
        this.role = role;
        this.permissions = permissions;
    }
}