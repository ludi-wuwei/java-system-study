package com.ludy.study.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author 陆迪
 * @date 2020/3/8 14:57
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApplication.class, args);

    }
}
