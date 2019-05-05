package com.lyg.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	 * 删除数据
	 * id 数据编号，必须
	 * @param person
	 * @return
	 */
	@RequestMapping(value="delete/{id}")
	public String deletePersonById(@PathVariable("id") Integer id){
		if(null == id){
			return "更新数据编号不能为空！";
		}
		personService.deletePersonById(id);
		return "delete success";
	}

}
