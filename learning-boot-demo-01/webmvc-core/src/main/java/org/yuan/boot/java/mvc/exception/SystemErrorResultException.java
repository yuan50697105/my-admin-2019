package org.yuan.boot.java.mvc.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.java.mvc.pojo.Result;
import org.yuan.boot.java.mvc.utils.ResultUtils;

/**
 * @program: learning-demo-java-01
 * @description:
 * @author: yuane
 * @create: 2020-02-03 16:35
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SystemErrorResultException extends ResultException {
    public SystemErrorResultException() {
        super(ResultUtils.systemError());
    }

    public SystemErrorResultException(Result result) {
        super(result);
    }
}