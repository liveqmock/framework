package com.rainy.jta.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcDaoImpl<T> extends BaseDaoImpl<T> {
	
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
