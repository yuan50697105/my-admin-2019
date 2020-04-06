package org.yuan.boot.app.wx.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.app.db.module.mybatis.base.module.dao.CustomerInfoDao;
import org.yuan.boot.app.db.module.mybatis.base.module.pojo.CustomerInfo;
import org.yuan.boot.app.db.module.mybatis.base.module.pojo.condition.CustomerInfoQuery;
import org.yuan.boot.app.wx.pojo.WxCustomerFormVO;
import org.yuan.boot.app.wx.service.WxCustomerService;
import org.yuan.boot.app.wx.utils.WxCustomerUtils;
import org.yuan.boot.commons.base.module.mybaits.base.pojo.PageResult;
import org.yuan.boot.commons.pojo.ConditionPageResult;
import org.yuan.boot.commons.pojo.Result;

/**
 * @program: my-admin-01-wx
 * @description:
 * @author: yuane
 * @create: 2020-02-24 20:05
 */
@Service
@AllArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class WxCustomerServiceImpl implements WxCustomerService {
    private CustomerInfoDao customerInfoDao;

    @Override
    public Result<?> add(WxCustomerFormVO wxCustomerFormVO) {
        CustomerInfo customerInfo = WxCustomerUtils.createNew(wxCustomerFormVO);
        customerInfoDao.insert(customerInfo);
        return Result.addSuccess(customerInfo);
    }

    @Override
    public Result<?> update(WxCustomerFormVO wxCustomerFormVO) {
        CustomerInfo customerInfo = customerInfoDao.getById(wxCustomerFormVO.getId());
        WxCustomerUtils.modifyFromVo(customerInfo,wxCustomerFormVO);
        customerInfoDao.update(customerInfo);
        return Result.updateSuccess();
    }

    @Override
    public Result<?> data(CustomerInfoQuery condition) {
        PageResult<CustomerInfo> pageResult = customerInfoDao.selectPage(condition);
        ConditionPageResult<CustomerInfo, CustomerInfoQuery> conditionPageResult = new ConditionPageResult<>(pageResult, condition);
        return Result.data(conditionPageResult);
    }

}