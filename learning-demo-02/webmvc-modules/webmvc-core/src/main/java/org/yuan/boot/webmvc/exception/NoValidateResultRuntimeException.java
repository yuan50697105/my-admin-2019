package org.yuan.boot.webmvc.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.webmvc.pojo.ResponseResult;
import org.yuan.boot.webmvc.utils.ResponseResults;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 16:53
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class NoValidateResultRuntimeException extends ResultRuntimeException {
    public NoValidateResultRuntimeException() {
        super(ResponseResults.dataParamsError());
    }

    public NoValidateResultRuntimeException(ResponseResult responseResult) {
        super(responseResult);
    }

    public NoValidateResultRuntimeException(String message) {
        super(ResponseResults.dataParamsError(message));
    }
}