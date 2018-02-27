package com.wsz.spring.aopAdvice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.wsz.spring.base.JunitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class AdviceTest extends JunitTestBase{

	public AdviceTest() {
		super("spring-aop-schema-advice.xml");
	}
	
	@Test
	public void test() throws Exception {
		UserService bean = super.getBean("userService");
		bean.login();
	}
	
	@Test
	public void testLoad() {
		UserService bean = super.getBean("userService");
		bean.download("aaa", 15);
	}
}
