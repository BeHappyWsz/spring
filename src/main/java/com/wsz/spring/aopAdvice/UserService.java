package com.wsz.spring.aopAdvice;
/**
 * 业务类:触发切面方法
 * @author wsz
 * @date 2018年2月27日
 */
public class UserService {

	public void login() throws Exception {
		System.out.println("login");
//		throw new Exception();
	}
	
	/**
	 * 环绕通知传递参数
	 * @param file
	 * @param length
	 */
	public void download(String file,int length) {
		System.out.println("file:"+file+" length:"+length);
	}
}
