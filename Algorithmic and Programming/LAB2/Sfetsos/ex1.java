import java.util.Scanner;
public class ex1
{
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println(" Misthos = ");
		double misthos = scan.nextDouble();
		int d = (int)(misthos/50);
		System.out.println(" 50 : "+d+"\n");
		misthos=(double)(misthos%50);
		d=(int)(misthos/20);
		System.out.println(" 20 : "+d+"\n");
		misthos=(double)(misthos%20);
		d=(int)(misthos/10);
		System.out.println(" 10 : "+d+"\n");
		misthos=(double)(misthos%10);
		d=(int)(misthos/5);
		System.out.println(" 5 : "+d+"\n");
		misthos=(double)(misthos%5);
		d=(int)(misthos/2);
		System.out.println(" 2 : "+d+"\n");
		misthos=(double)(misthos%2);
		System.out.println(" 1 : "+misthos+"\n");
		misthos=(double)(misthos%1);
		d=(int)(misthos/0.5);
		System.out.println(" 0.50 : "+d+"\n");
		misthos=(double)(misthos%0.5);
		d=(int)(misthos/0.2);
		System.out.println(" 0.20 : "+d+"\n");
		misthos=(double)(misthos%0.2);
		d=(int)(misthos/0.1);
		System.out.println(" 0.10 : "+d+"\n");
		misthos=(double)(misthos%0.1);
		d=(int)(misthos/0.05);
		System.out.println(" 0.05 : "+d+"\n");
	}
}
		