package com.beibei.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld helloWorld = (com.beibei.spring.HelloWorld) ctx.getBean("helloWorld");
		helloWorld.hello();
		
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);
		
		
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
		
	}
}
