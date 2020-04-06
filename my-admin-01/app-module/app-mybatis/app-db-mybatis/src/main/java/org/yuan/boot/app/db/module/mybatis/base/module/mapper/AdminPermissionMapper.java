package org.yuan.boot.app.db.module.mybatis.base.module.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;import org.yuan.boot.app.db.module.mybatis.base.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.base.module.pojo.AdminPermission;import org.yuan.boot.app.db.module.mybatis.base.module.pojo.condition.AdminPermissionQuery;import java.util.Collection;import java.util.List;

@Mapper
public interface AdminPermissionMapper extends BaseMapper<AdminPermission> {
    int deleteByPrimaryKey(Long id);

    int insert(AdminPermission record);

    int insertSelective(AdminPermission record);

    AdminPermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AdminPermission record);

    int updateByPrimaryKey(AdminPermission record);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<AdminPermission> selectByIdIn(@Param("idCollection") Collection<Long> idCollection);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    int deleteByIdIn(@Param("idCollection") Collection<Long> idCollection);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<AdminPermission> selectByQueryCondition(AdminPermissionQuery condition);
}