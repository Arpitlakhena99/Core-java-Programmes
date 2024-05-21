package banking;

	public class SavingAccountCreation {
		private static int randnum=10001;
		final private static String acctype="SAV0000";
		// method to access account for saving account
		public SavingAccount createSavingAccount(String custname,double accbal) {
			SavingAccount sav = new SavingAccount(acctype+randnum++,accbal,custname,true);
			return sav;
		}
	}

