package com.springdemo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ATM atm = (ATM) context.getBean("atm");

		atm.print();
		atm.withdraw();
		
		((ConfigurableApplicationContext)context).close();
	}

}
