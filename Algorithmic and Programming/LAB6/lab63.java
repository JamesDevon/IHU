import java.io.*;
class Kratiseis
{
	 static double YpologismosKratisevn(double AKM, int Synt)
	 {
		double KM;
		switch(Synt)
		{
			 case 20:
			 KM = AKM -(AKM * 0.20);
			 break;
			 case 25:
			 KM = AKM - (AKM * 0.25);
			 break;
			 case 30:
			 KM = AKM -(AKM * 0.30);
			 break;
			 default:
			 KM = AKM -(AKM * 0.45);
			 break;
		 }
		 return (KM);
	 }
}

class TestKratiseis
{
 public static void main(String args[]) throws IOException
 {
	 int syntelestis_kratiseon;
	 double aktharistos_misthos, KatharosMisthos;
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 System.out.print("Dose ton akatharisto_mistho (p.x. 2200.0): ");
	 aktharistos_misthos = Double.parseDouble(br.readLine());
	 System.out.print("Dose ton syntelesti krathsevn (mono 20, 25, 30): ");
	 syntelestis_kratiseon = Integer.parseInt(br.readLine());
	 KatharosMisthos = Kratiseis.YpologismosKratisevn(aktharistos_misthos, syntelestis_kratiseon);
	 System.out.println("O katharos misthos einai: " + KatharosMisthos);
 }
}
