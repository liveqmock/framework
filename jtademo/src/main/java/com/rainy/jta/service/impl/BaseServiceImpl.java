package com.rainy.jta.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.rainy.jta.dao.IBaseDao;
import com.rainy.jta.service.IBaseService;

public class BaseServiceImpl<T> implements IBaseService<T> {
	
	@Autowired
	private IBaseDao<T> baseDao;

	public void save(T t) {
		baseDao.save(t);
	}

}
