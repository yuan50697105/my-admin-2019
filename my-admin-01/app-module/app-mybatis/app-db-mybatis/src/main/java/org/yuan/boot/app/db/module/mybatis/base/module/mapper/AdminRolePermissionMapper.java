package org.yuan.boot.app.db.module.mybatis.base.module.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;import org.yuan.boot.app.db.module.mybatis.base.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.base.module.pojo.AdminRolePermission;import java.util.Collection;import java.util.List;

@Mapper
public interface AdminRolePermissionMapper extends BaseMapper<AdminRolePermission> {
    int deleteByPrimaryKey(Long id);

    int insert(AdminRolePermission record);

    int insertSelective(AdminRolePermission record);

    AdminRolePermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AdminRolePermission record);

    int updateByPrimaryKey(AdminRolePermission record);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    int deleteByRoleId(@Param("roleId") Long roleId);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    int deleteByRoleIdIn(@Param("roleIdCollection") Collection<Long> roleIdCollection);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    int deleteByPermissionIdIn(@Param("permissionIdCollection") Collection<Long> permissionIdCollection);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<AdminRolePermission> selectByRoleId(@Param("roleId") Long roleId);
}