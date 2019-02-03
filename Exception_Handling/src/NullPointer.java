/*
Author: Shagun Bhardwaj(18csu202)
Version: 1.0.0
Purpose: Define an object reference and initialize it to null. Try to call a method through this reference. Now wrap the code in a try-catch clause to catch the exception.
*/


public class NullPointer
{
	private static Integer i = null;

	public static void main(String[] args) 
	{
		try 
		{
			System.out.println(i.toString());
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException occurred");
		} 
		try 
		{
			i = 10;
			System.out.println(i.toString());
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException occurred");
		}
		finally
		{
			System.out.println("finally block executed");
		}
	}	
}