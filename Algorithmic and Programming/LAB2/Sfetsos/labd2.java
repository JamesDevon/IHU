import java.util.Scanner;
public class labd2
{
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Meres : " );
		int meres = scan.nextInt();
		double deutera=meres*24*3600;
		int xlm = 300000;
		int ml= 186000;
		double apostasi=deutera*xlm;
		double apostasiml=deutera*ml;
		System.out.println("\n"+"Apostasi= (xlm)"+apostasi+" (ml)"+apostasiml );
	}
}