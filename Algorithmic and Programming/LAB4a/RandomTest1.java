import java.util.Random;
class RandomTest1
{
	public static void main(String[] args)
	{
		Random rnd = new Random();
		int x;
		x=rnd.nextInt();
		System.out.println("x= "+x);
		x=rnd.nextInt(100);
		System.out.println("x= "+x);
	}
}