package org.yuan.boot.java.mvc.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.java.mvc.pojo.Result;
import org.yuan.boot.java.mvc.utils.ResultUtils;

/**
 * @program: learning-demo-java-02
 * @description:
 * @author: yuane
 * @create: 2020-01-22 17:23
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SystemErrorResultRuntimeException extends ResultRuntimeException {
    public SystemErrorResultRuntimeException() {
        super(ResultUtils.systemError());
    }

    public SystemErrorResultRuntimeException(Result result) {
        super(result);
    }

    public SystemErrorResultRuntimeException(Throwable cause, Result result) {
        super(cause, result);
    }
}