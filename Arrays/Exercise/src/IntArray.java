/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: Write a program that reads a 2-D integer array with each element of maximum 2 digits and prints the following:
a)	Elements of the entered array. 
b)	Elements of the array after each element is multiplied by 2 if it is an odd number. 
Definition of Done:
a)	The program should generate an error message if the number of digits in the array is more than two and ask the user to re-enter the number.
b)	The program should use continue statement for ignoring even elements.
c)	The array elements should be displayed in tabular form with width set to 5.

*/

import java.util.*;

public class IntArray
{
  public static void main(String args[]) 
  {
    int i, j, num;
    int[][] arr = new int[2][5];

    Scanner elements = new Scanner(System.in);

    System.out.println("enter elements");
    
    for (i = 0; i < 2; i++) 
    {
    	for (j = 0; j < 5; j++)
    	{
    		num = elements.nextInt();

    		if(num < 100 && num >= 0)
    		{
    			arr[i][j] = num;
    		}
    		else
    		{
    			System.out.println("ERROR! : Enter a number less than 100");
    			num = elements.nextInt();
    			arr[i][j] = num;
    		}
    	}
	}
    
    if (arr == null) 
    {
      System.out.println("empty array");
    }

    System.out.println("\nuser entered values are:");
    for (i = 0; i < 2; i++) 
    	{
    		for (j = 0; j < 5; j++)
    		{
    			System.out.print((arr[i][j]) + " ");
    		}
    		System.out.println("");
    	}

    System.out.println("\nvalues after multiplying odd numbers by 2 are:");
     for (i = 0; i < 2; i++) 
    	{
    		for (j = 0; j < 5; j++)
    		{
      			if(arr[i][j] % 2 > 0)
      			{
        			System.out.print((arr[i][j] * 2) + " ");
      			}
      			else
      			{
      				System.out.print((arr[i][j]) + " ");
        			continue;
      			}
    		}
    		System.out.println("");
  		}
	}
}