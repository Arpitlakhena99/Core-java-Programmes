package com.jspiders.encapsulation;

public interface main {
	class a{
		String name="xyz";
	}
interface run3 {
	public void test();
}
interface run4{
	public void count();
}
public class main3 extends a implements run3,run4
{
	public void test()
	{
		System.out.println("run3 method");
	}
	public void count()
	{
		System.out.println("run4 method");
	}
	public static void main(String [] args)
	{
		main3 m =new main3();
		m.test();
		m.count();
		System.out.println(m.name);
	}
}
}
