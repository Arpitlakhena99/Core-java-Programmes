package array;

public class employeedata {
	int id;
	String name;
	double salary;
	public employeedata(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public String toString()
	{
return "employee: "+id+","+name+","+salary;		
	}
	

}
