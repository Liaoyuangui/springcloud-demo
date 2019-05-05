package com.lyg.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PersonMapper {
	
	/**
	 * 根据ID删除个人信息
	 * @param person 实体
	 * @return
	 */
	int deletePersonById(Integer id);

}
