package com.beibei.spring;

public class HelloWorld {
	private String name;
	
	
	public HelloWorld() {
		// TODO Auto-generated constructor stub
		System.out.println("Hello construcotr is run");
	}
	public String getName() {
		return name;
	}


	public void setName(String name) {
		
		System.out.println("Set name is run");
		this.name = name;
	}


	public void hello(){
		System.out.println("hello:"+name);
	}
}
