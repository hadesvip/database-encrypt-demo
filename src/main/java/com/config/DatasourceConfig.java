package com.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wangyong on 16-10-19.
 */
@Configuration
@ConfigurationProperties(prefix = "mysql.jdbc",value = "classpath:application.yml")
public class DatasourceConfig {

    private String userName;

    private String password;


}
