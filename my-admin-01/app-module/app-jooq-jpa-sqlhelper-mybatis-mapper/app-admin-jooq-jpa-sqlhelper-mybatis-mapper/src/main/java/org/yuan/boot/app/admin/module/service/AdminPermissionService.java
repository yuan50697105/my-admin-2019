package org.yuan.boot.app.admin.module.service;

import org.yuan.boot.app.admin.module.pojo.AdminPermissionFormVO;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.mapper.module.pojo.condition.AdminPermissionQuery;
import org.yuan.boot.commons.pojo.Result;

import java.util.List;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 01:17
 */
public interface AdminPermissionService {
    Result<?> add(AdminPermissionFormVO adminPermissionFormVO);

    Result<?> update(AdminPermissionFormVO adminPermissionFormVO);

    Result<?> delete(List<Long> ids);

    Result<?> get(Long id);

    Result<?> data(AdminPermissionQuery condition);

    Result<?> list(AdminPermissionQuery condition);
}
