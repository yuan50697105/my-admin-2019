package org.yuan.boot.webmvc.app.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.yuan.boot.webmvc.app.dao.BaseCustomerInfoDao;
import org.yuan.boot.webmvc.app.pojo.BaseCustomerInfo;
import org.yuan.boot.webmvc.app.pojo.condition.BaseCustomerInfoCondition;
import org.yuan.boot.webmvc.app.pojo.converter.BaseCustomerInfoConverter;
import org.yuan.boot.webmvc.app.pojo.vo.BaseCustomerInfoVo;
import org.yuan.boot.webmvc.app.service.BaseCustomerInfoService;
import org.yuan.boot.webmvc.pojo.ResponseResult;
import org.yuan.boot.webmvc.utils.ResponseResults;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-11 19:58
 */
@Service
@AllArgsConstructor
@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
public class BaseCustomerInfoServiceImpl implements BaseCustomerInfoService {
    private BaseCustomerInfoDao baseCustomerInfoDao;
    private BaseCustomerInfoConverter baseCustomerInfoConverter;

    @Override
    public ResponseResult selectPage(BaseCustomerInfoCondition condition) {
        return ResponseResults.data(baseCustomerInfoDao.selectPage(condition));
    }

    @Override
    public ResponseResult selectList(BaseCustomerInfoCondition condition) {
        return ResponseResults.data(baseCustomerInfoDao.selectList(condition));
    }

    @Override
    public ResponseResult selectOne(BaseCustomerInfo customerInfo) {
        return ResponseResults.data(baseCustomerInfoDao.selectOne(customerInfo));
    }

    @Override
    public ResponseResult selectById(Long id) {
        return ResponseResults.data(baseCustomerInfoDao.selectById(id));
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult save(BaseCustomerInfoVo baseCustomerInfoVo) {
        BaseCustomerInfo customerInfo = baseCustomerInfoConverter.convert(baseCustomerInfoVo);
        baseCustomerInfoDao.save(customerInfo);
        return ResponseResults.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult update(BaseCustomerInfoVo customerInfoVo) {
        BaseCustomerInfo customerInfo = baseCustomerInfoConverter.convert(customerInfoVo);
        baseCustomerInfoDao.update(customerInfo);
        return ResponseResults.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult delete(Long id) {
        baseCustomerInfoDao.delete(id);
        return ResponseResults.ok();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult delete(List<Long> ids) {
        baseCustomerInfoDao.delete(ids);
        return ResponseResults.ok();
    }
}