package com.rainy.jta.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcDaoImpl<T> extends BaseDaoImpl<T> {
	
	@Autowired
	private JdbcTemplate jdbcBaseDao;
	
}
