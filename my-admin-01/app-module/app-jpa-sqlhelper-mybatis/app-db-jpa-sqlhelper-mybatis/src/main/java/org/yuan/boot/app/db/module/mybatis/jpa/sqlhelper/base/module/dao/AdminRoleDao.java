package org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.base.module.dao;

import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.base.commons.dao.BaseDao;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.base.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.base.module.pojo.condition.AdminRoleQuery;
import org.yuan.boot.commons.base.module.mybatis.jpa.sqlhelper.base.pojo.PageResult;

import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 00:54
 */
@SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
public interface AdminRoleDao extends BaseDao<AdminRole> {
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    PageResult<AdminRole> selectPageByCondition(AdminRoleQuery condition);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<AdminRole> selectListByCondition(AdminRoleQuery condition);
}
