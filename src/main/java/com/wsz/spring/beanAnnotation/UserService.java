package com.wsz.spring.beanAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 自动注解三种方法
 * 1.成员变量
 * 2.构造器
 * 3.set方法
 * @author wsz
 * @date 2018年2月27日
 */
@Service
public class UserService {

//	@Autowired
	private UserDAO userDAO;
	
//	@Autowired
//	public UserService(UserDAO userDAO) {
//		this.userDAO=userDAO;
//	}
	
	@Autowired
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public void say() {
		userDAO.say();
	}
}
