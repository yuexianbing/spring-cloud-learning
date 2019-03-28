package com.ybin.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author ybin
 */
@EnableAspectJAutoProxy
@EnableEurekaClient
@EnableHystrix
@EnableFeignClients(basePackages = {"com.ybin"})
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class, scanBasePackages = {"com.ybin"})
public class ApplicationConsumerService {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationConsumerService.class, args);
	}

}

