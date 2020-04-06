package org.yuan.boot.webmvc.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.webmvc.pojo.ResponseResult;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 16:52
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ResultException extends Exception {
    private ResponseResult responseResult;

    public ResultException() {
    }

    public ResultException(ResponseResult responseResult) {
        this.responseResult = responseResult;
    }
}