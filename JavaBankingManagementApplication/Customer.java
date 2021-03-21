public class Customer implements AccountOperations
{
	public String name ;
	public int nid;
	public Account[] accounts;
	public int a1;

	public Customer(String name, int nid)
	{
		this.name=name;
		this.nid=nid;
		this.accounts = new Account[1000];
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setNid(int nid)
	{
		this.nid=nid;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getNid()
	{
		return this.nid;
	}
	
	public void showCustomerInfo()
	{
		System.out.println("Customer Name: "+this.name);
		System.out.println("NID Number: "+this.nid);
	}
	
	public void insertAccount(Account a)
	{
		if(a1<accounts.length)
		{
			this.accounts[a1]=a;
			a1++;
		}
		else
		{
			System.out.println("Not possible ....");
		}
	}
	
	public void removeAccount(Account a)
	{
		for (int i = 0; i < a1; i++) 
			{
				if (a==this.accounts[i]) 
				{
					accounts[i] = accounts[--a1];
				}
				else
				{
					System.out.println("No Data Found....");
				}
		}
	}
	
	public Account getAccount(int accountNumber)
	{
       for (int i = 0; i < a1; i++) 
		{
			if (accountNumber == accounts[i].getAccountNumber())   
			{
				return accounts[i];
			}
        }
		System.out.println("Account not found!");
		return null;
    }
	
	public void showAllAccounts()
	{
		for(int i=0;i<a1;i++)
		{
    	 	this.accounts[i].showInfo();
		}
	}
}
