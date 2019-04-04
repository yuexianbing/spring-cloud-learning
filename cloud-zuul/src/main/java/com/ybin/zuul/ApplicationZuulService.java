package com.ybin.zuul;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Describe:
 * @Author: bing.yue001
 */
@Slf4j
@EnableZuulProxy
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class ApplicationZuulService {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationZuulService.class);
        log.info("ZuulServiceApplication is start...");
    }
}
