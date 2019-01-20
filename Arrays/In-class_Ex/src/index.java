/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: Write a Java program to find the index of an array element in an array of size 10. The program should not use any function other than main ( ) functions.
*/
import java.util.*;

public class index 
{
  public static void main(String args[]) 
  {
    int i;
    int[] arr = new int[10];
    int len = 10;
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
    for (i = 0; i < len; i++) 
    {
      if (arr[i] == value)
      System.out.println("Index value is "+ i);
    }
    if (i > len) 
    {
      System.out.println("No index value");
    }
  }
}