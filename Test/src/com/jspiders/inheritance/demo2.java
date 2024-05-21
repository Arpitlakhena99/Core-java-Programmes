package com.jspiders.inheritance;

class demo2 extends demo1
{
	int x=200;
	void display()
	{
		int x=300;
		System.out.println("local variable"+x);
		System.out.println(this.x);
		System.out.println(Super.x);
	}
}
