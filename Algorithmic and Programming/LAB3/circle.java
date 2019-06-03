public class circle
{
	int radius;

	void setRadius(int y)
	{
		radius=y;
	}
	int getRadius()
	{
		return radius;
	}
	int getDiameter()
	{
		return radius*2;
	}
	double getArea()
	{
		return 3.14159 * radius * radius;
	}
	
	public static void main(String[] args)
	{
		
		circle kyklos= new circle();
		kyklos.setRadius(100);
		System.out.println(" Aktina = " +kyklos.getRadius()+"\n"+" Diametros = "+kyklos.getDiameter()+"\n"+" Emvadon = "+kyklos.getArea());
	}
}