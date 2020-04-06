package org.yuan.boot.app.db.module.mybatis.base.module.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;import org.yuan.boot.app.db.module.mybatis.base.commons.mapper.BaseMapper;
import org.yuan.boot.app.db.module.mybatis.base.module.pojo.PriceInfo;

@Mapper
public interface PriceInfoMapper extends BaseMapper<PriceInfo> {
    int deleteByPrimaryKey(Long id);

    int insert(PriceInfo record);

    int insertSelective(PriceInfo record);

    PriceInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PriceInfo record);

    int updateByPrimaryKey(PriceInfo record);

    @SuppressWarnings("AlibabaAbstractMethodOrInterfaceMethodMustUseJavadoc")
    Long countByCodeAndRangeCode(@Param("code") String code, @Param("rangeCode") String rangeCode);
}