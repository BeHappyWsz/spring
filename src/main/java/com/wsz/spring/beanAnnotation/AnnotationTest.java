package com.wsz.spring.beanAnnotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.wsz.spring.base.JunitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class AnnotationTest extends JunitTestBase{

	public AnnotationTest() {
		super("spring-beanAnnotation.xml");
	}
	
	@Test
	public void say() {
		UserService us = super.getBean("userService");
		us.say();
	}
}
