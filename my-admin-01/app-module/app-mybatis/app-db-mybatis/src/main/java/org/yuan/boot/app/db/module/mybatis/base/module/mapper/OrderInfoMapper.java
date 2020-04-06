package org.yuan.boot.app.db.module.mybatis.base.module.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.yuan.boot.app.db.module.mybatis.base.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.base.module.pojo.OrderInfo;import org.yuan.boot.app.db.module.mybatis.base.module.pojo.condition.OrderInfoQuery;import java.util.List;

@Mapper
public interface OrderInfoMapper extends BaseMapper<OrderInfo> {
    int deleteByPrimaryKey(Long id);

    int insert(OrderInfo record);

    int insertSelective(OrderInfo record);

    OrderInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    List<OrderInfo> selectList(OrderInfoQuery query);
}