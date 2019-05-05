package com.lyg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

import com.lyg.myrule.MySelfRule;


@ComponentScan("com.lyg.springcloud.*")
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name="SERVICECLOUD-PERSON",configuration=MySelfRule.class) //自定义负载方式
public class Consumer_80 {

	public static void main(String[] args) {
		SpringApplication.run(Consumer_80.class, args);
	}

}
