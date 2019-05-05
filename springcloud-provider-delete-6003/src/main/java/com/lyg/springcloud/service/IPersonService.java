package com.lyg.springcloud.service;

/**
 * service 层接口
 * @author
 *
 */
public interface IPersonService {
	/**
	 * 根据ID删除个人信息
	 * @param person 
	 * @return 
	 */
	int deletePersonById(Integer id);
	

}
