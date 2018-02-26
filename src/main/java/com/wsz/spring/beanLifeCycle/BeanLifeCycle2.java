package com.wsz.spring.beanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
/**
 * 实现接口进行自定义初始化/销毁操作
 * @author wsz
 * @date 2018年2月26日
 */
public class BeanLifeCycle2 implements InitializingBean,DisposableBean{

	public void destroy() throws Exception {
		System.out.println("实现接口销毁");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("实现接口初始化");
	}

	void say() {
		System.out.println("实现接口自定义bean初始化/销毁操作");
	}
}
