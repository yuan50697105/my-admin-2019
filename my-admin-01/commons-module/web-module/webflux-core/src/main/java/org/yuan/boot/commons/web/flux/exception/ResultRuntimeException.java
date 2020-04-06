package org.yuan.boot.commons.web.flux.exception;


import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.commons.pojo.Result;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuanez
 * @create: 2020-02-19 08:50
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class ResultRuntimeException extends RuntimeException {
    private Result<?> result;

    public ResultRuntimeException(Result<?> result) {
        this.result = result;
    }
}
