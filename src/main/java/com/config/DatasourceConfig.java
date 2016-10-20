package com.config;

import com.componet.DecryptDruidSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.SQLException;
import java.util.Properties;

/**
 * 数据源配置
 * Created by wangyong on 16-10-19.
 */
@Configuration
@ConfigurationProperties(locations = "classpath:application.yml")
public class DatasourceConfig {

    @Value("${mysql.jdbc.username}")
    private String userName;

    @Value("${mysql.jdbc.password}")
    private String password;

    @Value("${mysql.jdbc.url}")
    private String url;

    @Value("${mysql.jdbc.driverClass}")
    private String driverClass;

    @Value("${mysql.jdbc.password_public_key}")
    private String passwordKey;


    @Bean
    public DecryptDruidSource dataSource() throws SQLException {
        DecryptDruidSource decryptDruidSource = new DecryptDruidSource();

        decryptDruidSource.setUsername(userName);
        decryptDruidSource.setPassword(password);
        decryptDruidSource.setUrl(url);
        decryptDruidSource.setDriverClassName(driverClass);
        decryptDruidSource.setFilters("config");

        Properties props = new Properties();
        props.setProperty("config.decrypt","true");
        props.setProperty("config.decrypt.key",passwordKey);
        decryptDruidSource.setConnectProperties(props);

        return decryptDruidSource;
    }

}
