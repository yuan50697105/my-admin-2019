package org.yuan.boot.app.admin.module.converter;

import org.mapstruct.Mapper;
import org.yuan.boot.app.admin.module.pojo.AdminPermissionFormVO;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.base.module.pojo.AdminPermission;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-20 01:14
 */
@Mapper(componentModel = "spring")
public interface AdminPermissionConverter {
    AdminPermission addPermission(AdminPermissionFormVO adminPermissionFormVO);

}
