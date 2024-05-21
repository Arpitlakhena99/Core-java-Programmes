package employeemanagement;

public class employeedb {
	
private employeemanagement []emparr;
private int index=0;
private int empcount=0;
	employeedb(int size)
	{
		emparr=new employeemanagement[size];	
	}
	/**
	 * this method is used to add employee details into the database
	 *
	 * @param e should employee type
	 * @return  returns type if added successfully,else return false
	 */
	public boolean addemployee(employeemanagement e)
	{
		if(index<emparr.length)
		{
		emparr[index++]=e;
		System.out.println("Employee details added to DB");
		return true;
	}
		else
		{
			System.out.println("database is full;");
			return false;
		}
	}
	public void viewfulldatabase()
	{
		System.out.println("------------------------------------------");
		System.out.println("ID\tSalary\tExp+\tDesignation\tCompanyname");
		for(employeemanagement emp:emparr)
		{
			if(emp!=null)
			{
				System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getSalary()+"\t"+emp.getExp()+"\t"+emp.getDesignation()+"\t"+emp.getCompname());
			}
		}
	}
	/**
	 * this method used to get total employee in database
	 * @param return int value representing total employees
	 */
	public int getemployeecount()
	{
		return index;
	}
	public employeemanagement searchemployee(int id)
	{
		employeemanagement e=null;
		for(int i=0;i<emparr.length;i++)
		{
			if(emparr[i]!=null && emparr[i].getId()==id) {
				System.out.println("employee found in database");
				e=emparr[i];
			}
		}
		if(e==null)
		{
			System.out.println("employee not found in database");
		}
		return e;	
	}
	/**
	 * this methid is used  to update the salary of the employees ,if employees is found in database
	 * it will update the salary of the employees specified amount
	 * @param id-employee id whose salary is to be updated
	 * @param
	 * 3
	 */
	public boolean updatesalary(int id,double amount)
	{
		employeemanagement e= searchemployee(id);
		if(e!=null)
		{
			e.setSalary(e.getSalary()+amount);
			System.out.println("salary updated");
			return true;
		}
		else
		{
			System.out.println("unable to updated check you employee id");
		return false;
	}	
	}
	/**
	 * this method is used to delete employee details from the database.
	 * it deletes the complete employee details if the record is found in database.
	 * @param id of the employees is to be deleted 
	 * @return true if employee is success
	 * false-if employee is failed
	 */
public boolean deleteEmployee(int id)
{
	boolean isDeleted=false;
	for(int i=0;i<emparr.length;i++)
	{
		if(emparr[i]!=null && emparr[i].getId()==id)
		{
			System.out.println("employee found in database and deleted");
			emparr[i]=null;
			//index--
		}
	}
if (isDeleted == false)
{
	System.out.println("employees is not found in databse");
}
return isDeleted;
}
}
