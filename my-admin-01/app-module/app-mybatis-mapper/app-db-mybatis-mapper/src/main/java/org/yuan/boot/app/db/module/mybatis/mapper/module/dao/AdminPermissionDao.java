package org.yuan.boot.app.db.module.mybatis.mapper.module.dao;

import org.yuan.boot.app.db.module.mybatis.mapper.commons.dao.BaseDao;
import org.yuan.boot.app.db.module.mybatis.mapper.module.pojo.AdminPermission;
import org.yuan.boot.app.db.module.mybatis.mapper.module.pojo.condition.AdminPermissionQuery;
import org.yuan.boot.commons.base.module.mybatis.mapper.pojo.PageResult;

import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 00:53
 */
@SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
public interface AdminPermissionDao extends BaseDao<AdminPermission> {
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    PageResult<AdminPermission> selectPageByCondition(AdminPermissionQuery condition);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<AdminPermission> selectListByCondition(AdminPermissionQuery condition);
}
