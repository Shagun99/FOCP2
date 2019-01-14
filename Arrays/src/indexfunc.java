/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: Write a Java program to find the index of an array element in an array of size 10. Solve the program problem using functions.
*/
import java.util.*;
public class indexfunc
{
  static void index_value(int a[], int number)
  { 
    int len=10, j;
    for (j = 0; j < len; j++) 
    {
      if (a[j] == number)
      System.out.println("Index value is "+ j);
    }
    if (j > len) 
    {
      System.out.println("No index value");
    }
    
  }

  public static void main(String args[]) 
  {
    int[] arr = new int[10];
    int len = 10, i;
    Scanner elements = new Scanner(System.in);
    System.out.println("enter elements");
    for (i = 0; i < len; i++) 
    {
      arr[i] = elements.nextInt();
    }
    if (arr == null) 
    {
      System.out.println("empty array");
    }

    System.out.println("enter number to find its index value");
    Scanner num = new Scanner(System.in);
    int value = num.nextInt();
    index_value(arr,value);
  }
}