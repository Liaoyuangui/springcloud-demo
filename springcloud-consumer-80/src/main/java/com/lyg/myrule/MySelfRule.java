package com.lyg.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

/**
 * 自定义负载均衡策略类
 * @author DELL
 *
 */
@Configuration
public class MySelfRule {
	
	@Bean
	public IRule myRule(){
		//return new RandomRule(); //ribbon的随机策略
		return new MyRandomRule(); //自定义的策略，没隔5次切换
	}

}
