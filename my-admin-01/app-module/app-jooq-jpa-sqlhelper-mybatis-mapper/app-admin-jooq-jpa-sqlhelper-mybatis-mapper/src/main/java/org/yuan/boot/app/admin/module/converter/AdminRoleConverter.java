package org.yuan.boot.app.admin.module.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.yuan.boot.app.admin.module.pojo.AdminRoleFormVO;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.mapper.module.pojo.AdminPermission;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.mapper.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.mapper.module.pojo.AdminRolePermission;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 01:14
 */
@Mapper(componentModel = "spring")
public interface AdminRoleConverter {
    AdminRole addRole(AdminRoleFormVO adminRoleFormVO);

    @Mapping(target = "roleId", source = "adminRole.id")
    @Mapping(target = "permissionId", source = "adminPermission.id")
    AdminRolePermission addRolePermission(AdminRole adminRole, AdminPermission adminPermission);

    default List<AdminRolePermission> addRolePermissionList(AdminRole adminRole, List<AdminPermission> adminPermissions) {
        ArrayList<AdminRolePermission> adminRolePermissions = new ArrayList<>(adminPermissions.size());
        if (adminRole != null) {
            for (AdminPermission adminPermission : adminPermissions) {
                adminRolePermissions.add(addRolePermission(adminRole, adminPermission));
            }
        }
        return adminRolePermissions;
    }
}
