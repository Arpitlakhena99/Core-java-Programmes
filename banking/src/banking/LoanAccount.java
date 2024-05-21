package banking;
public class LoanAccount extends Account
{
	private int tenure;
	public LoanAccount(String accnum, double accbal, boolean isActive,String custname, int tenure)
	{
		super(accnum,accbal,isActive,custname);
		this.tenure=tenure;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public void deposit(double amt)
	{
		System.out.println("depositing rs" +amt);
		this .setAccbal(this.getAccbal()- amt);
	}
	public void withdraw(double amt)
	{
		System.out.println("withdraw rs"+amt);
		this.setAccbal(this.getAccbal()+amt);
}	
}