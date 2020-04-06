package org.yuan.boot.app.wx.pojo;

import lombok.*;

/**
 * @program: my-admin-01-wx
 * @description:
 * @author: yuane
 * @create: 2020-02-24 20:09
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@With
public class WxCustomerFormVO {
    private Long id;
    private String openId;
    private String unionId;
    private String nickName;
    private String phone;

    public interface Create {
    }

    public interface Update {
    }
}
