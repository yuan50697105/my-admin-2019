package org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.mapper.module.pojo.vo;

import lombok.Data;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.mapper.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.mapper.module.pojo.AdminUser;

import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-22 23:47
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