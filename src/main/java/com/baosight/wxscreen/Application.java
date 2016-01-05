package com.baosight.wxscreen;

/**
 * Created by GeekSeeker on 1/4/16.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.baosight.wxscreen")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
