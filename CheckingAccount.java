package accounts;

public class CheckingAccount extends Account {

/* Declaring a Private variable fee_charged of decimal value*/
	private double fee_charged=0.0d;
	
	/* Constructor with initial balance of the account and
	 *  the fee charged per transaction*/
	public CheckingAccount(double initial_bal, double fee_charged)
	{
		super(initial_bal);
		this.fee_charged=fee_charged;
	}
	/* Declaring Method Credit with a single parameter (amount to credit) 
	 * of double type*/
	public void credit(double amount)
	{
		double bal = getBalance();
		/*condition for the fee charged for a transaction*/
		if(fee_charged>bal+amount)
		{
			System.out.println("Insuffecient Balance. Transaction Cannot be processed");
		}
		else
		{
			credit(amount);
			setBalance(bal-fee_charged);
		}
		
	}
	
	/* Method Debit with amount ( to be debited) and the fee 
	 * charged for the transaction of double type*/
	public void debit(double amount, double fee_charged)
	{
		double bal = getBalance();
		/*condition for the fee charged for a transaction*/if(fee_charged>bal-amount)
		{
			System.out.println("Insuffecient Balance. Transaction Cannot be processed");
		}
		else
		{
			super.debit(amount);
			setBalance(bal-fee_charged);
		}
	}
}
