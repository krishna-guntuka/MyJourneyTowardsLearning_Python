 package accounts;


public class AccountTester {

	public static void main(String[] args) {
		
		double intBalance=0.0d;
		double totalBalance = 0.0d;
		// credit scenario savings account with out interest
		SavingsAccount savingsAcc = new SavingsAccount(100.0, 1.0);
		savingsAcc.credit(20.0);
		System.out.println("Account balance after credit amount to savings account without interest = " +savingsAcc.getBalance());
		
		// credit scenario savings account with interest
		SavingsAccount savingsAcc2 = new SavingsAccount(100.0, 0.5);
		intBalance = savingsAcc2.calculateInterest();
		totalBalance = savingsAcc2.getBalance();
		totalBalance+=intBalance;
		System.out.println("Account balance after credit amount to savings account with interest = " +totalBalance);
		
		// Debt scenario savings account without interest
		SavingsAccount savingsAcc1 = new SavingsAccount(200.0, 3.0);
		savingsAcc1.debit(50.0);
		System.out.println("Account balance after debit amount to savings account without interest = " +savingsAcc1.getBalance());
		
		// debit scenario savings account with interest
		SavingsAccount savingsAcc3 = new SavingsAccount(50.0, 0.5);
		savingsAcc3.debit(10);
		intBalance = savingsAcc3.calculateInterest();
		totalBalance = savingsAcc3.getBalance();
		totalBalance+=intBalance;
		System.out.println("Account balance after credit amount to savings account with interest = " +totalBalance);
		
		// debit scenario savings account with interest
				SavingsAccount savingsAcc4 = new SavingsAccount(50.0, 0.5);
				savingsAcc4.debit(-10);
				intBalance = savingsAcc4.calculateInterest();
				totalBalance = savingsAcc4.getBalance();
				totalBalance+=intBalance;
				System.out.println("Account balance after credit amount to savings account with interest = " +totalBalance);
				
				
		//debit scenario checking account 
		CheckingAccount checkingAcc = new CheckingAccount(50.0, 5);
		checkingAcc.debit(30.0);
		System.out.println("Account balance after debit amount to checkings account = " +checkingAcc.getBalance());
		
		// credit scenario checking account
		CheckingAccount checkingAcc1 = new CheckingAccount(60.0, 5);
		checkingAcc1.debit(50.0);
		System.out.println("Account balance after debit amount to checkings account = " +checkingAcc1.getBalance());
		

		// credit scenario checking account
		CheckingAccount checkingAcc2 = new CheckingAccount(60.0, 5);
		checkingAcc2.debit(-50.0);
		System.out.println("Account balance after debit amount to checkings account = " +checkingAcc1.getBalance());
		
	}

}
