package com.util;

import org.springframework.beans.factory.config.YamlMapFactoryBean;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import javax.annotation.PostConstruct;
import java.util.Map;

/**
 * 配置工具类
 * Created by wangyong on 16-10-20.
 */
public class PropertiesUtil {

    private static Map<String, Object> params;

    @PostConstruct
    public void init() {
        YamlMapFactoryBean yamlMapFactoryBean = new YamlMapFactoryBean();
        ResourceLoader loader = new DefaultResourceLoader();
        Resource resource = loader.getResource("classpath:config.yml");
        yamlMapFactoryBean.setResources(resource);
        params = yamlMapFactoryBean.getObject();
    }


    /**
     * 获取配置属性值
     *
     * @param key          键
     * @param defaultValue 默认值
     * @return 返回属性值
     */
    public static String getProperty(String key, String defaultValue) {
        return params.get(key) == null ? defaultValue : (String) params.get(key);
    }


    /**
     * 获取配置属性值
     *
     * @param key 键
     * @return 属性值
     */
    public static String getProperty(String key) {
        return (String) params.get(key);
    }

}
