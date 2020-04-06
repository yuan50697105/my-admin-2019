package org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.pojo.vo;

import lombok.Data;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.pojo.AdminUser;

import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-21 20:04
 */
@Data
public class AdminUserRoleVO {
    private final AdminUser user;
    private final List<AdminRole> roles;

    public AdminUserRoleVO(AdminUser user, List<AdminRole> roles) {
        this.user = user;
        this.roles = roles;
    }
}