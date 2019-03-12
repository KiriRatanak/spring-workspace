package com.springdemo;


public class ATM {
	Printer myPrinter;
	Withdrawer myWithdrawer;
	
	
	//Inject dependencies using Setter
	public void setMyPrinter(Printer myP) {
		myPrinter = myP;
	}
	
	
	//Inject dependencies using Setter
	public void setMyWithdrawer(Withdrawer myW) {
		myWithdrawer = myW;
	}
	
	public void print() {
		myPrinter.print();
	}
	
	public void withdraw() {
		myWithdrawer.withdraw();
	}
}
