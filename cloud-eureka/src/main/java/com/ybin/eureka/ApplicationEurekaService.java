package com.ybin.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author ybin
 */
@EnableAspectJAutoProxy
@EnableEurekaServer
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ApplicationEurekaService {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationEurekaService.class, args);
	}

}

