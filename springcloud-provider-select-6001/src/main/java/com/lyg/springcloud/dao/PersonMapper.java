package com.lyg.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.lyg.springcloud.entity.Person;

@Mapper
public interface PersonMapper {
	
	// 查询所有的数据
	List<Person> selectAllPerson(Person person);
	
	//根据id获取数据
	Person selectById(Integer id);

}
