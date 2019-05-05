package com.lyg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eureka_9003 {

	public static void main(String[] args) {
		SpringApplication.run(Eureka_9003.class, args);
	}

}
