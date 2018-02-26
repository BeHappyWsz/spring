package com.wsz.spring.beanScope;

import org.junit.Test;

import com.wsz.spring.base.JunitTestBase;
/**
 * beanScope作用域
 * @author wsz
 * @date 2018年2月26日
 */
public class BeanScopeTest extends JunitTestBase{

	public BeanScopeTest() {
		super("spring-beanScope.xml");
	}
	
	/**
	 * singleton作用域
	 * 在同一个bean容器中多次获取同一个bean，
	 */
	@Test
	public void singletonScope() {
		BeanScope scope1 = super.getBean("singletonScope");
		scope1.say();
		
		BeanScope scope2 = super.getBean("singletonScope");
		scope2.say();
	}
	
	/**
	 * prototype作用域
	 * 每次请求getBean均不一致
	 */
	@Test
	public void prototypeScope() {
		BeanScope scope1 = super.getBean("prototypeScope");
		scope1.say();
		
		BeanScope scope2 = super.getBean("prototypeScope");
		scope2.say();
	}
	
	/**
	 * request作用域
	 * 需要借助http请求
	 */
	@Test
	public void requestScope1() {
		BeanScope scope1 = super.getBean("requestScope");
		scope1.say();
		
		BeanScope scope2 = super.getBean("requestScope");
		scope2.say();
	}
}
