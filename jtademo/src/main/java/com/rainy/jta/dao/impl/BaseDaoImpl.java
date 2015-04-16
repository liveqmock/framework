package com.rainy.jta.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.rainy.jta.dao.IBaseDao;

public class BaseDaoImpl<T> implements IBaseDao<T> {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void save(T t) {
		jdbcTemplate.batchUpdate("");
	}
	
	

}
