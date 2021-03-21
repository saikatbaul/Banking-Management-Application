public class FixedAccount extends Account
{
	public int tenureYear;

	public FixedAccount()
	{
		
	}
	
	public FixedAccount(int accountNumber, double balance, int tenureYear)
	{
		super(accountNumber,balance);
		this.tenureYear = tenureYear;
	}
	
	public void setTenureYear(int tenureYear)
	{
		this.tenureYear=tenureYear;
	}
	
	public void getTenureYear()
	{
	    System.out.println("Tenure Year :"+this.tenureYear);
	}
	
	void showInfo()
	{
		System.out.println("Acount Number :"+this.accountNumber);
		System.out.println("Balance :"+this.balance);
		System.out.println("Tenure Year :"+this.tenureYear);
	}
}