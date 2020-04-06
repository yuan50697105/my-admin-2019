package org.yuan.boot.webmvc.app.service;

import org.yuan.boot.webmvc.app.pojo.vo.OrderInfoVo;
import org.yuan.boot.webmvc.pojo.ResponseResult;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-14 21:53
 */
public interface OrderInfoService {
    ResponseResult add(OrderInfoVo orderInfoVo);

    ResponseResult prepay(OrderInfoVo orderInfoVo);

}
