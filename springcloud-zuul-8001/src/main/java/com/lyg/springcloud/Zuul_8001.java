package com.lyg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Zuul_8001 {

	public static void main(String[] args) {

		SpringApplication.run(Zuul_8001.class, args);
	}

}
