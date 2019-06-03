public class box4
{
	double width, height, depth;
	
	box4(double w, double h, double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	
	
	double volume()
	{
		return (width*height*depth);
	}
	public static void main(String[] args)
	{
		double vol;
		box4 mybox1= new box4(10,20,15);
		box4 mybox2 = new box4(3,6,9);
		
		vol=mybox1.volume();
		System.out.println(" Ogkos1 = "+vol);
		vol=mybox2.volume();
		System.out.println(" Ogkos1 = "+vol);
	}
}