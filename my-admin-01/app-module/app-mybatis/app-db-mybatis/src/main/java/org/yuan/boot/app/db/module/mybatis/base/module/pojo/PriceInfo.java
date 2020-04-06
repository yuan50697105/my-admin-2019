package org.yuan.boot.app.db.module.mybatis.base.module.pojo;

import java.math.BigDecimal;
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
public class PriceInfo extends BaseEntity {
    /**
     * 定价编号
     */
    private String code;

    /**
     * 定价类型
     */
    private Integer type;

    /**
     * 区域码
     */
    private String rangeCode;

    /**
     * 时间计费单价
     */
    private BigDecimal timePrice;

    /**
     * 时间计费间隔 (单位分钟）
     */
    private Double timeInterval;

    /**
     * 水费计费单价
     */
    private BigDecimal waterPrice;

    /**
     * 水费计费间隔 （升)
     */
    private Double waterInterval;


}