class ToStringExample 
{
	 String firstName;
	 String lastName;
	 ToStringExample(String fn, String ln) 
	 {
		firstName = fn;
		lastName = ln;
	}

	 public String toString() 
	 {
		return lastName + " " + firstName; 
	}
}
class ToString 
{
	 public static void main(String[] args)
	{
		 ToStringExample ypallilos = new ToStringExample("Nikos", "Nikas");
		 System.out.println("Ta stoixeia toy Ypallilou: " + ypallilos);
	}
}