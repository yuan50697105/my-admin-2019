package org.yuan.boot.commons.base.core.configuration.pojo;

import cn.hutool.core.lang.Snowflake;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuanez
 * @create: 2020-02-19 10:50
 **/
public class SnowFlake extends Snowflake {
    public SnowFlake(long workerId, long dataCenterId) {
//        super(new Date(), workerId, dataCenterId, true);
        super(workerId,dataCenterId);
    }
}
