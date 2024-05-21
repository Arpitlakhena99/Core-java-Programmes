package transaction;
import banking.Account;
import banking.LoanAccount;
import banking.SavingAccount;
public class FundTransferTransaction {
	public void fundTransfer(Account fromAcc, Account toAcc, double amount)
	{
		if(fromAcc.isActive() && toAcc.isActive())
		{
			if(fromAcc instanceof SavingAccount && toAcc instanceof SavingAccount)
			{
				fromAcc.withdraw(amount);
				toAcc.deposit(amount);
			}
			else if (fromAcc instanceof SavingAccount && toAcc instanceof LoanAccount)
			{
				fromAcc.withdraw(amount);
				toAcc.deposit(amount);
			}
			else
			{
				System.out.println("Invalid fund transfer");
			}
		}
	}

}
