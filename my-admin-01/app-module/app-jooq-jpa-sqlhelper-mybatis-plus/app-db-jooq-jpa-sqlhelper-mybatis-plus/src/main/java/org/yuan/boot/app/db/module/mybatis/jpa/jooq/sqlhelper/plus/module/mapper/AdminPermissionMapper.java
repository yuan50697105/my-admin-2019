package org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.plus.module.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.plus.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.plus.module.pojo.AdminPermission;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.plus.module.pojo.condition.AdminPermissionQuery;

import java.util.List;

@Mapper
public interface AdminPermissionMapper extends BaseMapper<AdminPermission> {
    int deleteByPrimaryKey(Long id);

    int insert(AdminPermission record);

    int insertSelective(AdminPermission record);

    AdminPermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AdminPermission record);

    int updateByPrimaryKey(AdminPermission record);

    List<AdminPermission> selectByCondition(AdminPermissionQuery condition);
}