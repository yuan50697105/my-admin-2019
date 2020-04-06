package org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.mapper.module.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.mapper.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.mapper.module.pojo.AdminUserRole;

import java.util.List;

@Mapper
public interface AdminUserRoleMapper extends BaseMapper<AdminUserRole> {
    List<AdminUserRole> selectByUserId(Long userId);
}