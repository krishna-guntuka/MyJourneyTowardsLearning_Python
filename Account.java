//Programmer : Krishna Kumar Reddy, Guntuka.

package accounts;

/*Account class implementing IBalance Interface and will be extended 
 * by checking and savings account classes*/
public class Account implements IBalance {
	private double acc_bal=0.0d;
	
/*  Constructor that receives an initial balance 
 * and uses it to initialize the instance variable with the initial balance.*/
	public Account(double initial_bal) {
		this.acc_bal = initial_bal;
	}
	
	/*Method Credit (to add money to the account balance) 
	 * with a single parameter of double type*/
	public void credit(double amount)
	{
		/*Money deposited should be valid and it should not be zero*/
		if(amount<0)
		{
			System.out.println("Please provide valid amount");
		}
		acc_bal+=amount;
	}
	
	/*Method Debt (to withdraw money from the account balance)
	 * with a single parameter of double type*/
	public void debit(double amount)
	{
		/* Money for withdraw should be less than the account balance 
		 * inclusive of the transaction fee*/
		 if(amount>acc_bal)
		{
			System.out.println("Debit amount exceeded account balance");
		}
		 /*Money withdrawn should be valid and it should not be zero*/
		 else if(amount<0)
		{
			System.out.println("Please provide valid amount");
		}
		 /*Money withdrawn should be deducted from the account balance*/
		 else
		{
			acc_bal-=amount;
		}
	}
	/* Setter and getter functions to return the balance*/
	public void setBalance(double bal)
	{
		this.acc_bal = bal;
	}

	public double getBalance() {
	
		return acc_bal;
	}
}

