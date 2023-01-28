package com.javaEdu.myapp.hello;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.javaEdu.myapp.hello.controller.HelloController;

public class HelloMain {

	public static void main(String[] args) {
		
//		IHelloService helloService = new HelloService();
//		HelloController controller = new HelloController();
//		controller.setHelloService(helloService);
//		controller.hello(name);
		
		
		
		AbstractApplicationContext context = new GenericXmlApplicationContext("application-config.xml");
		
		HelloController controller = context.getBean("helloController", HelloController.class);
		controller.hello("홍길동");
		context.close();
		
		
	}

}
