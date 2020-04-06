package org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.mapper.module.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.mapper.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.mapper.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.mapper.module.pojo.condition.AdminRoleQuery;

import java.util.List;

@Mapper
public interface AdminRoleMapper extends BaseMapper<AdminRole> {
    List<AdminRole> selectByCondition(AdminRoleQuery condition);
}