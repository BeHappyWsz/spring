package com.wsz.spring.aopAdviceAnnotation;

public class UserService {

	public String save() {
		System.out.println("UserServiuce:save");
		return "success";
	}
	public void exec() {
		throw new RuntimeException("save failed");
	}
	
	public void param(String str) {
		System.out.println(str);
	}
}
