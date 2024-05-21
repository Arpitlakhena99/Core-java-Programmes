package transaction;
import banking.Account;
public class AccountWithdrawTransaction {
public void withdrawTxn(Account a,double amt)
{
	if(a.isActive())
	a.withdraw(amt);
	else
		System.out.println("inactive bank acount");
}
}
