class Plintyria
{
	String marka;
	int etos;
	int kila;
	int strofes;
	String diastaseis;
	
	Plintyria(String m , int e, int k, int s, String d)
	{
		marka=m;
		etos=e;
		kila=k;
		strofes=s;
		diastaseis=d;
	}
	
	String getMarka()
	{
		return marka;
	}
	
	String getDiastaseis()
	{
		return diastaseis;
	}
	
	int getEtos()
	{
		return etos;
	}
	
	int getKila()
	{
		return kila;
	}
	
	int getStrofes()
	{
		return strofes;
	}
	
	public static void main(String[] args)
	{
		Plintyria pl=new Plintyria("Siemens",2017,12,8000,"85x60x58");
		System.out.println("\n"+"Marka : "+pl.getMarka()+"\n"+"Etos : "+pl.getEtos()+"\n"+"Kila : "+pl.getKila()+"\n"+"Strofes : "+pl.getStrofes()+"\n"+"Diastaseis : "+pl.getDiastaseis()+"\n");
	}
}
		
		
		
		
		
		
		
		
		