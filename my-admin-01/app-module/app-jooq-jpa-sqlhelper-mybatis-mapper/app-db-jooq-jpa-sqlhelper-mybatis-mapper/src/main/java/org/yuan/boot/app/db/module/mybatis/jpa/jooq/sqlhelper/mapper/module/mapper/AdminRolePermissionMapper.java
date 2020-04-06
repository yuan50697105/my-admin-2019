package org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.mapper.module.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.mapper.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.mapper.module.pojo.AdminRolePermission;

@Mapper
public interface AdminRolePermissionMapper extends BaseMapper<AdminRolePermission> {
    int deleteByPrimaryKey(Long id);

    int insert(AdminRolePermission record);

    int insertSelective(AdminRolePermission record);

    AdminRolePermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AdminRolePermission record);

    int updateByPrimaryKey(AdminRolePermission record);
}