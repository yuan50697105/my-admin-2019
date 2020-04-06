package org.yuan.boot.commons.web.mvc.exception.handler;

import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.yuan.boot.commons.pojo.Result;
import org.yuan.boot.commons.web.mvc.exception.ResultException;
import org.yuan.boot.commons.web.mvc.exception.ResultRuntimeException;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuanez
 * @create: 2020-02-19 08:51
 **/
@RestControllerAdvice
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public Result<?> handler(Exception e) {
        return Result.error(e.getMessage());
    }

    @ExceptionHandler(ResultRuntimeException.class)
    public Result<?> resultRuntimeExceptionHandler(ResultRuntimeException e) {
        return e.getResult();
    }

    @ExceptionHandler(ResultException.class)
    public Result<?> resultExceptionHandler(ResultException e) {
        return e.getResult();
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public Result<?> httpMessageNotReadableExceptionHandler(HttpMessageNotReadableException e) {
        return Result.dataParamsError();
    }
}
