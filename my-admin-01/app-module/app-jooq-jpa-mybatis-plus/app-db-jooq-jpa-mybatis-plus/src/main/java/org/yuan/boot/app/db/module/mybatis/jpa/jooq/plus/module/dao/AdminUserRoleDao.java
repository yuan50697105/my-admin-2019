package org.yuan.boot.app.db.module.mybatis.jpa.jooq.plus.module.dao;

import org.yuan.boot.app.db.module.mybatis.jpa.jooq.plus.commons.dao.BaseDao;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.plus.module.pojo.AdminUserRole;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.plus.module.pojo.vo.AdminUserRoleVO;

import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 00:56
 */
@SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
public interface AdminUserRoleDao extends BaseDao<AdminUserRole> {
    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    void deleteByRoleIds(List<Long> roleIds);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    void deleteAllByUserId(Long userId);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    void deleteAllByUserIds(List<Long> userIds);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    AdminUserRoleVO getUserRoleByUserId(Long userId);
}
