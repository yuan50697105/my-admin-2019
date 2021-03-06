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
public class DeviceInfo extends BaseEntity {
    /**
     * code
     */
    private String code;

    /**
     * type
     */
    private Integer type;

    /**
     * rangeCode
     */
    private String rangeCode;


}