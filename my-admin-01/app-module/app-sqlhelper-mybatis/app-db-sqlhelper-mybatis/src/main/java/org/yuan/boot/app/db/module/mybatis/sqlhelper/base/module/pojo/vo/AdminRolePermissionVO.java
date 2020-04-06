package org.yuan.boot.app.db.module.mybatis.sqlhelper.base.module.pojo.vo;

import lombok.Data;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.base.module.pojo.AdminPermission;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.base.module.pojo.AdminRole;

import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuanez
 * @create: 2020-02-21 09:47
 **/
@Data
public class AdminRolePermissionVO {
    private final AdminRole role;
    private final List<AdminPermission> permissions;

    public AdminRolePermissionVO(AdminRole role, List<AdminPermission> permissions) {
        this.role = role;
        this.permissions = permissions;
    }
}
