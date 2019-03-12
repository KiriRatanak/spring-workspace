package com.springdemo;

import java.util.List;

public class ATM {
	Printer myPrinter;
	Withdrawer myWithdrawer;
	
	//A list reference that will be injected to
	List<String> listOfCurrencies;
	
	public void setListOfCurrencies(List<String> listOfCurrencies) {
		this.listOfCurrencies = listOfCurrencies;
	}

	//Inject dependencies using Constructor
	public ATM(Printer myP, Withdrawer myW) {
		myPrinter = myP;
		myWithdrawer = myW;
	}
	
	public void printWithdrawableCurrency() {
		for(String currency : listOfCurrencies) {
			System.out.println(currency);
		}
	}
	
	public void print() {
		myPrinter.print();
	}
	
	public void withdraw() {
		myWithdrawer.withdraw();
	}
}
