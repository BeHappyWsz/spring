package com.wsz.spring.beanLifeCycle;
/**
 * 配置属性进行初始化和销毁操作
 * @author wsz
 * @date 2018年2月26日
 */
public class BeanLifeCycle1 {

	void start() {
		System.out.println("配置属性初始化");
	}
	
	void stop() {
		System.out.println("配置属性销毁");
	}
	
	void say() {
		System.out.println("配置属性进行初始化和销毁操作");
	}
}
