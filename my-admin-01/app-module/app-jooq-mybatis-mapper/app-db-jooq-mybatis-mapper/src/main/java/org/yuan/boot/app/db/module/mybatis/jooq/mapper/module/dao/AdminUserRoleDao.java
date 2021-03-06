package org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.dao;

import org.yuan.boot.app.db.module.mybatis.jooq.mapper.commons.dao.BaseDao;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.pojo.AdminUserRole;
import org.yuan.boot.app.db.module.mybatis.jooq.mapper.module.pojo.vo.AdminUserRoleVO;

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
    void batchInsert(List<AdminUserRole> adminUserRoles);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    void deleteByUserId(Long userId);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    void deleteByUserIds(List<Long> userIds);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    void deleteByRoleIds(List<Long> roleIds);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    AdminUserRoleVO getUserRoleByUserId(Long userId);
}
