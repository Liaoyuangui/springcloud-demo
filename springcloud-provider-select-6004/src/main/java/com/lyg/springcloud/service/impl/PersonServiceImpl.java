package com.lyg.springcloud.service.impl;

import java.util.List;

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
	public List<Person> selectAllPerson(Person person) {
		return personDao.selectAllPerson(person);
	}

	@Override
	public Person selectById(Integer id) {
		return personDao.selectById(id);
	}

}
