package org.yuan.boot.app.db.module.mybatis.jooq.base.module.dao;

import org.yuan.boot.app.db.module.mybatis.jooq.base.commons.dao.BaseDao;
import org.yuan.boot.app.db.module.mybatis.jooq.base.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.jooq.base.module.pojo.condition.AdminRoleQuery;
import org.yuan.boot.commons.base.module.mybatis.jooq.base.pojo.PageResult;

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
    void insert(AdminRole adminRole);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    void updateSelective(AdminRole adminRole);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    AdminRole selectById(Long id);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<AdminRole> selectByIds(List<Long> ids);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    void deleteByIds(List<Long> ids);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    PageResult<AdminRole> selectPageByCondition(AdminRoleQuery condition);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<AdminRole> selectListByCondition(AdminRoleQuery condition);
}
