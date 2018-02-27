package com.wsz.spring.aopAdvice;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 切面类
 * @author wsz
 * @date 2018年2月27日
 */
public class Aspect {

	public void before() {
		System.out.println("前置before");
	}
	
	public void afterReturning() {
		System.out.println("afterReturning");
	}
	
	public void afterThrowing() {
		System.out.println("afterThrowing");
	}
	
	public void after() {
		System.out.println("after");
	}
	
	/**
	 * 环绕通知:注意抛出异常的处理位置
	 * @param pjp
	 * @return
	 */
	public Object around(ProceedingJoinPoint pjp) {
		Object obj = null;
		try {
			System.out.println("around1");
			obj = pjp.proceed();
			System.out.println("around2");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return obj;
	}
	
	/**
	 * 环绕通知传递参数
	 * @param pjp
	 * @param file
	 * @param length
	 * @return
	 */
	public Object aroundLoad(ProceedingJoinPoint pjp,String file,int length) {
		Object obj = null;
		try {
			System.out.println("aroundLoad1");
			obj = pjp.proceed();
			System.out.println("aroundLoad2");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return obj;
	}
}
