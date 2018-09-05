package com.njtech.signup.config;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * mybatis配置
 * pageHelper 配置
 *
 * @author casin
 * @create 2017-12-01 16:23
 **/
@Configuration
public class MybatisConfig {

    @Bean
    public PageHelper pageHelper(){
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("offsetAsPageNum","true");
        properties.setProperty("rowBoundsWithCount","true");
        properties.setProperty("reasonable","true");
        properties.setProperty("dialect","mysql");//配置mysql数据库的方言
        pageHelper.setProperties(properties);
        return pageHelper;
    }
}
