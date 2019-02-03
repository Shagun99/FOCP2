/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: Example of ArrayIndexOutOfBound Exception using try{} and catch{} block
*/

class ArrayIndexOutOfBoundExceptionExample
{
	public static void main (String args[])
	{
		try
		{
			int[] array = new int[10];
			array[12] = 5; // ArrayIndexOutOfBound Exception
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the code...");
	}
}