class Exception01 extends Exception
{
	String str;
	public Exception01(String s)
	{
		super(s);
		System.out.println(s);
	}
}

public class Ex1
{
	public static void p() throws Exception01
	{
		throw new Exception01("Exception occured");
	}
	public static void main(String args[])
	{
		try
		{
			p();
			//Exception1 e1 = new Exception1()
		}
		catch(Exception01 e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Rest of the code...");		
		}
	}
}
