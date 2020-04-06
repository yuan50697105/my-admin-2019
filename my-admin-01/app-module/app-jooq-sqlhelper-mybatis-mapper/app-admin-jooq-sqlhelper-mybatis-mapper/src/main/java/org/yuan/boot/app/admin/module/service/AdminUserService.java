package org.yuan.boot.app.admin.module.service;

import org.yuan.boot.app.admin.module.pojo.AdminUserFormVO;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.mapper.module.pojo.condition.AdminUserQuery;
import org.yuan.boot.commons.pojo.Result;

import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 01:16
 */
public interface AdminUserService {
    Result<?> add(AdminUserFormVO adminUserFormVO);

    Result<?> update(AdminUserFormVO adminUserFormVO);

    Result<?> updateUserRole(AdminUserFormVO adminUserFormVO);

    Result<?> delete(List<Long> ids);

    Result<?> data(AdminUserQuery condition);

    Result<?> list(AdminUserQuery condition);

    Result<?> get(Long id);
}
