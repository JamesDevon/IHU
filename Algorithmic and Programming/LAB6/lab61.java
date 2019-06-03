import java.io.*;
class ProblimaDisektouEtous
{
	public static void main(String args[]) throws IOException
	{
		int arMonth, Year, Days=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Dose ton ar. tou mina (1-12): ");
		arMonth = Integer.parseInt(br.readLine());
		System.out.println("Dose to etos: ");
		Year = Integer.parseInt(br.readLine());
		
		switch(arMonth)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			Days=31;
			break;
			case 4:
			case 6:
			case 9:
			case 11:
			Days=30;
			break;
		}
		
	System.out.println("O minas exei: " + Days + " meres");
	if (((Year % 4 == 0) && !(Year % 100 == 0))|| (Year % 400 == 0)) Days = 29; else Days = 28;
	if (Days==29)
	System.out.println("To etos " + Year + " einai disekto" + " kai exei: " + Days + " meres");
	else
	System.out.println("To etos " + Year + " den einai disekto" + " kai exei: " + Days + " meres");
	}
}