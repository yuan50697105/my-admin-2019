package org.yuan.boot.app.admin.module.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.yuan.boot.app.admin.module.pojo.AdminRoleFormVO;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.pojo.AdminPermission;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.pojo.AdminRolePermission;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 01:14
 */
@SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
@Mapper(componentModel = "spring")
public interface AdminRoleConverter {
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    AdminRole addRole(AdminRoleFormVO adminRoleFormVO);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    @Mapping(target = "roleId", source = "adminRole.id")
    @Mapping(target = "permissionId", source = "adminPermission.id")
    AdminRolePermission addRolePermission(AdminRole adminRole, AdminPermission adminPermission);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
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
