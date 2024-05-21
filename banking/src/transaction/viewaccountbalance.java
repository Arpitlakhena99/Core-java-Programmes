package transaction;
import banking.Account;

public class viewaccountbalance {
	public void viewbalance(Account a)
	{
		if(a.isActive())
		System.out.println("Account Balance Rs"+ a.getAccbal());
		else
			System.out.println("inactive bank account");
	}
	

}
