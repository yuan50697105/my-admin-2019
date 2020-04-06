package org.yuan.boot.commons.web.mvc.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.commons.pojo.Result;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuanez
 * @create: 2020-02-19 08:48
 **/
@EqualsAndHashCode(callSuper = true)
@Data
public class ResultException extends Exception {
    private Result<?> result;

    public ResultException(Result<?> result) {
        this.result = result;
    }


}
