package org.yuan.boot.app.db.module.mybatis.plus.module.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yuan.boot.app.db.module.mybatis.plus.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.plus.module.pojo.AdminUser;
import org.yuan.boot.app.db.module.mybatis.plus.module.pojo.condition.AdminUserQuery;

import java.util.List;

@SuppressWarnings({"AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc", "AlibabaClassMustHaveAuthor"})
@Mapper
public interface AdminUserMapper extends BaseMapper<AdminUser> {
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<AdminUser> selectListByCondition(AdminUserQuery condition);
}