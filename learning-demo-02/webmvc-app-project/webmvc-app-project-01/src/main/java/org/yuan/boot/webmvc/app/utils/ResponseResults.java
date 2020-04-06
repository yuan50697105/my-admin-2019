package org.yuan.boot.webmvc.app.utils;

import org.yuan.boot.webmvc.pojo.ResponseResult;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-13 00:06
 */
public class ResponseResults extends org.yuan.boot.webmvc.utils.ResponseResults {

    public static ResponseResult existError(String message) {
        return org.yuan.boot.webmvc.utils.ResponseResults.error(ResultConstants.EXIST_ENTITY_ERROR, message);
    }

    public static class ResultConstants extends org.yuan.boot.webmvc.utils.ResponseResults.ResultConstants {
        public final static Integer EXIST_ENTITY_ERROR = 2001;
        /**
         * 用户操作错误编码
         */
        public final static Integer USER_ERROR = 3000;
        public final static Integer CHANGE_PASSWORD_USER_NOT_HAD = 3001;
        public final static Integer CHANGE_PASSWORD_USER_OLD_PWD_ERROR = 3002;
    }
}