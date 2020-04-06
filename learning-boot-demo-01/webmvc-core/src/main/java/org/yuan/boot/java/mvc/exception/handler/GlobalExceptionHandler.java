package org.yuan.boot.java.mvc.exception.handler;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.yuan.boot.java.mvc.exception.ResultException;
import org.yuan.boot.java.mvc.exception.ResultRuntimeException;
import org.yuan.boot.java.mvc.pojo.Result;
import org.yuan.boot.java.mvc.utils.ResultUtils;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-03 16:40
 */
@RestControllerAdvice
@ControllerAdvice
@Log4j2
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public Result handler(Exception e) {
        log.error(e.getLocalizedMessage(), e.getCause());
        return ResultUtils.systemError(e.getMessage());
    }


    @ExceptionHandler(ResultRuntimeException.class)
    public Result handler(ResultRuntimeException e) {
        log.error(e.getResult());
        return e.getResult();
    }

    @ExceptionHandler(ResultException.class)
    public Result handler(ResultException e) {
        log.error(e.getResult());
        return e.getResult();
    }
}
