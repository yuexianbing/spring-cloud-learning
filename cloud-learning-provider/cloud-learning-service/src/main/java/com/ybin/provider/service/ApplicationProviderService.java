package com.ybin.provider.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ybin
 */
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class, scanBasePackages = {"com.ybin"})
public class ApplicationProviderService {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationProviderService.class, args);
	}

}

