package org.yuan.boot.webmvc.app.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.yuan.boot.webmvc.app.utils.ResultConstants;
import org.yuan.boot.webmvc.exception.ResultException;
import org.yuan.boot.webmvc.pojo.ResponseResult;
import org.yuan.boot.webmvc.utils.ResponseResults;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2020-01-13 00:09
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ExistResultException extends ResultException {
    public ExistResultException(ResponseResult responseResult) {
        super(responseResult);
    }

    public ExistResultException(String message) {
        super(ResponseResults.error(ResultConstants.EXIST_ENTITY_ERROR, message));
    }
}