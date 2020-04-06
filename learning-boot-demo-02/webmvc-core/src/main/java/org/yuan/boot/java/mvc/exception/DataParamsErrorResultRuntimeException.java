package org.yuan.boot.java.mvc.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.java.mvc.pojo.Result;
import org.yuan.boot.java.mvc.utils.ResultUtils;

/**
 * @program: learning-demo-java-02
 * @description:
 * @author: yuane
 * @create: 2020-01-22 17:20
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DataParamsErrorResultRuntimeException extends ResultRuntimeException {
    public DataParamsErrorResultRuntimeException() {
        super(ResultUtils.dataParamsError());
    }

    public DataParamsErrorResultRuntimeException(Result result) {
        super(result);
    }

    public DataParamsErrorResultRuntimeException(Throwable cause, Result result) {
        super(cause, result);
    }
}