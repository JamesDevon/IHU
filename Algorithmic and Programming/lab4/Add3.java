class Add3
{
	int x,y;
	Add3(int xx, int yy)
	{
		x=xx;
		y=yy;
	}
	
	int add(int num1, int num2)
	{
		int sum;
		return sum=x+y;
	}
	
	public static void main(String[] args)
	{
		Add3 ad = new Add3(6,5);
		int s=ad.add(6,5);
		System.out.println(s);
	}
}