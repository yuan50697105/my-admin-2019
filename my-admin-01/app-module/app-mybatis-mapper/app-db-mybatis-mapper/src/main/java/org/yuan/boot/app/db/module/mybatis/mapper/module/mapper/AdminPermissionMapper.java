package org.yuan.boot.app.db.module.mybatis.mapper.module.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yuan.boot.app.db.module.mybatis.mapper.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.mapper.module.pojo.AdminPermission;
import org.yuan.boot.app.db.module.mybatis.mapper.module.pojo.condition.AdminPermissionQuery;

import java.util.List;

@SuppressWarnings({"AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc", "AlibabaClassMustHaveAuthor"})
@Mapper
public interface AdminPermissionMapper extends BaseMapper<AdminPermission> {
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<AdminPermission> selectByCondition(AdminPermissionQuery condition);
}