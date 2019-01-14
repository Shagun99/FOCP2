/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: Compute the sum of the series: 1 + x + x2/2! + x3/3! + ……
*/
import java.util.*;
public class series
{
  public static void main(String args[]) 
  {
  	double x, n, power, i= 1, factorial= 1, j= 1;
    double term=0, sum= 1;

  	System.out.println("enter value of x");
    Scanner value = new Scanner(System.in);
  	x = value.nextInt();
    
    System.out.println("enter number of terms");
    Scanner terms = new Scanner(System.in);
    n = terms.nextInt();

    if(n== 1)
    {
      sum= 1;
    }
    else
    {
      while (i < n) 
      {
        while(j<= i)
        {
          factorial*=j;
          j++;
        }
      power= (int)Math.pow(x,i);
      term=power/factorial;
      sum += term;
      i++;
      }
    }  
    System.out.println("sum of series is "+ sum); 	
    }
}