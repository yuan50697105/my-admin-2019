package org.yuan.boot.app.db.module.mybatis.base.module.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;import org.yuan.boot.app.db.module.mybatis.base.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.base.module.pojo.AdminUserRole;import java.util.Collection;import java.util.List;

@Mapper
public interface AdminUserRoleMapper extends BaseMapper<AdminUserRole> {
    int deleteByPrimaryKey(Long id);

    int insert(AdminUserRole record);

    int insertSelective(AdminUserRole record);

    AdminUserRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AdminUserRole record);

    int updateByPrimaryKey(AdminUserRole record);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    int deleteByUserId(@Param("userId") Long userId);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    int deleteByUserIdIn(@Param("userIdCollection") Collection<Long> userIdCollection);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    int deleteByRoleIdIn(@Param("roleIdCollection") Collection<Long> roleIdCollection);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<AdminUserRole> selectByUserId(@Param("userId") Long userId);
}