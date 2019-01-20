/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: Use a one-dimensional array to solve the following problem: Write an application that inputs five numbers, each between 10 and 100, inclusive. 
            As each number is read, display it only if it’s not a duplicate of a number already read. Provide for the "worst case" in which all five numbers are different. 
            Display the complete set of unique values input after the user enters each new value. 
            The program should not use any function other than main() functions.
*/
import java.util.*;
public class WorstCase
{
public static void main(String[] args) 
{
  Scanner num = new Scanner(System.in); 
  int[] arr = new int[5]; 
  int temp, i;

        System.out.println("enter an integer : ");
        for ( i = 0; i < 5; i++)
        {
            temp = num.nextInt();
            if((temp <= 100 && temp >= 10))
            {
              for (int j = 0; j <= i; j++ )
              {
                if (temp != arr[j])
                {
                   arr[i]= temp;
                   break;
                }
                else
                {
                  temp= 0;
                  arr[i]=temp;
                  System.out.println("Duplicate value");
                }
              }
            }
            else
            {
              temp = num.nextInt();
            }       
        }

    System.out.println("Unique numbers entered are:");
    for(int k= 0; k< 5; k++)
    { 
        System.out.print(arr[k] + " "); 
    } 
        System.out.println("\nWorst Case"); 
}
}