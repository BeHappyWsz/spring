package com.wsz.spring.aopAdviceAnnotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.wsz.spring.base.JunitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class AnnotationAdviceTest extends JunitTestBase{
	
	public AnnotationAdviceTest() {
		super("spring-aop-annotation-advice.xml");
	}
	
	@Test
	public void test() {
		UserService bean = super.getBean("userService");
		bean.save();
//		bean.exec();
	}
	
}
