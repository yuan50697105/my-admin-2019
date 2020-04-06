package org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.pojo.AdminRole;
import org.yuan.boot.app.db.module.mybatis.jpa.sqlhelper.mapper.module.pojo.condition.AdminRoleQuery;

import java.util.List;

@SuppressWarnings("AlibabaClassMustHaveAuthor")
@Mapper
public interface AdminRoleMapper extends BaseMapper<AdminRole> {
    int deleteByPrimaryKey(Long id);

    AdminRole selectByPrimaryKey(Long id);

    List<AdminRole> selectByCondition(AdminRoleQuery condition);
}