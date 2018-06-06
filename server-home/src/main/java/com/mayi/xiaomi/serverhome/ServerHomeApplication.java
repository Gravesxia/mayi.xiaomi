package com.mayi.xiaomi.serverhome;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.mayi.xiaomi.serverhome.dao")
@EnableFeignClients
public class ServerHomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerHomeApplication.class, args);
	}
}
