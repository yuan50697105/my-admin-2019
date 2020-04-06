package org.yuan.boot.commons.base.core.configuration.pojo.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


/**
 * @program: my-admin-01
 * @description:
 * @author: yuanez
 * @create: 2020-02-19 10:54
 **/
@ConfigurationProperties(prefix = "snowflake")
@Data
public class SnowFlakeProperties {
    private static final long DEFAULT_WORKER_ID = 0;
    private static final long DEFAULT_DATA_CENTER_ID = 0;
    private long workerId = DEFAULT_WORKER_ID;
    private long dataCenterId = DEFAULT_DATA_CENTER_ID;
}
