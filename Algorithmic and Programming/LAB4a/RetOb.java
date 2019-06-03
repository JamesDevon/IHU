class Test1
{
	 int a;
	 Test1(int i) 
	 {
		a = i; 
	 }
	 Test1 incrByOne() 
	 {
		 Test1 temp = new Test1(a+1);
		 return temp;
	 }
}
class RetOb 
{
	public static void main(String args[])
	{
		Test1 ob1 = new Test1(2);
		Test1 ob2;
		ob2 = ob1.incrByOne();
		System.out.println("ob1.a: " + ob1.a);
		System.out.println("ob2.a: " + ob2.a);
		ob2 = ob2.incrByOne();
		System.out.println("ob2.a - new: " + ob2.a);
	}
}