/*
Author: Shagun Bhardwaj(18csu202)
Version: 1.0.0
Purpose: Create a class with a main( ) that throws an object of class Exception inside a try block.
		 Give the constructor for Exception a String argument. Catch the exception inside a catch clause and print the String argument.
		 Add a finally clause and print a message to prove you were there.
*/

import java.io.*;
 
class Exception1 extends Exception
{
    Exception1(String s) 
    {
    	super(s);
        System.out.println(s);
    }
 }

public class ExceptionsPrinting
{
	public static void x() throws Exception1
	{
	    throw new Exception1("File not found");
	}

    public static void main(String[] args)
    {
        try
        {
        	x();
        }
        catch (Exception1 e1)
        {
            System.out.println("Exception1 occurred");
        }
        finally  // This block will get get executed whether exception occurrs or not
        {
            System.out.println("finally block is executed");
        }
 
    }
}