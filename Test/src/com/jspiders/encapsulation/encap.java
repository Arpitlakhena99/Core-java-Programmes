package com.jspiders.encapsulation;

public class encap {
	private int id;
	private String name;
	private double salary;
	
	public encap(int id, String name, double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
}
	public int getid()
	{
		return id;
	}
	public String getname()
	{
		return name;
	}
	public double getsalary()
	{
		return salary;
	}
	public void Setid(int id)
	{
		this.id=id;
	}
	public void Setname(String name)
	{
		this.name=name;
	}
	public void Setsalary(double salary) {
		
this.salary=salary;
	}
	public static void main(String [] args) {
		encap e1=new encap(1,"arpit",23000);
				System.out.println("id="+e1.getid());
				System.out.println("name="+e1.getname());
				System.out.println("salary="+e1.getsalary());
	}
}
