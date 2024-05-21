package employeemanagement;

public class Employeecreation {
	private static int randnum=1001;
	public employeemanagement createemployee(String name,double salary,double exp,String designation,String compname)
	{
employeemanagement e=new employeemanagement(randnum++,name,salary,exp,designation,compname);
	return e;
	}
	

}
