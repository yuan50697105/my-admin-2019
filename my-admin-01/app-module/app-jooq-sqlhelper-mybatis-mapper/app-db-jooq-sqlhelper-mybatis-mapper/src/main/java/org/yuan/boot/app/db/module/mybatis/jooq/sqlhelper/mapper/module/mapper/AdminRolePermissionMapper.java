package org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.mapper.module.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.mapper.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.mapper.module.pojo.AdminRolePermission;

import java.util.List;

@Mapper
public interface AdminRolePermissionMapper extends BaseMapper<AdminRolePermission> {
    List<AdminRolePermission> selectByRoleId(Long roleId);
}