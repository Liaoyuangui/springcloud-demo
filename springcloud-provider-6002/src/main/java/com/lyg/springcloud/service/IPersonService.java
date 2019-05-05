package com.lyg.springcloud.service;

import com.lyg.springcloud.entity.Person;


/**
 * service 层接口
 * @author
 *
 */
public interface IPersonService {
	/**
	 * 根据ID更新个人信息
	 * @param person 
	 * @return 
	 */
	int updatePersonById(Person person);
	

}
