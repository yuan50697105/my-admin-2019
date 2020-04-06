package org.yuan.boot.webmvc.app.service;

import org.yuan.boot.webmvc.app.pojo.BaseCustomerInfo;
import org.yuan.boot.webmvc.app.pojo.condition.BaseCustomerInfoCondition;
import org.yuan.boot.webmvc.app.pojo.vo.BaseCustomerInfoVo;
import org.yuan.boot.webmvc.pojo.ResponseResult;

import java.util.List;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-11 19:58
 */
public interface BaseCustomerInfoService {
    ResponseResult selectPage(BaseCustomerInfoCondition condition);

    ResponseResult selectList(BaseCustomerInfoCondition condition);

    ResponseResult selectOne(BaseCustomerInfo customerInfo);

    ResponseResult selectById(Long id);

    ResponseResult save(BaseCustomerInfoVo baseCustomerInfoVo);

    ResponseResult update(BaseCustomerInfoVo customerInfoVo);

    ResponseResult delete(Long id);

    ResponseResult delete(List<Long> ids);
}
