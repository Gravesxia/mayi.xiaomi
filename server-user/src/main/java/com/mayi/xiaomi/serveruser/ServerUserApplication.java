package com.mayi.xiaomi.serveruser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.FeignClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.mayi.xiaomi.serveruser.dao")
public class ServerUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerUserApplication.class, args);
	}
}
