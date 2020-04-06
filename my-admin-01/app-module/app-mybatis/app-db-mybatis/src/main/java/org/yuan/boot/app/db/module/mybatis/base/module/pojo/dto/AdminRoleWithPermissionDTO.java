package org.yuan.boot.app.db.module.mybatis.base.module.pojo.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import org.yuan.boot.app.db.module.mybatis.base.module.pojo.AdminPermission;
import org.yuan.boot.app.db.module.mybatis.base.module.pojo.AdminRole;

import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuanez
 * @create: 2020-02-21 09:47
 **/
@Data
public class AdminRoleWithPermissionDTO {
    private final AdminRole role;
    @Singular
    private final List<AdminPermission> permissions;

    @Builder
    public AdminRoleWithPermissionDTO(AdminRole role, List<AdminPermission> permissions) {
        this.role = role;
        this.permissions = permissions;
    }
}
