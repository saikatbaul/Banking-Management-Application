public class Bank implements CustomerOperations,EmployeeOperations{	private Customer[] customers;	private Employee[] employees;	private int c1;	private int e1;		public Bank()	{		this.customers = new Customer[1000];		this.employees = new Employee[1000];	}			public void insertCustomer(Customer c)	{		if(c1<customers.length)		{			this.customers[c1]=c;			c1++;		}		else		{				System.out.println("Not possible ....");		}	}		public void removeCustomer(Customer c)	{		for (int i = 0; i < c1; i++) 		{			if (c==this.customers[i]) 			{			customers[i] = customers[--c1];			}			else			{				System.out.println("No Data Found....");			}		}	}		public Customer getCustomer(int nid)	{       for (int i = 0; i < c1; i++) 		{			if (nid == customers[i].getNid()) 			{				return customers[i];			}		}			System.out.println("Customer not found!");			return null;    }		public void showAllCustomers()	{		for(int i=0;i<c1;i++)		{    	 	this.customers[i].showCustomerInfo();		}	}		public void insertEmployee(Employee e)	{		if(e1<employees.length)		{			this.employees[e1]=e;			e1++;		}		else		{				System.out.println("Not possible ....");		}	}		public void removeEmployee(Employee e)	{		for (int i = 0; i < e1; i++) 		{			if (e==this.employees[i]) 			{				employees[i] = employees[--e1];			}			else			{				System.out.println("No Data Found....");			}		}	}		public Employee getEmployee(int empId)	{       for (int i = 0; i < e1; i++) 		{			if (empId == employees[i].getEmpId()) 			{				return employees[i]; 			}        }		System.out.println("Emplyee not found!");		return null;    }		public void showAllEmployees()	{		for(int i=0;i<e1;i++)		{    	 	this.employees[i].showEmployeeInfo();		}	}}