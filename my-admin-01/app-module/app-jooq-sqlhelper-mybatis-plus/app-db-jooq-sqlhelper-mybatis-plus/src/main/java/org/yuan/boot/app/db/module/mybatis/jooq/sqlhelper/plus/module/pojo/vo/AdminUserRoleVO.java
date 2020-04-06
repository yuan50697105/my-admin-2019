package org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.plus.module.pojo.vo;

import lombok.Data;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.plus.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.plus.module.pojo.AdminUser;

import java.util.Collection;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-21 23:08
 */
@Data
public class AdminUserRoleVO {
    private final AdminUser user;
    private final Iterable<AdminRole> roles;

    public AdminUserRoleVO(AdminUser user, Collection<AdminRole> roles) {

        this.user = user;
        this.roles = roles;
    }
}