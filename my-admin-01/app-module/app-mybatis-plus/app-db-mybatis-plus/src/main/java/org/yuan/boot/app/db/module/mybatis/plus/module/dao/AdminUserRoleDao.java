package org.yuan.boot.app.db.module.mybatis.plus.module.dao;

import org.yuan.boot.app.db.module.mybatis.plus.commons.dao.BaseDao;
import org.yuan.boot.app.db.module.mybatis.plus.module.pojo.AdminUserRole;
import org.yuan.boot.app.db.module.mybatis.plus.module.pojo.vo.AdminUserRoleVO;

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
    boolean removeByUserId(Long userId);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    boolean removeByUserIds(List<Long> userIds);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    boolean removeByRoleIds(List<Long> roleIds);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    AdminUserRoleVO getUserRoleByUserId(Long userId);
}
