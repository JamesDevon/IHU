import java.io.*;
class MenouEpilogon
{
	 public static void main(String args[]) throws IOException
	{
		int epilogh;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println();
		System.out.println();
		System.out.println(" Menou Epilogvn ");
		System.out.println(" -------------- ");
		System.out.println("1 - Ergasia 1");
		System.out.println("2 - Ergasia 2");
		System.out.println("3 - Ergasia 3");
		System.out.println("4 - Ergasia 4");
		System.out.println("5 - Ergasia 5");
		 System.out.println();
		 System.out.println();
		 System.out.print("Dose tin epilogh sou (1-5): ");
		epilogh = Integer.parseInt(br.readLine());
		
		switch(epilogh)
		{
			case 1:
			 System.out.println("Ektelesi Ergasias 1....");
			 break;
			case 2:
			 System.out.println("Ektelesi Ergasias 2....");
			 break;
			 case 3:
			 System.out.println("Ektelesi Ergasias 3....");
			 break;
			case 4:
			 System.out.println("Ektelesi Ergasias 4....");
			 break;
			case 5:
			 System.out.println("Ektelesi Ergasias 5....");
			 break;
			default:
			 System.out.println("Lathos epilogh....");
			 break;
			 
		 }
	 }
}