package org.yuan.boot.java.mvc.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.java.mvc.pojo.Result;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-03 16:30
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ResultException extends Exception {
    private Result result;

    public ResultException(Result result) {
        this.result = result;
    }


}