package org.yuan.boot.webmvc.utils;

import cn.hutool.core.util.ObjectUtil;
import org.yuan.boot.webmvc.pojo.ResponseResult;

import static org.yuan.boot.webmvc.utils.ResponseResults.ResultConstants.*;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-01-19 20:43
 */
public class ResponseResults {
    public static ResponseResult ok() {
        return ResponseResult.builder().code(OK_CODE).message(OK_MESSAGE).build();
    }

    public static ResponseResult ok(String message) {
        return ResponseResult.builder().code(OK_CODE).message(message).build();
    }

    public static ResponseResult ok(String message, Object data) {
        return ResponseResult.builder().code(OK_CODE).message(message).data(data).build();
    }

    public static ResponseResult data(Object data) {
        return ResponseResult.builder().code(OK_CODE).message(OK_MESSAGE).data(data).build();
    }

    public static ResponseResult error(Integer code, String message) {
        return ResponseResult.builder().code(code).message(message).build();
    }

    public static ResponseResult error(Integer code, String message, Object data) {
        return ResponseResult.builder().code(code).message(message).data(data).build();
    }

    public static ResponseResult systemError() {
        return ResponseResult.builder().code(ResultConstants.SYSTEM_ERROR_CODE).message(SYSTEM_ERROR_MESSAGE).build();
    }

    public static ResponseResult dataParamsError() {
        return ResponseResult.builder().code(DATA_PARAMS_ERROR_CODE).message(DATA_PARAMS_ERROR_MESSAGE).build();
    }

    public static ResponseResult dataParamsError(Object data) {
        return ResponseResult.builder().code(DATA_PARAMS_ERROR_CODE).message(DATA_PARAMS_ERROR_MESSAGE).data(data).build();
    }

    public static ResponseResult dataParamsError(String message) {
        if (ObjectUtil.isNotEmpty(message)) {
            return ResponseResult.builder().code(DATA_PARAMS_ERROR_CODE).message(message).build();
        } else {
            return dataParamsError();
        }
    }

    public static ResponseResult dataParamsError(String message, Object data) {
        return ResponseResult.builder().code(DATA_PARAMS_ERROR_CODE).message(message).data(data).build();
    }

    public static ResponseResult dataResultError() {
        return ResponseResult.builder().code(DATA_RESULT_ERROR_CODE).message(DATA_RESULT_ERROR_MESSAGE).build();
    }

    public static ResponseResult dataResultError(Object data) {
        return ResponseResult.builder().code(DATA_RESULT_ERROR_CODE).message(DATA_RESULT_ERROR_MESSAGE).data(data).build();
    }

    public static ResponseResult dataResultError(String message) {
        if (!ObjectUtil.isNotEmpty(message)) {
            return dataResultError();
        } else {
            return ResponseResult.builder().code(DATA_RESULT_ERROR_CODE).message(DATA_RESULT_ERROR_MESSAGE).build();
        }
    }

    public static ResponseResult dataResultError(String message, Object data) {
        return ResponseResult.builder().code(DATA_RESULT_ERROR_CODE).message(message).data(data).build();
    }

    public static ResponseResult operateError() {
        return ResponseResult.builder().code(OPERATE_ERROR_CODE).message(OPERATE_ERROR_MESSAGE).build();
    }

    public static ResponseResult operateError(String message) {
        return ResponseResult.builder().code(OPERATE_ERROR_CODE).message(ObjectUtil.isNotEmpty(message) ? message : OPERATE_ERROR_MESSAGE).build();
    }

    public static class ResultConstants {
        public final static Integer OK_CODE = 200;
        public static final String OK_MESSAGE = "操作成功";
        public final static Integer SYSTEM_ERROR_CODE = 1000;
        public final static String SYSTEM_ERROR_MESSAGE = "系统错误";
        public final static Integer DATA_PARAMS_ERROR_CODE = 2000;
        public final static String DATA_PARAMS_ERROR_MESSAGE = "参数错误";
        public final static Integer DATA_RESULT_ERROR_CODE = 3000;
        public final static String DATA_RESULT_ERROR_MESSAGE = "结果错误";
        public final static Integer OPERATE_ERROR_CODE = 4000;
        public final static String OPERATE_ERROR_MESSAGE = "操作失败";
    }
}