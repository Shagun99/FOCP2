/*
Author: Shagun Bhardwaj(18csu202)
Version: 1.0.0
Purpose: Create a three-level hierarchy of exceptions.
		 Now create a base-class A with a method that throws an exception at the base of your hierarchy. 
		 Inherit B from A and override the method so it throws an exception at level two of your hierarchy. 
		 Repeat by inheriting class C from B. In main( ), create a C and upcast it to A, then call the method.
*/

class L1Exception extends Exception {}
class L2Exception extends L1Exception {}
class L3Exception extends L2Exception {} 

class A 
{
	void x() throws L1Exception
	{
		throw new L1Exception();
	}
}

class B extends A
{
	void x() throws L2Exception
	{
		throw new L2Exception();
	}
}

class C extends B
{
	void x() throws L3Exception
	{
		throw new L3Exception();
	}
}

public class InheritanceOfException
{
	public static void main(String[] args)
	{
		A a = new C();
		try
		{
			a.x();
		}	
		catch(L3Exception e3) 
		{
			System.out.println("Level3 Exception occurred!");			
		}
		catch(L2Exception e2)
		{
			System.out.println("Level2 Exception occurred!");
		}
		catch(L1Exception e1)
		{
			System.out.println("Level1 Exception occurred!");
		}		
	}
}