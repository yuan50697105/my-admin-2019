package org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.plus.module.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.plus.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.plus.module.pojo.AdminRolePermission;

@Mapper
public interface AdminRolePermissionMapper extends BaseMapper<AdminRolePermission> {
    int deleteByPrimaryKey(Long id);

    int insert(AdminRolePermission record);

    int insertSelective(AdminRolePermission record);

    AdminRolePermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AdminRolePermission record);

    int updateByPrimaryKey(AdminRolePermission record);
}