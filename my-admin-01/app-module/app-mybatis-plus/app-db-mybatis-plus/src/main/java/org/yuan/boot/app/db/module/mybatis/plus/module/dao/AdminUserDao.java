package org.yuan.boot.app.db.module.mybatis.plus.module.dao;

import org.yuan.boot.app.db.module.mybatis.plus.commons.dao.BaseDao;
import org.yuan.boot.app.db.module.mybatis.plus.module.pojo.AdminUser;
import org.yuan.boot.app.db.module.mybatis.plus.module.pojo.condition.AdminUserQuery;
import org.yuan.boot.commons.base.module.mybatis.plus.pojo.PageResult;

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
    boolean enableByIds(List<Long> ids);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    boolean disableByIds(List<Long> ids);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    PageResult<AdminUser> selectPageByCondition(AdminUserQuery condition);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<AdminUser> selectListByCondition(AdminUserQuery condition);
}
