/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: Write a program to merge two sorted arrays. 
*/
import java.util.*;
public class MergeArrays
{
  public static void main(String args[])
  {
    int s1, s2, s, i, j, k;
    int arr1[] = new int[50];
    int arr2[] = new int[50];
    int merge[] = new int[100];
    int temp;

    Scanner num = new Scanner(System.in);
	   
    System.out.println("Enter size of Array1 "); //input size of array1
    s1 = num.nextInt();
	   
    System.out.println("Enter Array 1 Elements"); //input elements of array1
    for(i=0; i<s1; i++)
    {
      arr1[i] = num.nextInt();
    }
	   
    System.out.print("Enter size of Array2 "); //input size of array2
    s2 = num.nextInt();
	   
    System.out.println("Enter Array 2 Elements"); //input elements of array2
    for(i=0; i<s2; i++)
    {
      arr2[i] = num.nextInt();
    }
	   
    for(i=0; i<s1; i++) // merging elements of array1 and array2 in merge array 
    {
      merge[i] = arr1[i];
    }
	   
    s= s1+ s2;
	   
    for(i=0, k=s1; k<s && i<s2; i++, k++)
    {
      merge[k] = arr2[i];
    }

    for ( i = 0; i < s; i++) // sorting elements in ascending order 
    {
      for ( j = i + 1; j < s; j++) 
      {
        if (merge[i] > merge[j]) 
        {
          temp = merge[i];
          merge[i] = merge[j];
          merge[j] = temp;
        }
      }
    }

    System.out.println("Merged array is ");
    for(i=0; i<s; i++) // displaying the elements of merge array
    {
      System.out.println(merge[i] + "  ");
    }
  }
}


