package org.yuan.boot.webmvc.app.utils;

import org.yuan.boot.webmvc.pojo.ResponseResult;
import org.yuan.boot.webmvc.utils.ResponseResults;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-13 00:06
 */
public class ResultUtils {
    public static ResponseResult existError(String message) {
        return ResponseResults.error(ResultConstants.EXIST_ENTITY_ERROR, message);
    }
}