package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * 程序入口
 * Created by wangyong on 16-10-19.
 */
@SpringBootApplication
//@EnableConfigurationProperties
public class Console {

    public static void main(String[] args) {
        SpringApplication.run(Console.class, args);
    }
}
