package org.yuan.boot.app.db.module.mybatis.jpa.mapper.module.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.yuan.boot.app.db.module.mybatis.jpa.mapper.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.jpa.mapper.module.pojo.AdminUser;
import org.yuan.boot.app.db.module.mybatis.jpa.mapper.module.pojo.condition.AdminUserQuery;

import java.util.Collection;
import java.util.List;

@SuppressWarnings("AlibabaClassMustHaveAuthor")
@Mapper
public interface AdminUserMapper extends BaseMapper<AdminUser> {
    int deleteByPrimaryKey(Long id);

    AdminUser selectByPrimaryKey(Long id);

    int updateEnabledByIdIn(@Param("updatedEnabled") Integer updatedEnabled, @Param("idCollection") Collection<Long> idCollection);

    List<AdminUser> selectByCondition(AdminUserQuery condition);
}