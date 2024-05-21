package workspace;

public class employee {


	String Name;
	String Company;
	int Salary;
	
	public employee(String name, String company, int salary) {
		
		Name = name;
		Company = company;
		Salary = salary;
	}

	public static void main(String[] args) {
		employee e1 = new employee("ROHIT", "tcs", 85000);
		System.out.println(e1.Name+" "+e1.Company+" "+e1.Salary);		
	
}
}
