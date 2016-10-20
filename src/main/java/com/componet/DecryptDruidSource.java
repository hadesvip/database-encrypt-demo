package com.componet;

import com.alibaba.druid.filter.config.ConfigTools;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 对用户名进行加密
 * Created by wangyong on 16-10-20.
 */
@Configuration
@ConfigurationProperties(locations = "classpath:application.yml")
public class DecryptDruidSource extends DruidDataSource {

    @Value("${mysql.jdbc.username_publickey}")
    private String userNameKey;

    @Override
    public void setUsername(String username) {
        try {
            username = ConfigTools.decrypt(userNameKey, username);
        } catch (Exception e) {
            e.printStackTrace();
        }

        super.setUsername(username);
    }


}
