package org.yuan.boot.webmvc.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.webmvc.pojo.ResponseResult;
import org.yuan.boot.webmvc.utils.ResponseResults;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 16:52
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class NoValidateResultException extends ResultException {
    public NoValidateResultException() {
        super(ResponseResults.dataParamsError());
    }

    public NoValidateResultException(ResponseResult responseResult) {
        super(responseResult);
    }

    public NoValidateResultException(String message) {
        super(ResponseResults.dataParamsError(message));
    }
}