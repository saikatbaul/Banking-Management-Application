public class Employee
{
    public String name;
    public int empId;
    public double salary; 
	
	public Employee()
	{
	
	}

	public Employee(String name, int empId, double salary)
	{
		this.name=name;
		this.empId=empId;
		this.salary=salary;
	}
	
	void setName(String name)
	{
		this.name=name;
	}
	
	void setEmpId(int empId)
	{
		this.empId=empId;
	}
	
	void setSalary(double salary)
	{
		this.salary=salary;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getEmpId()
	{
		return empId;
	}
	
	public double getSalary()
	{
		return salary;
	}

	public void showEmployeeInfo()
	{
		System.out.println("Employee Name: "+this.name);
		System.out.println("Employee ID: "+this.empId);
		System.out.println("Salary: "+this.salary);
	}	
}