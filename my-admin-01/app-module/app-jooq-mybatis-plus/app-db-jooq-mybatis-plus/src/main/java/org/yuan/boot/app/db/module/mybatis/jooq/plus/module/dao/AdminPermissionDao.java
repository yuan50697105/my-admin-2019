package org.yuan.boot.app.db.module.mybatis.jooq.plus.module.dao;

import org.yuan.boot.app.db.module.mybatis.jooq.plus.commons.dao.BaseDao;
import org.yuan.boot.app.db.module.mybatis.jooq.plus.module.pojo.AdminPermission;
import org.yuan.boot.app.db.module.mybatis.jooq.plus.module.pojo.condition.AdminPermissionQuery;
import org.yuan.boot.commons.base.module.mybatis.jooq.plus.pojo.PageResult;

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
