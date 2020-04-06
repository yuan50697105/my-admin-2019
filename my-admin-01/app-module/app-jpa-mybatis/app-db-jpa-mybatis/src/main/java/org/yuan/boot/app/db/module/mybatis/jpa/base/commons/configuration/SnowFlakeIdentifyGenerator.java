package org.yuan.boot.app.db.module.mybatis.jpa.base.commons.configuration;

import cn.hutool.extra.spring.SpringUtil;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.HibernateException;
import org.hibernate.MappingException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.Configurable;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;
import org.yuan.boot.commons.base.core.configuration.pojo.SnowFlake;

import java.io.Serializable;
import java.util.Properties;

/**
 * @program: my-admin-01
 * @description:
 * @author: yuane
 * @create: 2020-02-22 23:24
 */
@SuppressWarnings("ALL")
@Slf4j
@org.springframework.beans.factory.annotation.Configurable(preConstruction = true)
@Component
public class SnowFlakeIdentifyGenerator implements IdentifierGenerator, Configurable, ApplicationContextInitializer<ConfigurableApplicationContext> {
    @SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
    @Autowired
    private SnowFlake snowFlake;

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
        SnowFlake snowFlake = SpringUtil.getBean(SnowFlake.class);
        return snowFlake.nextId();
    }

    @Override
    public void configure(Type type, Properties params, ServiceRegistry serviceRegistry) throws MappingException {
    }


    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        snowFlake = applicationContext.getBean(SnowFlake.class);
    }
}