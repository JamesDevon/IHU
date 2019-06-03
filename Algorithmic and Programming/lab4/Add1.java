class Add1
{
	public static int add(int num1, int num2)
	{
		int result=num1+num2;
		return result;
	}
	
	public static void main(String[] args)
	{
		int x=5;
		int y=6;
		int sum=add(x,y);
		System.out.println(sum);
	}
}