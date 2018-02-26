package com.wsz.spring.injection.service;

import com.wsz.spring.injection.dao.InjectionDAO;

public class InjectionServiceImpl implements InjectionService{
	
	private InjectionDAO injectionDAO;

	/**
	 * 设值注入
	 * @param injectionDAO
	 */
	public void setInjectionDAO(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}

	/**
	 * 构造注入
	 * @param injectionDAO
	 */
	public InjectionServiceImpl(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}

	public void say(String str) {
		injectionDAO.say(str);
	}

}
