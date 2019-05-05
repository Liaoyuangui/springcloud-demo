package com.lyg.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;

import com.lyg.springcloud.entity.Person;

@Mapper
public interface PersonMapper {
	
	/**
	 * 根据ID修改个人信息
	 * @param person 实体
	 * @return
	 */
	int updatePersonById(Person person);

}
