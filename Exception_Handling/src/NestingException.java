/*
Author: Shagun Bhardwaj(18csu202)
Version: 1.0.0
Purpose: Create a class with two methods, f( ) and g( ). In g( ), throw an exception of a new type that you define.
		 In f( ), call g( ), catch its exception and, in the catch clause, throw a different exception (of a second type that you define).
		 Test your code in main( ).
*/

class Exception1 extends Exception
{
	Exception1()
	{
	super();
	}
}

class Exception2 extends Exception
{
	Exception2()
	{
	super();
	}
}

public class NestingException
{
	static void f() 
	{
		try 
		{
			try 
			{
				g();
			}
			catch(Exception2 e2)
			{
				System.out.println("Caught Exception2 in f() inner try");
				//e2.printStackTrace();
				throw new Exception1();
			}
		}
		catch(Exception1 e1) 
		{
			System.out.println("Caught Exception1 in f() outer try");
			//e1.printStackTrace();
		}
	}

	static void g() throws Exception2
	{
		throw new Exception2();
	}

	public static void main(String[] args) 
	{
		f();
	}	
}

