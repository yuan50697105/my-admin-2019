package org.yuan.boot.app.db.module.mybatis.base.module.pojo;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.yuan.boot.app.db.module.mybatis.base.commons.pojo.BaseEntity;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CustomerInfo extends BaseEntity {
    /**
     * 微信OPEN_ID
     */
    private String openId;

    /**
     * 微信UNION_ID
     */
    private String unionId;

    /**
     * 微信昵称
     */
    private String nickName;

    /**
     * 电话
     */
    private String phone;

    /**
     * 性别
     */
    private String gender;

    /**
     * 状态
     */
    private Integer enabled;



    public org.yuan.boot.app.db.module.mybatis.base.module.pojo.CustomerInfo withNickName(String nickName) {
        return this.nickName == nickName ? this : new org.yuan.boot.app.db.module.mybatis.base.module.pojo.CustomerInfo(this.openId, this.unionId, nickName, this.phone, this.gender, this.enabled);
    }

    public org.yuan.boot.app.db.module.mybatis.base.module.pojo.CustomerInfo withPhone(String phone) {
        return this.phone == phone ? this : new org.yuan.boot.app.db.module.mybatis.base.module.pojo.CustomerInfo(this.openId, this.unionId, this.nickName, phone, this.gender, this.enabled);
    }

    public org.yuan.boot.app.db.module.mybatis.base.module.pojo.CustomerInfo withGender(String gender) {
        return this.gender == gender ? this : new org.yuan.boot.app.db.module.mybatis.base.module.pojo.CustomerInfo(this.openId, this.unionId, this.nickName, this.phone, gender, this.enabled);
    }

    public org.yuan.boot.app.db.module.mybatis.base.module.pojo.CustomerInfo withEnabled(Integer enabled) {
        return this.enabled == enabled ? this : new org.yuan.boot.app.db.module.mybatis.base.module.pojo.CustomerInfo(this.openId, this.unionId, this.nickName, this.phone, this.gender, enabled);
    }
}