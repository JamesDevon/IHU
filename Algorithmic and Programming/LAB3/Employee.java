class Employee
{
	String FirstName, LastName;
	double Salary;
	
	Employee(String F, String L, double S)
	{
		FirstName=F;
		LastName=L;
		Salary=S;
	}
	
	String getFirstName()
	{
		return FirstName;
	}
	
	String getLastName()
	{
		return LastName;
	}
	
	double getSalary()
	{
		return Salary;
	}
}

class TestEmployee
{
	public static void main(String[] args)
	{
		Employee ergazomenos=new Employee("James","Balashi",3600);
		System.out.println(" Onoma : "+ergazomenos.getFirstName()+"\n"+" Eponumo : "+ergazomenos.getLastName()+"\n"+" Misthos = "+ergazomenos.getSalary());
	}
}
		
		
		
		
		
		
