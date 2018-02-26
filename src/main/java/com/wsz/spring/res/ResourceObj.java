package com.wsz.spring.res;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

public class ResourceObj implements ApplicationContextAware{

	private ApplicationContext applicationContext;
	
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext =applicationContext;
	}

	public void resource() throws IOException {
		Resource resource = applicationContext.getResource("classpath:config.txt");
		System.out.println(resource.getFilename());
		System.out.println(resource.getURI().toString());
	}
}
