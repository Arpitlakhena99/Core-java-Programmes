package com.jspiders.encapsulation;

public class Paytm2022 extends Paytm2020 {
	void moneytransfer() {
		super.moneytransfer();
		System.out.println("Send with Upi Id");
	}
	void checkBalance() {
		super.checkBalance();
		System.out.println("Check phonePe Wallet Balance");
	}
	void rechargePayBills() {
		super.rechargePayBills();
		System.out.println("Credit Card Payments, Rent Payements, Loan Payments, Education Fees");
	}
	void insurance() {
		System.out.println("Insurance");
	}
}