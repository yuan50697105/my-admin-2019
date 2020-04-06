package org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.plus.module.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.plus.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.plus.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.jpa.jooq.sqlhelper.plus.module.pojo.condition.AdminRoleQuery;

import java.util.List;

@Mapper
public interface AdminRoleMapper extends BaseMapper<AdminRole> {
    int deleteByPrimaryKey(Long id);

    int insert(AdminRole record);

    int insertSelective(AdminRole record);

    AdminRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AdminRole record);

    int updateByPrimaryKey(AdminRole record);

    List<AdminRole> selectByCondition(AdminRoleQuery condition);
}