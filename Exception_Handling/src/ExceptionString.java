/*
Author: Shagun Bhardwaj(18csu202)
Version: 1.0.0
Purpose: Create your own exception class using the extends keyword.
		 Write a constructor for this class that takes a String argument and stores it inside the object with a String reference.
		 Write a method that prints out the stored String. Create a try-catch clause to exercise your new exception.
*/

class Exception0 extends Exception
{
	private String msg;
	Exception0(String s)
	{
		super(s);
		System.out.println(s);
	}
}

public class ExceptionString
{
	public static void f() throws Exception0
	{
		System.out.println("f()");
		throw new Exception0("Exception0 from f()");
	}

	public static void main(String[] args)
	{
		try {
			f();	
		}
		catch(Exception0 e)
		{
			System.out.println("Exception0 occurred");
		} 
	}	
}