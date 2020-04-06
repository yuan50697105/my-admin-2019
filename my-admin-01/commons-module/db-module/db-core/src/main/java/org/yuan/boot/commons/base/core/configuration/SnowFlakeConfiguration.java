package org.yuan.boot.commons.base.core.configuration;

import cn.hutool.core.lang.Singleton;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.yuan.boot.commons.base.core.configuration.pojo.SnowFlake;
import org.yuan.boot.commons.base.core.configuration.pojo.properties.SnowFlakeProperties;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuanez
 * @create: 2020-02-19 10:53
 **/
@Configuration
@EnableConfigurationProperties(SnowFlakeProperties.class)
public class SnowFlakeConfiguration {

    @Primary
    @Bean
    public SnowFlake snowFlake(SnowFlakeProperties properties) {
        return Singleton.get(SnowFlake.class,properties.getWorkerId(),properties.getWorkerId());
    }
}
