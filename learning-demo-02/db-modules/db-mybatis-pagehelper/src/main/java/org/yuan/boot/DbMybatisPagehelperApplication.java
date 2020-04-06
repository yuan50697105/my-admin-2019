package org.yuan.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = {DbCoreApplication.class})
public class DbMybatisPagehelperApplication {
    public static void main(String[] args) {
        SpringApplication.run(DbMybatisPagehelperApplication.class, args);
    }
}
