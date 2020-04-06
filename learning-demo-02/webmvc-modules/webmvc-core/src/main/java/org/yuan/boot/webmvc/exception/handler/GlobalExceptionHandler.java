package org.yuan.boot.webmvc.exception.handler;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.yuan.boot.webmvc.exception.ResultException;
import org.yuan.boot.webmvc.exception.ResultRuntimeException;
import org.yuan.boot.webmvc.pojo.ResponseResult;
import org.yuan.boot.webmvc.utils.ResponseResults;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuanez
 * @create: 2020-01-13 13:52
 **/
@RestControllerAdvice
@ControllerAdvice
@Log4j2
public class GlobalExceptionHandler {
    @ExceptionHandler(ResultException.class)
    public ResponseResult resultExceptionHandler(ResultException e) {
        return e.getResponseResult();
    }

    @ExceptionHandler(ResultRuntimeException.class)
    public ResponseResult resultRuntimeExceptionHandler(ResultRuntimeException e) {
        return e.getResponseResult();
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseResult illegalArgumentExceptionHandler(IllegalArgumentException e) {
        log.error(e.getMessage(), e.getCause());
        return ResponseResults.dataParamsError();
    }

    @ExceptionHandler(Exception.class)
    public ResponseResult exceptionHandler(Exception e) {
        log.error(e.getLocalizedMessage(), e.getCause());
        return ResponseResults.systemError();
    }
}
