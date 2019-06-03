class ToStringExample1
{
	 String Onoma;
	 String Epitheto;
	 String Patronymo;
	 int AM;
	 int EtosEisagogis;
	 int Examino;
	 int Mathimata;
	 String Dieythinsi1;
	 String Dieythinsi2;
	 ToStringExample1(String fn, String ln, String pt,int a,int e,int ex, int m, String d1, String d2) 
	 {
		Onoma = fn;
		Epitheto = ln;
		Patronymo=pt;
		AM=a;
		EtosEisagogis=e;
		Examino=ex;
		Mathimata=m;
		Dieythinsi1=d1;
		Dieythinsi2=d2;
	}

	 public String toString()
	{
		 String emf;
		 emf= "Onoma: "+Onoma+" Epitheto: "+Epitheto+" Patronymo: "+Patronymo+"\n";
		 emf+="Ar. Mitroou: "+AM+" Etos Eisagogis: "+EtosEisagogis+"\n";
		 emf+="Examino: "+Examino+" Mathimata: " +Mathimata+"\n";
		 emf+="Dieythinsi1: " + Dieythinsi1+"\n";
		 emf+="Dieythinsi2: " + Dieythinsi2+"\n";
		 return emf;
	}

}
class ToString1
{
	 public static void main(String[] args)
	{
		 ToStringExample1 foititis = new ToStringExample1("James", "Balashi","Arben",262199813,2016,3,7,"Thessaloniki, Paraskeuopoulou 45 , 54 639 , Greece","Hraklion, Anw Archanes , Neas Ionias 18, 70100, Greece");
		 String em=foititis.toString();
		 System.out.println(em);
	}
}