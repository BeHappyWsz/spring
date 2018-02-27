package com.wsz.spring.beanAnnotation;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

	@Autowired
	private UserDAO userDAO;
	
	/**
	 * 使用list注入所有实现子类列表
	 */
	@Autowired 
	private List<InterfaceDAO> userDAOs;
	
	/**
	 * 使用map接受所有实现的子列表信息
	 */
	@Autowired
	private Map<String, InterfaceDAO> map;
	
	/**
	 * 指定接受某一种实现的子信息
	 */
	@Autowired
	@Qualifier("userDAO1")
	private InterfaceDAO interfaceDAO;
	
//	@Autowired
//	public UserService(UserDAO userDAO) {
//		this.userDAO=userDAO;
//	}
	
//	@Autowired
//	public void setUserDAO(UserDAO userDAO) {
//		this.userDAO = userDAO;
//	}

	public void say() {
		userDAO.say();
	}
	
	public void list() {
		for(InterfaceDAO dao:userDAOs) {
			dao.say();
			System.out.println(dao.getClass().getName());
		}
	}
	
	public void map() {
		for (Map.Entry<String, InterfaceDAO> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"  "+entry.getValue().getClass().getName());
		}
	}
	
	public void getOne() {
		System.out.println(interfaceDAO.getClass().getName());
	}
}
