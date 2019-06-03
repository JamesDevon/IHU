public class lab2
{
	public static void main(String[] args)
	{
		byte b1, b2, bsum;
		double dsum, dmo;
		b1=6;
		b2=5;
		bsum=(byte)(b1+b2);
		dmo=bsum/2;
		System.out.println("\n"+"Byte b1 = "+b1+" Byte b2 = "+b2+" Byte Sum : "+bsum+" Byte Avg : "+dmo);
		dsum=b1+b2;
		dmo=dsum/2;
		System.out.println("Byte dsum = "+dsum+" Byte dmo = "+dmo+"\n");
		
		short s1, s2, ssum;
		s1=6;
		s2=5;
		ssum=(short)(s1+s2);
		dmo=ssum/2;
		System.out.println("Short s1 ="+s1+ " Short s2 = "+s2+" Short Sum : "+ssum+" Short Avg : "+dmo);
		dsum=s1+s2;
		dmo=dsum/2;
		System.out.println("Short s1 = "+s1+" Short s2 = "+s2+" Short dsum = "+dsum+" Short dmo = "+dmo+"\n");
		
		int i1, i2, isum;
		i1=6;
		i2=5;
		isum=i1+i2;
		dmo=isum/2;
		System.out.println("Interger i1 = "+i1+" Interger i2 = "+i2+" Interger Sum : "+isum+" Interger Avg : "+dmo);
		dsum=i1+i2;
		dmo=dsum/2;
		System.out.println("Interger i1 = "+i1+" Interger i2 = "+i2+" Integer dsum = "+dsum+" Integer dmo = "+dmo+"\n");
		
		long l1, l2, lsum;
		l1=6;
		l2=5;
		lsum=l1+l2;
		dmo=lsum/2;
		System.out.println("Long l1 = "+l1+" Long l2 = "+l2+" Long Sum : "+lsum+" Long Avg : "+dmo);
		dsum=l1+l2;
		dmo=dsum/2;
		System.out.println("Long l1 = "+l1+" Long l2 = "+l2+" Long dsum = "+dsum+" Long dmo = "+dmo+"\n");
		
		float f1, f2, fsum;
		f1=6;
		f2=5;
		fsum=f1+f2;
		dmo=fsum/2;
		System.out.println("Float f1 = "+f1+"Float f2 = "+f2+" Float Sum : "+fsum+" Float Avg : "+dmo);
		dsum=f1+f2;
		dmo=dsum/2;
		System.out.println("Float f1 = "+f1+"Float f2 = "+f2+" Float dsum = "+dsum+" Float dmo = "+dmo+"\n");
		
		double d1, d2, Dsum;
		d1=6;
		d2=5;
		Dsum=d1+d2;
		dmo=Dsum/2;
		System.out.println("Double d1 = "+d1+" Double d2 = "+d2+" Double Sum : "+Dsum+" Double Avg : "+dmo);
		dsum=d1+d2;
		dmo=dsum/2;
		System.out.println("Double d1 = "+d1+"Double d2 = "+d2+"dsum = "+dsum+" dmo = "+dmo);
		
	}
}