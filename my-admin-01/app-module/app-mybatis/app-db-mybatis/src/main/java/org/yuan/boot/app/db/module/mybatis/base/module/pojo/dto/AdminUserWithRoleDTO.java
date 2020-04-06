package org.yuan.boot.app.db.module.mybatis.base.module.pojo.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import org.yuan.boot.app.db.module.mybatis.base.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.base.module.pojo.AdminUser;

import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-21 00:42
 */
@Data
public class AdminUserWithRoleDTO {
    private final AdminUser user;
    @Singular
    private final List<AdminRole> roles;

    @Builder
    public AdminUserWithRoleDTO(AdminUser user, List<AdminRole> roles) {

        this.user = user;
        this.roles = roles;
    }
}