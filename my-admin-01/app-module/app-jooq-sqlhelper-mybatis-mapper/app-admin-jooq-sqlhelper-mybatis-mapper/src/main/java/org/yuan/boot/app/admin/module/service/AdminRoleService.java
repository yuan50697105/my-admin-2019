package org.yuan.boot.app.admin.module.service;

import org.yuan.boot.app.admin.module.pojo.AdminRoleFormVO;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.mapper.module.pojo.condition.AdminRoleQuery;
import org.yuan.boot.commons.pojo.Result;

import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 01:16
 */
public interface AdminRoleService {
    Result<?> add(AdminRoleFormVO adminRoleFormVO);

    Result<?> update(AdminRoleFormVO adminRoleFormVO);

    Result<?> updateRolePermission(AdminRoleFormVO adminRoleFormVO);

    Result<?> delete(List<Long> ids);

    Result<?> get(Long id);

    Result<?> data(AdminRoleQuery condition);

    Result<?> list(AdminRoleQuery condition);
}
