package org.yuan.boot.app.db.module.mybatis.jpa.mapper.module.pojo.vo;

import lombok.Data;
import org.yuan.boot.app.db.module.mybatis.jpa.mapper.module.pojo.AdminPermission;
import org.yuan.boot.app.db.module.mybatis.jpa.mapper.module.pojo.AdminRole;

import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-22 23:27
 */
@Data
public class AdminRolePermissionVO {
    private final AdminRole role;
    private final List<AdminPermission> permissions;

    public AdminRolePermissionVO(AdminRole role, List<AdminPermission> permissions) {

        this.role = role;
        this.permissions = permissions;
    }
}