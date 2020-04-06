package org.yuan.boot.java.mvc.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @program: learning-demo-java-02
 * @description:
 * @author: yuane
 * @create: 2020-01-22 16:51
 */
@Data
@Builder
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public final class Result {
    private Integer code;
    private String message;
    private Object data;
}