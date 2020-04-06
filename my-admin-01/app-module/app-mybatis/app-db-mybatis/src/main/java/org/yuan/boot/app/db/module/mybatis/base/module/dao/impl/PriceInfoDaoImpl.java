package org.yuan.boot.app.db.module.mybatis.base.module.dao.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.app.db.module.mybatis.base.commons.dao.impl.BaseDaoImpl;
import org.yuan.boot.app.db.module.mybatis.base.module.dao.PriceInfoDao;
import org.yuan.boot.app.db.module.mybatis.base.module.mapper.PriceInfoMapper;
import org.yuan.boot.app.db.module.mybatis.base.module.pojo.PriceInfo;

/**
 * @program: my-admin-shower
 * @description:
 * @author: yuane
 * @create: 2020-02-25 20:06
 */
@Component
@AllArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class PriceInfoDaoImpl extends BaseDaoImpl<PriceInfo, PriceInfoMapper> implements PriceInfoDao {
    @Override
    public boolean existByCodeAndRangeCode(PriceInfo priceInfo) {
        return baseMapper.countByCodeAndRangeCode(priceInfo.getCode(), priceInfo.getRangeCode()) > 0;
    }

    @Override
    public void insert(PriceInfo priceInfo) {
        baseMapper.insert(priceInfo);
    }
}