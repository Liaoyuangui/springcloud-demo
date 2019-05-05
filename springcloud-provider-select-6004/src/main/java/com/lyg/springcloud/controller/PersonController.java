package com.lyg.springcloud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lyg.springcloud.entity.Person;
import com.lyg.springcloud.service.IPersonService;


/**
 * 控制层
 * @author 
 *
 */
@RestController
public class PersonController {
	@Autowired
	private IPersonService personService;
	
	/**
	 * 获取所有的数据
	 * @param person
	 * @return
	 */
	@RequestMapping(value="person/selectList",method=RequestMethod.GET)
	public List<Person> selectAllPerson(Person person){
		List<Person> resultList = new ArrayList<>();
		List<Person> list = personService.selectAllPerson(person);
		for (int i = 0; i < list.size(); i++) {
			Person ps = list.get(i);
			ps.setSource("6004"); 
			resultList.add(ps);
		}
		return resultList;
	}
	
	/**
	 * 根据ID获取数据
	 * @param id
	 * @return
	 */
	@RequestMapping(value="person/get/{id}",method=RequestMethod.GET)
	public Person selectById(@PathVariable("id") Integer id){
		Person person = personService.selectById(id);
		person.setSource("6004");
		return person;
	}

}
