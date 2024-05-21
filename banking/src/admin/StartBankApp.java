package admin;

import banking.LoanAccountClose;
import banking.LoanAccountCreation;
import banking.LoanAccount;
import banking.SavingAccount;
import banking.SavingAccountClose;
import banking.SavingAccountCreation;
import banking.Account;
import transaction.AccountDepositTransaction;
import transaction.AccountWithdrawTransaction;
import transaction.FundTransferTransaction;
import transaction.viewaccountbalance;

public class StartBankApp {
    public static void main(String[] args) {
        System.out.println("WELCOME TO GLOBAL BANKING SYSTEM");

        SavingAccountCreation sac = new SavingAccountCreation();
        LoanAccountCreation lac = new LoanAccountCreation();
        SavingAccountClose saClose = new SavingAccountClose();
        LoanAccountClose laClose = new LoanAccountClose();
        AccountWithdrawTransaction awt = new AccountWithdrawTransaction(); // Corrected this line
        FundTransferTransaction ftt = new FundTransferTransaction();
        viewaccountbalance vab = new viewaccountbalance();

        SavingAccount sa1 = sac.createSavingAccount("ramesh", 10000.00);
        AccountDepositTransaction adt = new AccountDepositTransaction();
        vab.viewbalance(sa1);
        adt.depositTxn(sa1, 5000);
        vab.viewbalance(sa1);
        awt.withdrawTxn(sa1, 20000.00); // Corrected this line
        vab.viewbalance(sa1);

        SavingAccount sa2 = sac.createSavingAccount("Suresh", 10000.00);
        vab.viewbalance(sa2);
        ftt.fundTransfer(sa1, sa2, 5000.00);
        vab.viewbalance(sa1);
        vab.viewbalance(sa2);
    }
}


























