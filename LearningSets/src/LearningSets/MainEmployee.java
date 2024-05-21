package LearningSets;
import java.util.HashSet;

public class MainEmployee {
public static void main(String[] args) {
	Employee e1=new Employee(3423,"Ramesh",25000.00,1.5);
	Employee e2=new Employee(1234,"mahesh",20000.00,2.5);
	Employee e3=new Employee(2345,"Suresh",15000.00,4.5);
	Employee e4=new Employee(3456,"jagesh",35000.00,0.5);
	Employee e5=new Employee(4567,"pranesh",65000.00,2.5);
	Employee e6=new Employee(5678,"mukesh",55000.00,0.5);
	
	
	HashSet<Employee> empSet=new HashSet<Employee>();
	empSet.add(e1);
	empSet.add(e2);
	empSet.add(e3);
	empSet.add(e4);
	empSet.add(e5);
	empSet.add(e6);
	System.out.println("TOTAL EMPLOYEES :"+empSet.size());
	System.out.println("--------------------------------");
	//System.out.println(Id+"\t"+eName+"\t"+eSalary+"\t"+eExp);
	System.out.println("--------------------------------");
	for(Employee emp :empSet)
	{
		System.out.println(emp.eId+"|"+emp.eName+"|"+emp.eSalary+"|"+emp.eExp);
	}
}
}
