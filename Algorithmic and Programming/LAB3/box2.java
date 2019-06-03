public class box2
{
	double width, height, depth;
	
	double volume()
	{
		return (width*height*depth);
	}
	public static void main(String[] args)
	{
		double vol;
		box2 mybox1= new box2();
		box2 mybox2 = new box2();
		
		mybox1.width = 10;
		mybox1.height = 20;
		mybox1.depth = 15;
		mybox2.width = 3;
		mybox2.height = 6;
		mybox2.depth = 9;
		vol=mybox1.volume();
		System.out.println(" Ogkos1 = "+vol);
		vol=mybox2.volume();
		System.out.println(" Ogkos1 = "+vol);
	}
}