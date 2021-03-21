public class SavingsAccount extends Account
{
	public double interestRate;
	
	public SavingsAccount()
	{
	}
	
	public SavingsAccount(int accountNumber, double balance, double interestRate)
	{
		super(accountNumber,balance);
		this.interestRate = interestRate;
	}
	
	public void setInterestRate(double interestRate)
	{
		this.interestRate = interestRate;
	}
	
	public void getInterestRate()
	{
	    System.out.println("Interest Rate :"+this.interestRate);
	}	
	
	void showInfo()
	{
		System.out.println("Acount Number :"+this.accountNumber);
		System.out.println("Balance :"+this.balance);
		System.out.println("Interest Rate :"+this.interestRate);
	}
}