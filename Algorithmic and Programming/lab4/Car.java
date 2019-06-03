class Car
{
	double xlm;
	int kmh;
	
	Car(double x, int k)
	{
		xlm=x;
		kmh=k;
	}
	
	public void Gas()
	{
		kmh+=45;
	}
	
	public int MaxSpeed()
	{
		return kmh;
	}
	
	public void gedXlm(double d)
	{
		xlm+=d;
	}
	
	public void getXlmMax()
	{
		System.out.println("\n"+"Xlm : "+xlm+"\n"+"Max Speed : "+kmh+"\n");
	}
	
	public static void main(String[] args)
	{
		Car Lambo = new Car(14,80);
		Lambo.Gas();
		Lambo.Gas();
		Lambo.Gas();
		Lambo.gedXlm(25);
		Lambo.getXlmMax();
	}
}