import java.util.Scanner;
public class labc2
{
	public static void main(String[] args)
	{
		 Scanner scan= new Scanner(System.in);
		 
		//Reading Data
		System.out.println("\n"+"Meres Ergasia = ");
		int meres = scan.nextInt();
		System.out.println("Imeromusthio = ");
		double imeromisthio = scan.nextDouble();
		System.out.println("Yperories = ");
		double uperories = scan.nextDouble();
		System.out.println("Pliromi uperorias = ");
		double pluper = scan.nextDouble();
		
		//calculation
		double vasikos= meres*imeromisthio;
		double misthosiper = pluper*uperories;
		double akmisthos = vasikos + misthosiper;
		
		//Out
		System.out.println("\n"+"Vasikos Misthos = "+vasikos+"\n"+"Misthos uperorion = "+misthosiper+"\n"+"Akatharistos misthos = "+akmisthos+"\n");
	}
}
		
		
		