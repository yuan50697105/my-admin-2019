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
public class DataParamsErrorResultException extends ResultException {
    public DataParamsErrorResultException() {
        super(ResultUtils.dataParamsError());
    }

    public DataParamsErrorResultException(Result result) {
        super(result);
    }

    public DataParamsErrorResultException(Throwable cause, Result result) {
        super(cause, result);
    }
}