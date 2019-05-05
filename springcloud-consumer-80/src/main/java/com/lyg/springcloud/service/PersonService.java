package com.lyg.springcloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.lyg.springcloud.entity.Person;

@Service
public class PersonService {
	
	@Autowired
	private RestTemplate restTemplate;

	//不需要网关的访问地址
/*	//查询
	private static final String SELECT = "http://SPRINGCLOUD-PERSON-SELECT-TEST";
	//修改
	private static final String UPDATE = "http://SPRINGCLOUD-PERSON-UPDATE-TEST";
	//删除
	private static final String DELETE = "http://SPRINGCLOUD-PERSON-DELETE-TEST";*/
	
	//加入网关之后的访问地址，不直接访问服务，访问网关，由网关zuul组件来访问我们的服务
	//不能使用ip+端口的这种地址，http://127.0.0.1:8001/liaoyuangui/select/
	//查询
	private static final String SELECT = "http://SPRINGCLOUD-ZUUL-GATEWAY/liaoyuangui/select";
	//修改
	private static final String UPDATE = "http://SPRINGCLOUD-ZUUL-GATEWAY/liaoyuangui/update";
	//删除
	private static final String DELETE = "http://SPRINGCLOUD-ZUUL-GATEWAY/liaoyuangui/delete";
	
	/**
	 * 根据id获取个人信息
	 * @param id
	 * @return
	 */
	public Person getPersonById(Integer id){
		return restTemplate.getForObject(SELECT+"/person/get/"+id, Person.class);
	}
	
	/**
	 * 查询所有数据
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Person> getPersonList(){
		return restTemplate.getForObject(SELECT+"/person/selectList/", List.class);
	}
	
	/**
	 * 跟新信息
	 * @param person
	 * @return
	 */
	public String updatePerson(Person person){
		String url = UPDATE+"/update?id="+person.getId();
		if(null != person.getName()){
			url = url + "&name="+person.getName();
		}
		if(null != person.getAge()){
			url = url + "&age="+person.getAge();
		}
		if(null != person.getSex()){
			url = url + "&sex="+person.getSex();
		}
		return restTemplate.getForObject(url, String.class);
	}
	
	/**
	 * 删除数据
	 * @param id
	 * @return
	 */
	public String deletePerson(Integer id){
		return restTemplate.getForObject(DELETE+"/delete/"+id, String.class);
	}

}
