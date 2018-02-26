package com.wsz.spring.res;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.wsz.spring.base.JunitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class ResourceTest extends JunitTestBase{

	public ResourceTest() {
		super("spring-resource.xml");
	}
	
	@Test
	public void getResource(){
		ResourceObj bean = super.getBean("resourceObj");
		try {
			bean.resource();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
