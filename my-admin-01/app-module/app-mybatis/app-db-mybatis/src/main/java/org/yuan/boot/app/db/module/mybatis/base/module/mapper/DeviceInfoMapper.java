package org.yuan.boot.app.db.module.mybatis.base.module.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yuan.boot.app.db.module.mybatis.base.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.base.module.pojo.DeviceInfo;import org.yuan.boot.app.db.module.mybatis.base.module.pojo.condition.DeviceInfoQuery;import java.util.List;

@Mapper
public interface DeviceInfoMapper extends BaseMapper<DeviceInfo> {
    int deleteByPrimaryKey(Long id);

    int insert(DeviceInfo record);

    int insertSelective(DeviceInfo record);

    DeviceInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DeviceInfo record);

    int updateByPrimaryKey(DeviceInfo record);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<DeviceInfo> selectByQueryCondition(DeviceInfoQuery condition);
}