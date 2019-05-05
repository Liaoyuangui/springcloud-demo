package com.lyg.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lyg.springcloud.entity.Person;
import com.lyg.springcloud.service.PersonService;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService personService;
	/**
	 * 根据id获取个人信息
	 * @param id
	 * @return
	 */
	@RequestMapping("consumer/get/{id}")
	public Person getPersonById(@PathVariable("id") Integer id){
		return personService.getPersonById(id);
	}
	
	/**
	 * 查询所有数据
	 * @return
	 */
	@RequestMapping("consumer/selectList")
	public List<Person> getPersonList(){
		return personService.getPersonList();
	}
	
	/**
	 * 跟新信息
	 * @param person
	 * @return
	 */
	@RequestMapping("consumer/update")
	public String updatePerson(Person person){
		return  personService.updatePerson(person);
	}
	
	/**
	 * 删除数据
	 * @param id
	 * @return
	 */
	@RequestMapping("consumer/delete/{id}")
	public String deletePerson(@PathVariable("id") Integer id){
		return personService.deletePerson(id);
	}

}
