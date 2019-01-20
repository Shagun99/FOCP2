/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: 4.	Write an application that inputs one number consisting of five digits from the user, separates the number into its individual digits in the same order and prints the digits separated from one another by three spaces each.
*/
import java.util.*;
public class digits
{
    public static void main (String[] args)
    {
	String ch;
	do
	{
        	Scanner input = new Scanner (System.in);
        	int digit;
        	System.out.print("Enter a 5 digit positive number: ");
        	digit = input.nextInt();
        	int power = 1;
        	while (power <= digit) 
		{
        		power *= 10;
        	}
        	power /= 10;
        	while (power >0) 
		{
            		System.out.print(digit/power + "   ");
            		digit %= power;
            		power /= 10;
        	}	System.out.println("Press Y to continue with another value and N to exit");
		Scanner again = new Scanner(System.in);
		ch = again.next();
	}while(!(ch.equals("N") || ch.equals("n")));
    }
}