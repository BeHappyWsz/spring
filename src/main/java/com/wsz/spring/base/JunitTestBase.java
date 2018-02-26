package com.wsz.spring.base;

import org.junit.After;
import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;
/**
 * 准备工作：
 * 1.读取配置文件
 * 2.开启bean容器并读取
 * 3.获取bean方法
 * 4.关闭容器
 * @author wsz
 * @date 2018年2月26日
 */
public class JunitTestBase {

	private ClassPathXmlApplicationContext context;
	
	private String xmlName;
	
	public JunitTestBase() {
		super();
	}

	public JunitTestBase(String xmlName) {
		this.xmlName = xmlName;
	}
	
	@Before
	public void before() {
		if(StringUtils.isEmpty(xmlName)) {
			xmlName = "com/wsz/spring/resource/spring-*.xml";
		}else {
			xmlName = "com/wsz/spring/resource/"+xmlName;
		}
		try {
			context = new ClassPathXmlApplicationContext(xmlName);
			context.start();
		}catch (BeansException e) {
			e.printStackTrace();
		}
	}
	
	@After
	public void after() {
		context.destroy();
	}
	
	@SuppressWarnings("unchecked")
	protected <T extends Object> T getBean(String benaId) {
		try {
			return (T)context.getBean(benaId);
		}catch (BeansException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	protected <T extends Object> T getBean(Class<T> clazz) {
		try {
			return (T)context.getBean(clazz);
		}catch (BeansException e) {
			e.printStackTrace();
			return null;
		}
	}
}
