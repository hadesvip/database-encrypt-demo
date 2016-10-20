package com.componet;

import com.alibaba.druid.filter.config.ConfigTools;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 对用户名进行加密
 * Created by wangyong on 16-10-20.
 */
@ConfigurationProperties(locations = "classpath:application.yml")
public class DecryptDruidSource extends DruidDataSource {

    @Value("${mysql.jdbc.username_publickey}")
    private String userNameKey;


    @Override
    public void setUsername(String username) {

        userNameKey="MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAJO42vzkepf+kvNh2s+4S9SnHcYo/BuECnzrSkzwqkHVguGlcRCrh38qUvV4a1AvXI9eC+OZT63HfW0hOiWKw68CAwEAAQ==";
        try {
            username = ConfigTools.decrypt(userNameKey, username);
        } catch (Exception e) {
            e.printStackTrace();
        }

        super.setUsername(username);
    }


}
