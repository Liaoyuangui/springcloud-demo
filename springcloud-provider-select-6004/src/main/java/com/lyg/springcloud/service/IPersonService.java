package com.lyg.springcloud.service;

import java.util.List;

import com.lyg.springcloud.entity.Person;


/**
 * service 层接口
 * @author
 *
 */
public interface IPersonService {
	/**
	 * 查询所以的
	 * @param person 条件
	 * @return 
	 */
	List<Person> selectAllPerson(Person person);
	/**
	 * 根据ID查询
	 * @param id
	 * @return
	 */
	Person selectById(Integer id);

}
