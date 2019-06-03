class CheckingAccount
{
	String BankName, BankAccount;
	double deposit, BankBalance;
	
	CheckingAccount(String n, String a, double b, double d )
	{
		BankName=n;
		BankAccount=a;
		BankBalance=b;
		deposit=d;
	}
	
	String getBankName()
	{
		return BankName;
	}
	String getBankAccount()
	{
		return BankAccount;
	}
	double getBankBalance()
	{
		return BankBalance;
	}
	double getDeposit()
	{
		return deposit;
	}
	double getCurrentBankBalance()
	{
		return deposit+BankBalance;
	}
}

class CheckingAccountTest
{
	
	public static void main(String[] args)
	{
		CheckingAccount d1=new CheckingAccount("James Balashi","310/754988",34298.48,300);
		System.out.println("\n"+" BankName : "+d1.getBankName()+"\n"+" BankAccount : "+d1.getBankAccount()+"\n"+" Bank Balance : "+d1.getBankBalance()+"\n"+" Deposit : "+d1.getDeposit()+"\n"+" Bank Balance : "+d1.getCurrentBankBalance()+"\n");
	}
}