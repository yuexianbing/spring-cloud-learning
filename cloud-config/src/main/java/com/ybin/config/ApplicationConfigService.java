package com.ybin.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author : <a href="mailto:215203450@qq.com">bing.yue</a>
 * @version : 1.0
 * @date : 2019-4-13 12:29
 * @description :
 */
@EnableConfigServer
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class, scanBasePackages = {"com.ybin"})
public class ApplicationConfigService {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationConfigService.class);
    }
}
