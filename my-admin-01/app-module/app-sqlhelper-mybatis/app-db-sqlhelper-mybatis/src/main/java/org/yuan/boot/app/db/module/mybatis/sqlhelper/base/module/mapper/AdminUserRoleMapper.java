package org.yuan.boot.app.db.module.mybatis.sqlhelper.base.module.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.base.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.base.module.pojo.AdminUserRole;

import java.util.Collection;
import java.util.List;

@SuppressWarnings({"AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc", "AlibabaClassMustHaveAuthor"})
@Mapper
public interface AdminUserRoleMapper extends BaseMapper<AdminUserRole> {
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    int deleteByPrimaryKey(Long id);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    int insert(AdminUserRole record);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    int insertSelective(AdminUserRole record);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    AdminUserRole selectByPrimaryKey(Long id);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    int updateByPrimaryKeySelective(AdminUserRole record);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
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