package accounts;

public class SavingsAccount extends Account 
{
	private double interest=0.0d;
	
	/* Constructor with the initial balance and initial 
	 * rate of interest as parameters*/
	
	public SavingsAccount(double initial_bal, double interest) {
		super(initial_bal);
		
		this.interest = interest;
		
	}
	 /* Method calaculateInterest to calaculate the amount earned by the account*/
	public double calculateInterest()
	{
		return getBalance()*interest;
	}
	

}
