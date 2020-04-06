package org.yuan.boot.java.mvc.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.java.mvc.pojo.Result;
import org.yuan.boot.java.mvc.utils.ResultUtils;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-03 16:40
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
}