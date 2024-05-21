package transaction;
import banking.Account;

public class AccountDepositTransaction {
	public void depositTxn(Account a,double amt)
	{
		if(a.isActive())
		a.deposit(amt);
		else
			System.out.println("inactive bank account");
	}

}
