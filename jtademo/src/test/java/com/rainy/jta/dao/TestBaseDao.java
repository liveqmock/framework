package com.rainy.jta.dao;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rainy.jta.domain.entity.User;

public class TestBaseDao extends TestCase {
	
	ApplicationContext applicationContext = null;
	
	@Before
	public void setUp () {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/application*.xml");
	}
	
	@Test
	public void testSave () {
		// IBaseDao baseDao = (IBaseDao)applicationContext.containsBean("");
		// baseDao.save("insert into a (a) value ('1')");
		User u = new User();
		IBaseDao<User> baseDao = (IBaseDao<User>)applicationContext.getBean("jdbcTemplateDao");
		IBaseDao<User> hibernateJdbcDao = (IBaseDao<User>)applicationContext.getBean("hibernateJdbcDao");
		baseDao.save(u);
		hibernateJdbcDao.save(u);
	}

}
