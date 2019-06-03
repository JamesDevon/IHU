public class box1
{
	double width, height, depth;
	
	void volume()
	{
		System.out.println("Ogkos : "+(width*height*depth));
	}
	public static void main(String[] args)
	{
		box1 mybox1= new box1();
		box1 mybox2 = new box1();
		
		mybox1.width = 10;
		mybox1.height = 20;
		mybox1.depth = 15;
		mybox2.width = 3;
		mybox2.height = 6;
		mybox2.depth = 9;
		mybox1.volume();
		mybox2.volume();
	}
}