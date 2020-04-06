package org.yuan.boot.java.mvc.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.java.mvc.pojo.Result;

/**
 * @program: learning-demo-java-02
 * @description:
 * @author: yuane
 * @create: 2020-01-22 16:55
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ResultException extends Exception {
    private Result result;

    public ResultException(Result result) {
        this.result = result;
    }

    public ResultException(Throwable cause, Result result) {
        super(cause);
        this.result = result;
    }


}