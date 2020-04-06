package org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.pojo.AdminUser;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.pojo.condition.AdminUserQuery;

import java.util.Collection;
import java.util.List;

@SuppressWarnings({"AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc", "AlibabaClassMustHaveAuthor"})
@Mapper
public interface AdminUserMapper extends BaseMapper<AdminUser> {
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    int deleteByPrimaryKey(Long id);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    AdminUser selectByPrimaryKey(Long id);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    int updateEnabledByIdIn(@Param("updatedEnabled") Integer updatedEnabled, @Param("idCollection") Collection<Long> idCollection);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<AdminUser> selectByCondition(AdminUserQuery condition);
}