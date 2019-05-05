package com.lyg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServer_6688 {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServer_6688.class, args);
	}

}
