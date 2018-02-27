package com.wsz.spring.aopAdviceAnnotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
/**
 * 切面注解类
 * @author wsz
 * @date 2018年2月27日
 */
@Component
@Aspect
public class AspectObj {

	@Pointcut("execution(* com.wsz.spring.aopAdviceAnnotation.UserService.*(..))")
	public void pointcut() {}
	
	@Before("pointcut()")
	public void before() {
		System.out.println("before");
	}
	
	@AfterReturning(pointcut="pointcut()",returning="returnValue")
	public void afterReturning(Object returnValue) {
		System.out.println("AfterReturning:"+returnValue);
	}
	
	@AfterThrowing(pointcut="pointcut()",throwing="e")
	public void afterThrowing(RuntimeException e) {
		System.out.println("AfterThrowing:"+e);
	}
	
	@After("pointcut()")
	public void after() {
		System.out.println("after");
	}
	
	@Around("pointcut()")
	public Object around(ProceedingJoinPoint pjp) {
		Object obj = null;
		try {
			System.out.println("around1");
			obj = pjp.proceed();
			System.out.println("around2:"+obj);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return obj;
	}
}
