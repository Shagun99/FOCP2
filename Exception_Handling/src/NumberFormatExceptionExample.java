/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: Example of NumberFormat Exception using try{} and catch{} block
*/

class NumberFormatExceptionExample
{
	public static void main (String args[])
	{
		try
		{
			String s = "Hello";
			int a = Integer.parseInt(s);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the code...");
	}
}