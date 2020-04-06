package org.yuan.boot.java.mvc.utils;

import org.yuan.boot.java.mvc.pojo.Result;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-03 10:47
 */
public class ResultUtils {

    public static Result result(Integer code, String message, Object data) {
        return Result.builder().code(code).message(message).data(data).build();
    }

    public static Result ok(String messge, Object data) {
        return result(ResultConstants.OK_CODE, messge, data);
    }

    public static Result ok(String message) {
        return ok(message, null);
    }

    public static Result ok() {
        return ok(ResultConstants.OK_MESSAGE, null);
    }

    public static Result okData(Object data) {
        return ok(ResultConstants.OK_MESSAGE, data);
    }

    public static Result error(Integer code, String message, Object data) {
        return result(code, message, data);
    }

    public static Result error(Integer code, String message) {
        return error(code, message, null);
    }

    public static Result systemError(String message, Object data) {
        return error(ResultConstants.SYSTEM_ERROR, message, data);
    }

    public static Result systemError(String message) {
        return systemError(message, null);
    }

    public static Result systemError() {
        return systemError(ResultConstants.SYSTEM_ERROR_MESSAGE);
    }

    public static Result validateError(String message) {
        return result(ResultConstants.VALIDATE_ERROR, message, null);
    }

    public static Result dataParamsError(String message) {
        return error(ResultConstants.DATA_PARAMS_ERROR_CODE, message);
    }

    public static Result dataParamsError() {
        return error(ResultConstants.DATA_PARAMS_ERROR_CODE, ResultConstants.DATA_PARAMS_ERROR_MESSAGE);
    }

    public static Result otherError(String mesage, Object data) {
        return error(ResultConstants.OTHER_ERROR_CODE, mesage, data);
    }

    public static Result otherError(String message) {
        return error(ResultConstants.OTHER_ERROR_CODE, message);
    }

    protected static class ResultConstants {
        public final static Integer OK_CODE = 0;
        public final static String OK_MESSAGE = "操作成功";
        public final static Integer SYSTEM_ERROR = 1;
        public final static String SYSTEM_ERROR_MESSAGE = "系统错误";
        public final static Integer VALIDATE_ERROR = 2;

        public static final Integer DATA_PARAMS_ERROR_CODE = 3;
        public static final String DATA_PARAMS_ERROR_MESSAGE = "参数错误";
        public static final Integer OTHER_ERROR_CODE = 4;

    }
}