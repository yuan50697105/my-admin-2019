package org.yuan.boot.java.mvc.controller;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.yuan.boot.java.mvc.exception.ResultRuntimeException;
import org.yuan.boot.java.mvc.pojo.Result;
import org.yuan.boot.java.mvc.utils.ResultUtils;

import java.util.List;
import java.util.StringJoiner;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-03 10:45
 */
public abstract class BaseController {
    protected void validate(BindingResult result) {
        if (result.hasErrors()) {
            List<FieldError> fieldErrors = result.getFieldErrors();
            StringJoiner joiner = new StringJoiner(",");
            for (FieldError fieldError : fieldErrors) {
                joiner.add(fieldError.getDefaultMessage());
            }
            throw new ResultRuntimeException(ResultUtils.validateError(joiner.toString()));
        }
    }

}