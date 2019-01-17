/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: Use a two-dimensional array to solve the following problem: A company has four salespeople (1 to 4) who sell five different products (1 to 5). 
   			Once a day, each salesperson passesin a slip for each type of product sold. Each slip contains the following:
			a) The salesperson number
			b) The product number
			c) The total dollar value of that product sold that day
			Thus, each salesperson passes in between 0 and 5 sales slips per day. Assume that the information from all the slips for last month is available.
			Write an application that will read all this information for last week’s sales and summarize the total sales by salesperson and by product. 
*/
import java.util.*;
public class Sales
{
public static void main(String[] args) 
{
  Scanner num = new Scanner(System.in); 
  int[][] sales= new int[5][6];
  int i, j, sum=0;
  
  	for(i=0; i<4; i++)
    {
    	for(j=0; j<5; j++)
    	{
    		System.out.println("Enter sales by salesperson"+ i + "for product"+ j);
    		sales[i][j] = num.nextInt();
    	}
    }
    for(i=0; i<5; i++)
    {
    	for(j=0; j<5; j++)
    	{ 
    		sum+= sales[i][j];
    	}
    	sales[i][j] = sum;
    	sum=0;
    }
    for(j=0; j<5; j++)
    { 
     	for(i=0; i<4; i++)
    	{
    		sum+= sales[i][j];
    	}
    	sales[i][j] = sum;
    	sum=0;
    }
    for(i=0; i<5; i++)
    {
    	for(j=0; j<6; j++)
    	{
    		System.out.print(sales[i][j]+"  ");
       	}
       	System.out.println("");
    }
}
}