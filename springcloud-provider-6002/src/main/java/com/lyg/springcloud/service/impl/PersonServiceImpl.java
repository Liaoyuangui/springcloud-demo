package com.lyg.springcloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyg.springcloud.dao.PersonMapper;
import com.lyg.springcloud.entity.Person;
import com.lyg.springcloud.service.IPersonService;

/**
 * service 的实现类
 * @author 
 *
 */
@Service
public class PersonServiceImpl implements IPersonService {
	@Autowired
	private PersonMapper personDao;

	@Override
	public int updatePersonById(Person person) {
		return personDao.updatePersonById(person);
	}

}
