package com.wsz.spring.beanAnnotation;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

	public void say() {
		System.out.println("注解");
	}
}
