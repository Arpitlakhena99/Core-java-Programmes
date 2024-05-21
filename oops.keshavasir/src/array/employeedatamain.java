package array;

public class employeedatamain {
	public static void main(String[]args)
	{
	employeedata []emparr=new employeedata[5];
	emparr[0]=new employeedata(101,"Biswa",25000.00);
	emparr[1]=new employeedata(102,"Nabeel",15000.00);
	emparr[2]=new employeedata(103,"Mayank",50000.00);
	emparr[3]=new employeedata(104,"Arpit",20000.00);
	emparr[4]=new employeedata(105,"Mohan",22000.00);

	System.out.println("Employee Details");

	for(employeedata emp:emparr)
	{
		System.out.println(emp);
	}
	System.out.println("Employee Details");
	System.out.println("-------------------------");
	System.out.println("Id\tName\tSalary");
	System.out.println("-------------------------");
	
	for(employeedata emp :emparr)
	{
		if(emp!=null)
		System.out.println(emp.id+"\t"+emp.name+"\t"+emp.salary);
	}
	}

}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
