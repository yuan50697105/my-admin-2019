package org.yuan.boot.app.db.module.mybatis.jpa.base.module.dao;

import org.yuan.boot.app.db.module.mybatis.jpa.base.commons.dao.BaseDao;
import org.yuan.boot.app.db.module.mybatis.jpa.base.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.jpa.base.module.pojo.condition.AdminRoleQuery;
import org.yuan.boot.commons.base.module.mybaits.jpa.base.dao.pojo.PageResult;

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
