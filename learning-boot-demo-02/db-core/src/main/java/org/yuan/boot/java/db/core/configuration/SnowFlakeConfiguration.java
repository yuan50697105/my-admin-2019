package org.yuan.boot.java.db.core.configuration;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: learning-demo-java-02
 * @description:
 * @author: yuane
 * @create: 2020-01-22 19:07
 */
@Configuration
public class SnowFlakeConfiguration {
    @Bean
    public Snowflake snowflake() {
        return IdUtil.createSnowflake(1, 1);
    }
}