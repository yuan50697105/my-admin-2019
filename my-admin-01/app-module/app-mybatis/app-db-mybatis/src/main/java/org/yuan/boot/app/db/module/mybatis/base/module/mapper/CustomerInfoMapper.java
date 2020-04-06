package org.yuan.boot.app.db.module.mybatis.base.module.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yuan.boot.app.db.module.mybatis.base.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.base.module.pojo.CustomerInfo;import org.yuan.boot.app.db.module.mybatis.base.module.pojo.condition.CustomerInfoQuery;import java.util.List;

@Mapper
public interface CustomerInfoMapper extends BaseMapper<CustomerInfo> {
    int deleteByPrimaryKey(Long id);

    int insert(CustomerInfo record);

    int insertSelective(CustomerInfo record);

    CustomerInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CustomerInfo record);

    int updateByPrimaryKey(CustomerInfo record);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<CustomerInfo> selectByQueryCondition(CustomerInfoQuery condition);
}