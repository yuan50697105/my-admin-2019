package org.yuan.boot.webmvc.app.service;

import org.yuan.boot.webmvc.app.pojo.vo.WxUserOrderVo;
import org.yuan.boot.webmvc.pojo.ResponseResult;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-14 22:00
 */
public interface WxUserService {
    ResponseResult getInfoByOpenId(String openId);

    ResponseResult getOrderInfoByOpenId(String openId);

    ResponseResult addOrder(WxUserOrderVo wxUserOrderVo);

    ResponseResult payOrder(WxUserOrderVo orderVo);

    ResponseResult payNotify(WxUserOrderVo orderVo);
}
