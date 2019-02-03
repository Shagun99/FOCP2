/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: Example of NullPointer Exception using try{} and catch{} block
*/

class NullPointerExceptionExample
{
	public static void main (String args[])
	{
		try
		{
			String s = null;
			System.out.println(s.length()); // NullPointer Exception
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the code...");
	}
}