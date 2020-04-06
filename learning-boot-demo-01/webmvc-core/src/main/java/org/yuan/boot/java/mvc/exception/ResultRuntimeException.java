package org.yuan.boot.java.mvc.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.java.mvc.pojo.Result;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-03 16:31
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ResultRuntimeException extends RuntimeException {
    private Result result;

    public ResultRuntimeException(Result result) {
        this.result = result;
    }
}