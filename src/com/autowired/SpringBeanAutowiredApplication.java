package com.autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBeanAutowiredApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.*");
		
		//All Component classes Objects create
		context.refresh();
		
		Address home = (Address) context.getBean("home");
		System.out.println(home);
		
		Address office = (Address) context.getBean("office");
		System.out.println(office);
		
		
		Employee emp = context.getBean(Employee.class);
		System.out.println(emp);
		System.out.println(emp.getAddress());
		
	}

}
