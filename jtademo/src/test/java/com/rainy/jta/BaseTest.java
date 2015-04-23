package com.rainy.jta;

import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseTest {
	
	protected ApplicationContext applicationContext = null;
	
	@Before
	public void setUp () {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/application*.xml");
	}

}
