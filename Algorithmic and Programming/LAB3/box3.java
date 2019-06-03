public class box3
{
	double width , height, depth;
	
	box3(double w, double h, double d)
		{
			width=w;
			height=h;
			depth=d;
		}
	
	void volume()
	{
		
		System.out.println("Ogkos : "+(width*height*depth));
	}
	public static void main(String[] args)
	{
		box3 mybox1= new box3(10,20,15);
		box3 mybox2 = new box3(3,6,9);
		
		mybox1.volume();
		mybox2.volume();
	}
}