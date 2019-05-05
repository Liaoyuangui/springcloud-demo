package com.lyg.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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
	 * 修改数据
	 * id  name  sex age (传的参数)
	 * @param person
	 * @return
	 */
	@RequestMapping(value="update")
	public String updatePersonById(Person person){
		if(null == person){
			return "更新内容不能为空！";
		}
		if(null == person.getId() || "".equals(person.getId())){
			return "更新数据编号不能为空！";
		}
		personService.updatePersonById(person);
		return "更新成功";
	}

}
