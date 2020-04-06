package org.yuan.boot.app.admin.module.service;

import org.yuan.boot.app.admin.module.pojo.AdminRoleFormVO;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.plus.module.pojo.condition.AdminRoleQuery;
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

    Result<?> updatePermission(AdminRoleFormVO adminRoleFormVO);

    Result<?> deleteByIds(List<Long> ids);

    Result<?> data(AdminRoleQuery condition);

    Result<?> list(AdminRoleQuery condition);

    Result<?> get(Long id);
}
