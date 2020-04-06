package org.yuan.boot.app.admin.module.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.yuan.boot.app.admin.module.pojo.AdminRoleFormVO;
import org.yuan.boot.app.db.module.mybatis.base.module.pojo.AdminPermission;
import org.yuan.boot.app.db.module.mybatis.base.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.base.module.pojo.AdminRolePermission;

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
    @Mapping(target = "updateUser", ignore = true)
    @Mapping(target = "updateTime", ignore = true)
    @Mapping(target = "createUser", ignore = true)
    @Mapping(target = "createTime", ignore = true)
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    AdminRole createNew(AdminRoleFormVO adminRoleFormVO);

    @Mapping(target = "updateTime", ignore = true)
    @Mapping(target = "updateUser", ignore = true)
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createUser", ignore = true)
    @Mapping(target = "createTime", ignore = true)
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    @Mapping(target = "roleId", source = "adminRole.id")
    @Mapping(target = "permissionId", source = "adminPermission.id")
    AdminRolePermission createRolePermission(AdminRole adminRole, AdminPermission adminPermission);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    default List<AdminRolePermission> createRolePermission(AdminRole adminRole, List<AdminPermission> adminPermissions) {
        ArrayList<AdminRolePermission> adminRolePermissions = new ArrayList<>(adminPermissions.size());
        if (adminRole != null) {
            for (AdminPermission adminPermission : adminPermissions) {
                adminRolePermissions.add(createRolePermission(adminRole, adminPermission));
            }
        }
        return adminRolePermissions;
    }
}
