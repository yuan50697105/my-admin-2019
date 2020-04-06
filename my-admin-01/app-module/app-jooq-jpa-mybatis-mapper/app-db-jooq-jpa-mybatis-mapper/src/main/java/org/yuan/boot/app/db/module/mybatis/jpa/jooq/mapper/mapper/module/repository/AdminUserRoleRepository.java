package org.yuan.boot.app.db.module.mybatis.jpa.jooq.mapper.mapper.module.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.mapper.mapper.commons.repository.BaseRepository;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.mapper.mapper.module.pojo.AdminUserRole;

import java.util.Collection;
import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 00:49
 */
@SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
@Repository
public interface AdminUserRoleRepository extends BaseRepository<AdminUserRole> {

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    @Modifying
    @Query(AdminUserRoleRepositoryJPQL.DELETE_FROM_ADMIN_USER_ROLE_AUR_WHERE_AUR_ROLE_ID_ROLE_ID)
    void deleteAllByRoleId(@Param("roleId") Long roleId);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    @Modifying
    @Query(AdminUserRoleRepositoryJPQL.DELETE_FROM_ADMIN_USER_ROLE_AUR_WHERE_AUR_ROLE_ID_IN_ROLE_ID)
    void deleteAllByRoleIdIn(@Param("roleId") Collection<Long> roleId);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    @Modifying
    @Query(AdminUserRoleRepositoryJPQL.DELETE_FROM_ADMIN_USER_ROLE_AUR_WHERE_AUR_USER_ID_ROLE_ID)
    void deleteAllByUserId(@Param("roleId") Long userId);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    @Modifying
    @Query(AdminUserRoleRepositoryJPQL.DELETE_FROM_ADMIN_USER_ROLE_AUR_WHERE_AUR_USER_ID_IN_USER_ID)
    void deleteAllByUserIdIn(@Param("userId") Collection<Long> userId);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<AdminUserRole> findAllByUserIdEquals(Long userId);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<AdminUserRole> findAllByUserIdIn(Collection<Long> userId);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<AdminUserRole> findAllByRoleIdEquals(Long roleId);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<AdminUserRole> findAllByRoleIdIn(Collection<Long> roleId);
}
