package com.ybin.consumer;

import com.ybin.provider.api.consumer.hystrix.HystrixFallBack;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
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
		ApplicationContext context = SpringApplication.run(ApplicationConsumerService.class, args);
			context.getBean(HystrixFallBack.class);
	}

}

