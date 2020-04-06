package org.yuan.boot.commons.web.flux.exception.handler;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.yuan.boot.commons.pojo.Result;
import org.yuan.boot.commons.web.flux.exception.ResultException;
import org.yuan.boot.commons.web.flux.exception.ResultRuntimeException;
import reactor.core.publisher.Mono;

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
    public Mono<Result<?>> handler(Exception e) {
        Result<?> result = Result.error(e.getMessage());
        return Mono.justOrEmpty(result);
    }

    @ExceptionHandler(ResultRuntimeException.class)
    public Mono<Result<?>> resultRuntimeExceptionHandler(ResultRuntimeException e) {
        return Mono.justOrEmpty(e.getResult());
    }

    @ExceptionHandler(ResultException.class)
    public Mono<Result<?>> resultExceptionHandler(ResultException e) {
        return Mono.justOrEmpty(e.getResult());
    }
}
