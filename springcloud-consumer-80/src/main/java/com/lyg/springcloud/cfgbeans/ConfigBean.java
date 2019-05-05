package com.lyg.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;

/**
 * 类似spring里面的applicationContext.xml写入的注入Bean
 *
 */
@Configuration
public class ConfigBean
{
	@LoadBalanced
    @Bean
    public RestTemplate getRestTemplate()
    {
         return new RestTemplate();
    }
	
	/**
	 * 指定负载的方式
	 * @return
	 */
	@Bean
	public IRule myRule(){
		return new RoundRobinRule(); //轮询，不指定默认方式
//		return new RandomRule(); //随机访问
		//return new RetryRule(); //轮询+重试
		//return new WeightedResponseTimeRule(); //优先选择响应时间快的
		//return new BestAvailableRule(); //优先选择并非请求最小的
		//....
	}
	
}