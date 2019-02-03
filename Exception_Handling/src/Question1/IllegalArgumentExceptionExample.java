/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: Example of IllegalArgument Exception using try{} and catch{} block
*/

class IllegalArgumentExceptionExample
{
	public static void main (String args[])
	{
		try
		{
			switch(5 )
			{
				case 1: System.out.println("Case 1");
				default: throw new IllegalArgumentException("Invalid expression");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the code...");
	}
}