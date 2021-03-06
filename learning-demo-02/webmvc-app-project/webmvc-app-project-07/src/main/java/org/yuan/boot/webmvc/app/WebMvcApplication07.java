package org.yuan.boot.webmvc.app;

import org.minbox.framework.api.boot.autoconfigure.swagger.annotation.EnableApiBootSwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yuan.boot.DbCoreApplication;
import org.yuan.boot.db.DbMybatisMapperPlusApplication;
import org.yuan.boot.webmvc.WebMvcCoreApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @program: learning-demo-02
 * @description:
 * @author: yuane
 * @create: 2019-12-29 23:37
 */
@EnableSwagger2
@EnableApiBootSwagger
@SpringBootApplication(scanBasePackageClasses = {WebMvcCoreApplication.class, DbCoreApplication.class, DbMybatisMapperPlusApplication.class})
public class WebMvcApplication07 {
    public static void main(String[] args) {
        SpringApplication.run(WebMvcApplication07.class, args);
    }
}