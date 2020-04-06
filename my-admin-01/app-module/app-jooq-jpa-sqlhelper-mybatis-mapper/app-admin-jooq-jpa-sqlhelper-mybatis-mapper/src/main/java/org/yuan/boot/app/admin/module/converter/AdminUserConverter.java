package org.yuan.boot.app.admin.module.converter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.yuan.boot.app.admin.module.pojo.AdminUserFormVO;
import org.yuan.boot.app.db.core.constants.CommonsConstants;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.mapper.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.mapper.module.pojo.AdminUser;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.mapper.module.pojo.AdminUserRole;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 01:14
 */
@Mapper(componentModel = "spring")
public interface AdminUserConverter {
    /**
     * 添加用户转换方法
     *
     * @param adminUserFormVO 用户表单模型
     * @return 用户信息
     */
    @Mappings(value = {
            @Mapping(target = "enabled", defaultValue = CommonsConstants.ENABLE_STR)
    })
    AdminUser addUser(AdminUserFormVO adminUserFormVO);

    /**
     * 添加用户角色关联
     *
     * @param adminUser 用户信息
     * @param adminRole 角色信息
     * @return 用户角色
     */
    @Mappings({

            @Mapping(target = "roleId", source = "adminUser.id"),
            @Mapping(target = "userId", source = "adminRole.id")
    })
    AdminUserRole addUserRole(AdminUser adminUser, AdminRole adminRole);

    /**
     * 添加用户角色关联
     *
     * @param adminUser  用户信息
     * @param adminRoles 角色列表
     * @return 用户角色列表
     */
    default List<AdminUserRole> addUserRoleList(AdminUser adminUser, List<AdminRole> adminRoles) {
        ArrayList<AdminUserRole> adminUserRoles = new ArrayList<>(adminRoles.size());
        if (adminUser != null) {
            for (AdminRole adminRole : adminRoles) {
                adminUserRoles.add(addUserRole(adminUser, adminRole));
            }
        }
        return adminUserRoles;
    }

}
