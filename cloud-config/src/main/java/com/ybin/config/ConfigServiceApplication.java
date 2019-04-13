package com.ybin.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author : <a href="mailto:bing.yue001@bkjk.com">bing.yue</a>
 * @version : 1.0
 * @date : 2019-4-13 12:29
 * @description :
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServiceApplication.class);
    }
}
