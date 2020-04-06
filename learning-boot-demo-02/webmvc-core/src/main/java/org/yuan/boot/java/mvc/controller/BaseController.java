package org.yuan.boot.java.mvc.controller;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yuan.boot.java.mvc.exception.DataParamsErrorResultRuntimeException;

import java.util.StringJoiner;

/**
 * @program: learning-demo-java-02
 * @description:
 * @author: yuane
 * @create: 2020-01-22 16:52
 */
@RestController
@RequestMapping
@AllArgsConstructor
@Log4j2
public abstract class BaseController {
    public static final String APPLICATION_JSON_UTF8 = "application/json;charset=UTF-8";

    public void validate(BindingResult result) {
        if (result.hasErrors()) {
            StringJoiner joiner = new StringJoiner(",");
            throw new DataParamsErrorResultRuntimeException();
        }
    }
}