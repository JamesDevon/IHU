import java.util.Scanner;
public class ex2
{
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		
		System.out.println("\n"+" 50 : ");
		int m=scan.nextInt();
		int x=(m*50);
		System.out.println(" 20 : ");
		m=scan.nextInt();
		x+=(m*20);
		System.out.println(" 10 : ");
		m=scan.nextInt();
		x+=(m*10);
		System.out.println(" 5 : ");
		m=scan.nextInt();
		x+=m;
		System.out.println(" 2 : ");
		m=scan.nextInt();
		x+=m;
		System.out.println(" 1 : ");
		m=scan.nextInt();
		x+=m;
		System.out.println(" 0.5 : ");
		m=scan.nextInt();
		x+=m;
		System.out.println("\n"+"Misthos = "+x+"\n");
	}
}
		