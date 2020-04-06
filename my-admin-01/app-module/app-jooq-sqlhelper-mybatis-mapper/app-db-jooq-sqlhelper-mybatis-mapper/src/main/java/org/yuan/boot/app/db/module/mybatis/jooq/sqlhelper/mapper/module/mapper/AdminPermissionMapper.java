package org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.mapper.module.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.mapper.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.mapper.module.pojo.AdminPermission;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.mapper.module.pojo.condition.AdminPermissionQuery;

import java.util.List;

@Mapper
public interface AdminPermissionMapper extends BaseMapper<AdminPermission> {
    List<AdminPermission> selectByCondition(AdminPermissionQuery condition);
}