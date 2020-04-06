package org.yuan.boot.app.admin.module.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.app.admin.module.pojo.AdminPriceInfoFormVO;
import org.yuan.boot.app.admin.module.service.AdminPriceInfoService;
import org.yuan.boot.app.db.module.mybatis.base.module.dao.PriceInfoDao;
import org.yuan.boot.app.db.module.mybatis.base.module.pojo.PriceInfo;
import org.yuan.boot.commons.pojo.Result;
import org.yuan.boot.commons.web.mvc.exception.ResultRuntimeException;

/**
 * @program: my-admin-shower
 * @description:
 * @author: yuane
 * @create: 2020-02-26 21:06
 */
@Service
@AllArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class AdminPriceInfoServiceImpl implements AdminPriceInfoService {
    public static final String EXIST_PRICE_INFO_MESSAGE = "此定价信息已经存在";
    private PriceInfoDao priceInfoDao;

    @Override
    public Result<?> add(AdminPriceInfoFormVO formVO) {
        PriceInfo priceInfo = new PriceInfo();
        priceInfo.copyFrom(formVO, PriceInfo.class);
        boolean exist = priceInfoDao.existByCodeAndRangeCode(priceInfo);
        if (exist) {
            throw new ResultRuntimeException(Result.existError(EXIST_PRICE_INFO_MESSAGE));
        }
        priceInfoDao.insert(priceInfo);
        return Result.addSuccess();
    }
}