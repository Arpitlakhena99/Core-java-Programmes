package banking;

public class SavingAccount extends Account{
	public SavingAccount(String accnum, double accbal, String custname, boolean isActive)
	{
		super(accnum, accbal, isActive, custname);
		}
	@Override
	public void deposit(double amt)
	{
		System.out.println("deposit rs" +amt);
		this.setAccbal(this.getAccbal()+amt);
	}

	@Override
	public void withdraw(double amt)
	{
	System.out.println("withdrawing Rs"+amt);
	if(amt<this.getAccbal())
	{
		this.setAccbal(this.getAccbal()-amt);
	}
	else {
		System.out.println("failed due to insufficient balance");
	}
	}
	}
