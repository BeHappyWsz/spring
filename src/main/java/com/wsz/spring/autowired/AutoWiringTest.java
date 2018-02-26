package com.wsz.spring.autowired;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.wsz.spring.base.JunitTestBase;
/**
 * 自动装配
 * 1.byName
 * 2.byType
 * 3.constructor
 * @author wsz
 * @date 2018年2月26日
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class AutoWiringTest extends JunitTestBase{

	public AutoWiringTest() {
		super("spring-autowiring.xml");
	}

	@Test
	public void autowiring() {
		AutoWiringService bean = super.getBean("autoWiringService");
		bean.say();
	}
	
}
