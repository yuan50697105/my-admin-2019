package org.yuan.boot.app.db.module.mybatis.jpa.jooq.mapper.mapper.module.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.mapper.mapper.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.mapper.mapper.module.pojo.AdminUser;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.mapper.mapper.module.pojo.condition.AdminUserQuery;

import java.util.Collection;
import java.util.List;

@SuppressWarnings({"AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc", "AlibabaClassMustHaveAuthor", "AliMissingOverrideAnnotation"})
@Mapper
public interface AdminUserMapper extends BaseMapper<AdminUser> {
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    int deleteByPrimaryKey(Long id);

    @SuppressWarnings({"AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc", "AliMissingOverrideAnnotation"})
    int insert(AdminUser record);

    @SuppressWarnings({"AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc", "AliMissingOverrideAnnotation"})
    int insertSelective(AdminUser record);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    AdminUser selectByPrimaryKey(Long id);

    @SuppressWarnings({"AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc", "AliMissingOverrideAnnotation"})
    int updateByPrimaryKeySelective(AdminUser record);

    @SuppressWarnings({"AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc", "AliMissingOverrideAnnotation"})
    int updateByPrimaryKey(AdminUser record);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    int updateEnabledByIdIn(@Param("updatedEnabled") Integer updatedEnabled, @Param("idCollection") Collection<Long> idCollection);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<AdminUser> selectByCondition(AdminUserQuery condition);
}