package org.yuan.boot.app.db.module.mybatis.jooq.base.module.dao;

import org.yuan.boot.app.db.module.mybatis.jooq.base.commons.dao.BaseDao;
import org.yuan.boot.app.db.module.mybatis.jooq.base.module.pojo.AdminPermission;
import org.yuan.boot.app.db.module.mybatis.jooq.base.module.pojo.condition.AdminPermissionQuery;
import org.yuan.boot.commons.base.module.mybatis.jooq.base.pojo.PageResult;

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
    void insert(AdminPermission adminPermission);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    void updateSelective(AdminPermission adminPermission);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    void deleteByIds(List<Long> ids);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    AdminPermission selectById(Long id);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<AdminPermission> selectByIds(List<Long> ids);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    PageResult<AdminPermission> selectPageByCondition(AdminPermissionQuery condition);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<AdminPermission> selectListByCondition(AdminPermissionQuery condition);
}
