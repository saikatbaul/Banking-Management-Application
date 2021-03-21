public abstract class Account implements ITransactions 
{
	public int accountNumber;
	public double balance;

	public Account()
	{
	}

	public Account(int accountNumber, double balance)
	{
		this.accountNumber=accountNumber;
		this.balance = balance;
	}
	
	void setAccountNumber(int accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	
	void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	int getAccountNumber()
	{
		return accountNumber;
	}
	
	double getBalance()
	{
		return balance;
	}
	
	abstract void showInfo();
	
	public void deposit(double amount)
	{
		if(amount > 0)
		{
			this.balance=(balance+amount);
			System.out.println("Deposit Successful");
		}
		else if(amount <= 0)
		{
			System.out.println("Wrong Balance Entry!");
		}
	}
	
	public void withdraw(double amount)
	{
		if(balance > amount)
		{
			this.balance=(balance-amount);
			System.out.println("Withdrawal Successful");
		}
		else if (balance < amount)
		{
			System.out.println("You Don't Have Sufficient Balance!");
		}
		else if (amount <= 0)
		{
			System.out.println("Wrong Balance Entry!");
		}
	}
	
	public void transfer(Account a,double amount)
	{
		if(balance > amount)
		{
			a.balance = a.balance + amount;
			this.balance = this.balance - amount;
			System.out.println("Transfer Successful");
		}
		else if (balance < amount)
		{
			System.out.println("Transaction Failed !");
		}
		else if (amount <= 0)
		{
			System.out.println("Wrong Balance Entry!");
		}
	}
}

