public class circle1
{
	int radius;
	
	circle1(int r)
	{
		radius=r;
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
		
		circle1 kyklos= new circle1(100);
		System.out.println(" Aktina = " +kyklos.getRadius()+"\n"+" Diametros = "+kyklos.getDiameter()+"\n"+" Emvadon = "+kyklos.getArea());
	}
}