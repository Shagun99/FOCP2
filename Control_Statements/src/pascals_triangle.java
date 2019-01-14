/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: Write a Java program to display Pascal's triangle.
*/
import java.util.*;

public class pascals_triangle
{
  public static void main(String args[]) 
  {
    int i, space, j, num=1;
    String ch;
	do
	{
		System.out.println("Enter Number of Rows");
		Scanner row = new Scanner(System.in);
		int rows = row.nextInt();
		for(i=0; i< rows; i++) //for loop to control rows
		{
			for(space= rows; space> i; space--)  //for loop to control space before first number
			{
				System.out.print(" ");
			}
			num= 1;
			for(j= 0; j<= i; j++) //for loop to print numbers
			{
				System.out.print(num + " ");
            	num= (num* (i- j))/ (j+ 1);
			}
			System.out.println();
		}
		System.out.println("Press Y to continue with another value and N to exit");
		Scanner again = new Scanner(System.in);
		ch = again.next();
	}while(!(ch.equals("N") || ch.equals("n")));
  }
}