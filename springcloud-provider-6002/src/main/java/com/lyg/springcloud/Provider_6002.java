package com.lyg.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@MapperScan("com.lyg.springcloud.dao") //扫码@Mapper注解
@ComponentScan("com.lyg.springcloud.*")
@SpringBootApplication
@EnableDiscoveryClient //服务发现
public class Provider_6002 {

	public static void main(String[] args) {
		SpringApplication.run(Provider_6002.class, args);
	}

}
