package org.yuan.boot.commons.pojo;

import lombok.*;
import lombok.experimental.Accessors;
import org.yuan.boot.commons.constants.ResultConstants;

/**
 * @program: my-admin-01
 * @description: 通用结果Result
 * @author: yuane
 * @create: 2020-02-19 00:24
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@With
@Accessors(chain = true)
public final class Result<T> extends BaseCoreEntity {
    @NonNull
    private Integer code;
    @NonNull
    private String message;
    private T data;

    public static <T> Result<T> result(Integer code, String messsage, T data) {
        return new Result<>(code, messsage, data);
    }

    public static <T> Result<T> result(Integer code, String message) {
        return new Result<>(code, message);
    }

    public static <T> Result<T> ok() {
        return ok(ResultConstants.OK_MESSAGE);
    }

    public static <T> Result<T> ok(String message) {
        return result(ResultConstants.OK_CODE, message);
    }

    public static <T> Result<T> ok(String message, T data) {
        return result(ResultConstants.OK_CODE, message, data);
    }

    public static <T> Result<T> ok(T data) {
        return ok(ResultConstants.OK_MESSAGE, data);
    }

    public static <T> Result<T> data(T data) {
        return ok(ResultConstants.SELECT_SUCCESS_MSG, data);
    }

    public static <T> Result<BasePageResult<T>> data(BasePageResult<T> result) {
        return ok(ResultConstants.SELECT_SUCCESS_MSG, result);
    }

    public static <T, E> Result<ConditionPageResult<T, E>> data(BasePageResult<T> result, E condition) {
        return ok(ResultConstants.SELECT_SUCCESS_MSG, new ConditionPageResult<>(result, condition));
    }

    public static <T, E> Result<IterableResult<T, E>> data(Iterable<T> iterable, E condition) {
        return ok(ResultConstants.SELECT_SUCCESS_MSG, new IterableResult<>(iterable, condition));

    }

    public static <T> Result<T> error(String message, T data) {
        return result(ResultConstants.ERROR_CODE, message, data);
    }

    public static Result<?> error(String message) {
        return result(ResultConstants.ERROR_CODE, message);
    }

    public static Result<?> validateError(String message) {
        return result(ResultConstants.VALIDATE_ERROR_CODE, message);
    }

    public static Result<?> dataParamsError() {
        return result(ResultConstants.DATA_PARAMS_ERROR_CODE, ResultConstants.DATA_PARAMS_ERROR_MESSAGE);
    }

    public static Result<?> addSuccess() {
        return ok(ResultConstants.ADD_SUCCESS_MSG);
    }

    public static Result<?> updateSuccess() {
        return ok(ResultConstants.UPDATE_SUCCESS_MSG);
    }

    public static Result<?> addSuccess(Object object) {
        return ok(ResultConstants.ADD_SUCCESS_MSG, object);
    }

    public static Result<?> existError(String message) {
        return error(message);
    }

}