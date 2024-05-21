package employeemanagement;

public class mainemployee {
	public static void main(String []args)
	{
		System.out.println("--------------------------------------------------------");
		
		Employeecreation ec=new Employeecreation();
		employeemanagement e1=ec.createemployee("ramesh", 10000.00,3, "SSE","jspiders");
		employeemanagement e2=ec.createemployee("mahesh", 50000.00,2, "ASE","jspiders");
		employeemanagement e3=ec.createemployee("mukesh", 15000.00,2, "JSE","jspiders");
		employeemanagement e4=ec.createemployee("suresh", 20000.00,2.5,"JSE","jspiders");
		employeemanagement e5=ec.createemployee("suresh", 25000.00,4, "JSE","jspiders");
		employeemanagement e6=ec.createemployee("Pablo",  25000.00,8, "ASE","jspiders");
		employeemanagement e7=ec.createemployee("Souvik", 30000.00,8, "SSE","jspiders");
		employeemanagement e8=ec.createemployee("subha",  30000.00,5, "SSE","jspiders");
		//creating database of capacity 10
		employeedb edb=new employeedb(10);
		
		//storing employees in database
		edb.addemployee(e1);
		edb.addemployee(e2);
		edb.addemployee(e3);
		edb.addemployee(e4);
		edb.addemployee(e5);
		edb.addemployee(e6);
		edb.addemployee(e7);
		edb.addemployee(e8);
		System.out.println();
		System.out.println("total employee"+edb.getemployeecount());
		
		edb.viewfulldatabase();
		
		System.out.println();
		employeemanagement e=edb.searchemployee(1005);
		System.out.println(e.getId()+" "+e.getName());
		
		edb.updatesalary(1003,5000.00);
		edb.viewfulldatabase();
		edb.deleteEmployee(1003);
		edb.viewfulldatabase();
		System.out.println("total employees: "+edb.getemployeecount());

		System.out.println("------------------------------------------");
	}
	

}
