import java.util.Scanner;
public class Start
{
	public static void main (String [] args)
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Case Number 1 For Employee Management");
		System.out.println("Case Number 2 For Customer Management");
		System.out.println("Case Number 3 For Customer Account Management");
		System.out.println("Case Number 4 For Account Transactions");
		System.out.println("Case Number 5 For Exit");
		int management = s1.nextInt();
		String managementString;
		switch (management) 
		{
			case 1: managementString = "Employee Management";
					System.out.println(managementString);
					Employee e1=new Employee("Jamal",101,20000);
					Employee e2=new Employee("Bristi",102,24000);
					Employee e3=new Employee("Fahim",103,26000);
					Employee e4=new Employee("Dhiman",104,27000);
					Employee e5=new Employee("Zisan",105,15000);
					Bank b1= new Bank();
					b1.insertEmployee(e1);
					b1.insertEmployee(e2);
					b1.insertEmployee(e3);
					b1.insertEmployee(e4);
					b1.insertEmployee(e5);
					System.out.println("Insert Done!");
					b1.removeEmployee(e4);
					System.out.println("Remove Done!");
					b1.showAllEmployees();
		    break;
									
			case 2: managementString = "Customer Management";
				    System.out.println(managementString);
					Customer c1=new Customer("Wakil",12230502);
					Customer c2=new Customer("Sajjad",22450503);
					Customer c3=new Customer("Mehedi",32690606);
					Customer c4=new Customer("Nayeem",42723420);
					Customer c5=new Customer("Imran",51456099);
					Bank b2= new Bank();
					b2.insertCustomer(c1);
					b2.insertCustomer(c2);
					b2.insertCustomer(c3);
					b2.insertCustomer(c4);
					b2.insertCustomer(c5);
					System.out.println("Insert Done!");
					b2.removeCustomer(c2);
					System.out.println("Remove Done!");
					b2.showAllCustomers();
			break;
	
			case 3: managementString = "Customer Account Management";
					System.out.println(managementString);
					System.out.println("Insert 1 for Savings Account");
					System.out.println("Insert 2 for Fixed Account");
					Scanner p= new Scanner(System.in);
					int b = p.nextInt();
					if (b==1)
					{
					Scanner e= new Scanner(System.in);
					SavingsAccount a1=new SavingsAccount(1,12000,2.5);
					SavingsAccount a2=new SavingsAccount(2,22000,2.5);
					Customer c9=new Customer("Imran",51456099);
					c9.insertAccount(a1);
					c9.insertAccount(a2);
					System.out.println("Insert Done!");
					c9.removeAccount(a2);
					System.out.println("Remove Done!");
					c9.showAllAccounts();
					}
					else if(b==2)
					{
					Scanner f= new Scanner(System.in);
					FixedAccount z1=new FixedAccount(1,120000,5);
					FixedAccount z2=new FixedAccount(2,200000,10);
					Customer c8=new Customer("Mehedi",32690606);
					c8.insertAccount(z1);
					c8.insertAccount(z2);
					System.out.println("Insert Done!");
					c8.removeAccount(z1);
					System.out.println("Remove Done!");
					c8.showAllAccounts();	
					}
			break;
						
			case 4: managementString = "Account Transactions";
					System.out.println(managementString);
					Scanner s5= new Scanner(System.in);
					System.out.println("Case Number 1 for Deposit Money");
					System.out.println("Case Number 2 for Withdraw Money");
					System.out.println("Case Number 3 for Transfer Money");
					int accounttransactions = s5.nextInt();
					String accounttransactionsString;
					switch (accounttransactions) 
					{
						case 1: accounttransactionsString = "Deposit Money ";
								System.out.println(accounttransactionsString);
								Scanner s10= new Scanner(System.in);
								System.out.println("Case Number 1 for Savings Account");
								System.out.println("Case Number 2 for Fixed Account");
								int depositmoney = s10.nextInt();
								String depositmoneyString;
								switch (depositmoney) 
								{
									case 1: depositmoneyString = "Savings Account ";
											System.out.println(depositmoneyString);
											SavingsAccount x1= new SavingsAccount(101,10000,2.5);
											x1.deposit(5000);
											x1.showInfo();
											break;
									case 2: depositmoneyString = "Fixed Account";
											System.out.println(depositmoneyString);
											FixedAccount x2= new FixedAccount(102,100000,10);
											x2.showInfo();
											break;
									default: depositmoneyString = "Invalid Operation";
											System.out.println(depositmoneyString);
											break;
								}
								break;
						case 2: accounttransactionsString = "Withdraw Money";
								System.out.println(accounttransactionsString);
								Scanner s11= new Scanner(System.in);
								System.out.println("Case Number 1 for Savings Account");
								System.out.println("Case Number 2 for Fixed Account");
								int withdrawmoney = s11.nextInt();
								String withdrawmoneyString;
								switch (withdrawmoney) 
								{
									case 1: withdrawmoneyString = "Savings Account ";
											System.out.println(withdrawmoneyString);
											SavingsAccount x1= new SavingsAccount(101,10000,2.5);
											x1.withdraw(5000);
											x1.showInfo();
											break;
									case 2: withdrawmoneyString = "Fixed Account";
											System.out.println(withdrawmoneyString);
											FixedAccount x2= new FixedAccount(102,100000,10);
											x2.withdraw(50000);
											x2.showInfo();
											break;
									default: withdrawmoneyString = "Invalid Operation";
											System.out.println(withdrawmoneyString);
											break;
								}
								break;
						case 3: accounttransactionsString = "Transfer Money";
						        System.out.println(accounttransactionsString);
								SavingsAccount x1= new SavingsAccount(101,10000,2.5);
								SavingsAccount x2= new SavingsAccount(101,100000,3.5);
								x2.transfer(x1,50000);
								x2.showInfo();
								x1.showInfo();
								break;
						default: accounttransactionsString = "Invalid Operation";
								System.out.println(accounttransactionsString);
								break;			
					}
					break;
						
			case 5: managementString = "Exit";
					System.out.println(managementString);
			break;
						
			default: managementString = "Invalid Operation";
					System.out.println(managementString);
			break;
		}
	}
}
	
