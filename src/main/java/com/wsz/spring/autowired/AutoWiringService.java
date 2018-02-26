package com.wsz.spring.autowired;

public class AutoWiringService {

	private AutoWiringDAO autoWiringDAO;

	/**
	 * 构造自动装配
	 * @param autoWiringDAO
	 */
	public AutoWiringService(AutoWiringDAO autoWiringDAO) {
		this.autoWiringDAO = autoWiringDAO;
	}

	/**
	 * set自动装配
	 * @param autoWiringDAO
	 */
	public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
		this.autoWiringDAO = autoWiringDAO;
	}
	
	public void say() {
		autoWiringDAO.say();
	}
}
