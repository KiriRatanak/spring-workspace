package com.springdemo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ATM implements InitializingBean, DisposableBean {
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Des");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("After Set");
	}

	public void initDu() {
		System.out.println("Init");
	}
	
	Printer myPrinter;
	Withdrawer myWithdrawer;
	
	//Inject dependencies using Constructor
	public ATM(Printer myP, Withdrawer myW) {
		myPrinter = myP;
		myWithdrawer = myW;
	}
	
	public void print() {
		myPrinter.print();
	}
	
	public void withdraw() {
		myWithdrawer.withdraw();
	}
	
	
	
}
