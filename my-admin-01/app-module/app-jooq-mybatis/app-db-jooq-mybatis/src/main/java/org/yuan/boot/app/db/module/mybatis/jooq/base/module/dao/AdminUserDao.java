package org.yuan.boot.app.db.module.mybatis.jooq.base.module.dao;

import org.yuan.boot.app.db.module.mybatis.jooq.base.commons.dao.BaseDao;
import org.yuan.boot.app.db.module.mybatis.jooq.base.module.pojo.AdminUser;
import org.yuan.boot.app.db.module.mybatis.jooq.base.module.pojo.condition.AdminUserQuery;
import org.yuan.boot.commons.base.module.mybatis.jooq.base.pojo.PageResult;

import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 00:56
 */
@SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
public interface AdminUserDao extends BaseDao<AdminUser> {
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    void insert(AdminUser adminUser);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    void updateSelective(AdminUser adminUser);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    void updateEnableByIds(List<Long> ids);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    void updateDisableByIds(List<Long> ids);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    void deleteById(Long id);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    void deleteByIds(List<Long> ids);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    AdminUser selectById(Long id);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    PageResult<AdminUser> selectPageByCondition(AdminUserQuery condition);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<AdminUser> selectListByCondition(AdminUserQuery condition);
}
