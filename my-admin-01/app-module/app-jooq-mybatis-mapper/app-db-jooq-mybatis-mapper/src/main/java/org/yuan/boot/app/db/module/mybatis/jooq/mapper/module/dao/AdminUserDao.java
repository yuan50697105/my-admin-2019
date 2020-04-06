package org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.dao;

import org.yuan.boot.app.db.module.mybatis.jooq.mapper.commons.dao.BaseDao;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.pojo.AdminUser;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.pojo.condition.AdminUserQuery;
import org.yuan.boot.commons.base.module.mybatis.jooq.mapper.pojo.PageResult;

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
