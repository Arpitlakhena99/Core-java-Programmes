package com.jspiders.encapsulation;

public class PaytmMain {
	public static void main(String[] args) {
		Paytm2022 p1 = new Paytm2022();
		System.out.println("==Money Transfer==");
		p1.moneytransfer();
		System.out.println("==Check Balance==");
		p1.checkBalance();
		System.out.println("==Recharge & PayBills==");
		p1.rechargePayBills();
		System.out.println("==Insurance==");
		p1.insurance();
	}
}