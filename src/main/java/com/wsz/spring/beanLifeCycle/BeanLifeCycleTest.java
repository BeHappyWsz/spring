package com.wsz.spring.beanLifeCycle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.wsz.spring.base.JunitTestBase;
/**
 * 测试bean声明周期
 * @author wsz
 * @date  2018年2月26日
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class BeanLifeCycleTest extends JunitTestBase{

	public BeanLifeCycleTest() {
		super("spring-beanLifeCycle.xml");
	}

	/**
	 * 配置init/destroy方法
	 * 将直接调用自定义的start/stop方法
	 */
	@Test
	public void lifeCycle1() {
		BeanLifeCycle1 bean = super.getBean("beanLifeCycle1");
		bean.say();
	}
	
	/**
	 * 配置init/destroy方法
	 * 将直接调用自定义的start/stop方法
	 */
	@Test
	public void lifeCycle2() {
		BeanLifeCycle2 bean = super.getBean("beanLifeCycle2");
		bean.say();
	}
}
