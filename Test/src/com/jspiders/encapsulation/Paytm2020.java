package com.jspiders.encapsulation;

public class Paytm2020 extends Paytm2018 {
	void moneytransfer() {
		super.moneytransfer();
		System.out.println("Send with Mobile Number");
	}
	void checkBalance() {
		super.checkBalance();
		System.out.println("Check mini Statement");
	}
	void rechargePayBills() {
		System.out.println("mobile recharge, DTH recharge, Electricity");
	}
}