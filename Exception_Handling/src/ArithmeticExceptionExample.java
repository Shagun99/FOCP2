/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: 
*/

class ArithmeticExceptionExample
{
	public static void main (String args[])
	{
		try
		{
			int a;
			a = 100/0; // Arithmetic Exception
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the code...");
	}
}