package org.yuan.boot.java.mvc.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.java.mvc.pojo.Result;

/**
 * @program: learning-demo-java-02
 * @description:
 * @author: yuane
 * @create: 2020-01-22 16:56
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ResultRuntimeException extends RuntimeException {
    private Result result;

    public ResultRuntimeException(Result result) {
        this.result = result;
    }

    public ResultRuntimeException(Throwable cause, Result result) {
        super(cause);
        this.result = result;
    }
}