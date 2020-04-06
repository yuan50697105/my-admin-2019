package org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.plus.module.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.plus.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.plus.module.pojo.AdminUserRole;

@Mapper
public interface AdminUserRoleMapper extends BaseMapper<AdminUserRole> {
    int deleteByPrimaryKey(Long id);

    int insert(AdminUserRole record);

    int insertSelective(AdminUserRole record);

    AdminUserRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AdminUserRole record);

    int updateByPrimaryKey(AdminUserRole record);
}