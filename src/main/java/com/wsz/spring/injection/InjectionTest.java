package com.wsz.spring.injection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.wsz.spring.base.JunitTestBase;
import com.wsz.spring.injection.service.InjectionServiceImpl;
/**
 * 依赖注入的两种方式
 * @author wsz
 * @date 2018年2月26日
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class InjectionTest extends JunitTestBase{

	public InjectionTest() {
		super("spring-injection.xml");
	}

	/**
	 * 设值注入
	 */
	@Test
	public void testSetter() {
		InjectionServiceImpl isi = super.getBean("injectionService");
		isi.say("这是设值注入");
	}
	
	/**
	 * 构造注入
	 */
	@Test
	public void testCons() {
		InjectionServiceImpl isi = super.getBean("injectionService");
		isi.say("这是构造注入");
	}
}
