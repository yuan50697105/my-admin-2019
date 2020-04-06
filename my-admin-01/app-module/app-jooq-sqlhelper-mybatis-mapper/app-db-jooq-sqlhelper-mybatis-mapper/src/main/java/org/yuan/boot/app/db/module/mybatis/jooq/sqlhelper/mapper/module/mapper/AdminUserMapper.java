package org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.mapper.module.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.mapper.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.mapper.module.pojo.AdminUser;
import org.yuan.boot.app.db.module.mybatis.jooq.sqlhelper.mapper.module.pojo.condition.AdminUserQuery;

import java.util.List;

@Mapper
public interface AdminUserMapper extends BaseMapper<AdminUser> {
    List<AdminUser> selectByCondition(AdminUserQuery condition);
}