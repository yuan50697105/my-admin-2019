package org.yuan.boot.commons.web.flux.controller;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.yuan.boot.commons.pojo.Result;
import org.yuan.boot.commons.web.flux.exception.ResultRuntimeException;

import java.util.List;
import java.util.StringJoiner;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuanez
 * @create: 2020-02-19 08:56
 **/
public class BaseController {
    protected void validate(BindingResult result) {
        if (result.hasErrors()) {
            List<ObjectError> errors = result.getAllErrors();
            StringJoiner joiner = new StringJoiner(",");
            for (ObjectError error : errors) {
                joiner.add(error.getDefaultMessage());
            }
            throw new ResultRuntimeException(Result.validateError(joiner.toString()));
        }
    }
}
