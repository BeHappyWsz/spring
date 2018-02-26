package com.wsz.spring.ioc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.wsz.spring.base.JunitTestBase;
/**
 * 测试IOC
 * @author wsz
 * @date 2018年2月26日
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class IOCTest extends JunitTestBase{

	public IOCTest() {
		super("spring-ioc.xml");
	}

	@Test
	public void say() {
		UserService us = super.getBean(UserService.class);
//		UserService bc = super.getBean("userService");
		us.say();
	}
}
