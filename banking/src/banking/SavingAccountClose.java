package banking;
	public class SavingAccountClose {
		//method to close the saving account
		public boolean closeSavingAccount(SavingAccount sa) {
			boolean isSuccess=true;
			sa.setActive(false);;
			if(sa.isActive()==true)
				isSuccess=false;
			return isSuccess;
		}
	}
