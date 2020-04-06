package org.yuan.boot.app.db.module.mybatis.sqlhelper.mapper.module.dao;

import org.yuan.boot.app.db.module.mybatis.sqlhelper.mapper.commons.dao.BaseDao;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.mapper.module.pojo.AdminUser;
import org.yuan.boot.app.db.module.mybatis.sqlhelper.mapper.module.pojo.condition.AdminUserQuery;
import org.yuan.boot.commons.base.module.mybatis.sqlhelper.mapper.pojo.PageResult;

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
    PageResult<AdminUser> selectPageByCondition(AdminUserQuery condition);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<AdminUser> selectListByCondition(AdminUserQuery condition);
}
