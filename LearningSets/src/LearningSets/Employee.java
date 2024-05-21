package LearningSets;

public class Employee {
	int eId;
	String eName;
	double eSalary;
	double eExp;
	public Employee(int eId, String eName, double eSalary, double eExp) {
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
		this.eExp = eExp;
	}
	public int hashCode()
	{
		return this.eId;
	}
	public boolean equals(Object arg)
	{
		return this.hashCode()==arg.hashCode();
	}
	

}
