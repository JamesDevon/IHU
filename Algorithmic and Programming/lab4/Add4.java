class Add4
{
	int x,y;
	Add4(int xx, int yy)
	{
		x=xx;
		y=yy;
	}
	
	void add(int num1, int num2)
	{
		int sum=num1+num2;
		System.out.println(sum);
	}
	
	public static void main(String[] args)
	{
		Add4 ad = new Add4(6,5);
		ad.add(6,5);
	}
}