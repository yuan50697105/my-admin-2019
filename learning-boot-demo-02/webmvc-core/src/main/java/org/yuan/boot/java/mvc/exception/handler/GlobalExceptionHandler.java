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
 * @program: learning-demo-java-02
 * @description:
 * @author: yuane
 * @create: 2020-01-22 17:17
 */
@RestControllerAdvice
@ControllerAdvice
@Log4j2
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public Result exception(Exception e) {
        log.error(e.getLocalizedMessage(), e);
        return ResultUtils.systemError();
    }

    @ExceptionHandler(ResultException.class)
    public Result result(ResultException e) {
        log.error(e.getMessage(), e);
        return e.getResult();
    }

    @ExceptionHandler(ResultRuntimeException.class)
    public Result resultRuntime(ResultRuntimeException e) {
        log.error(e.getMessage(), e);
        return e.getResult();
    }


}