import java.io.*;
class UserInput
{
	static int getInteger()
	{
		String line;
		InputStreamReader eisodosString=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(eisodosString);
		
		try
		{
			line=br.readLine();
			int i=Integer.parseInt(line);
			return i;
		}
		
		catch(Exception e)
		{
			return -1;
		}
	}
	static float getFloat()
	{
		String line;
		InputStreamReader eisodosString=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(eisodosString);
		
		try
		{
			line=br.readLine();
			float i=Float.parseFloat(line);
			return i;
		}
		
		catch(Exception e)
		{
			return -1;
		}
		
	}
}
class TestUserInput
{
	public static void main (String arg[])
	{
		int a = UserInput.getInteger();
		int b = UserInput.getInteger();
		System.out.println("To athroisma einai = "+(a+b));
	}
}