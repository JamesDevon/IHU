class Add5
{
	int x,y;
	Add5(int xx, int yy)
	{
		x=xx;
		y=yy;
	}
	
	void add(int num1, int num2)
	{
		int sum=num1+num2;
		System.out.println(sum);
	}
}
class Add5Test
{
	
	public static void main(String[] args)
	{
		Add4 ad = new Add4(6,5);
		ad.add(6,5);
		int ml=multiply(6,5);
		System.out.println(ml);
	}
	
	public static int multiply(int num1, int num2)
	{
		int mlp=num1*num2;
		return mlp;
	}
}