package banking;
public class LoanAccountClose {
	public boolean closeLoanAccount(LoanAccount la) {
		boolean isSuccess=true;
		la.setActive(false);
		if(la.isActive()==true) {
			isSuccess=false;
		}
		return isSuccess;
	}
}