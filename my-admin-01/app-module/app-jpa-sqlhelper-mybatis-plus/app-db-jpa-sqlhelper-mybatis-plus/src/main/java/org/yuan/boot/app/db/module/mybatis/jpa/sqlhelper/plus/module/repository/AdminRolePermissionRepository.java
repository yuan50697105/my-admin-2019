package org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.plus.module.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.plus.commons.repository.BaseRepository;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.plus.module.pojo.AdminRolePermission;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 00:48
 */
@SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
@Repository
public interface AdminRolePermissionRepository extends BaseRepository<AdminRolePermission> {

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    @Modifying
    @Query(AdminRolePermissionRepositoryJPQL.DELETE_FROM_ADMIN_ROLE_PERMISSION_ARP_WHERE_ARP_PERMISSION_ID_IN_PERMISSION_ID)
    void deleteAllByPermissionIdIn(@Param("permissionId") Collection<Long> permissionId);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    @Modifying
    @Query(AdminRolePermissionRepositoryJPQL.DELETE_FROM_ADMIN_ROLE_PERMISSION_ARP_WHERE_ARP_ROLE_ID_ROLE_ID)
    void deleteAllByRoleId(@Param("roleId") Long roleId);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    @Modifying
    @Query(AdminRolePermissionRepositoryJPQL.DELETE_FROM_ADMIN_ROLE_PERMISSION_ARP_WHERE_ARP_ROLE_ID_IN_ROLE_ID)
    void deleteAllByRoleIdIn(@Param("roleId") Collection<Long> roleId);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    Optional<AdminRolePermission> findByRoleIdEquals(Long roleId);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<AdminRolePermission> findAllByRoleIdEquals(Long roleId);
}
