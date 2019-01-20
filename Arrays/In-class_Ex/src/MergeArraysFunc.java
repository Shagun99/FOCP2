/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: Write a program to merge two sorted arrays using functions. 
*/

import java.util.*;
public class MergeArraysFunc
{
  public static void main(String args[])
  {
    int s1, s2, i;
    Scanner num = new Scanner(System.in);

    System.out.println("Enter size of Array1 "); //input size of array1
    s1 = num.nextInt();

    System.out.println("Enter size of Array2 "); //input size of array2
    s2 = num.nextInt();

    int arr1[] = new int[s1];
    int arr2[] = new int[s2];

    System.out.println("Enter Array 1 Elements"); //input elements of array1
    for(i=0; i<s1; i++)
    {
      arr1[i] = num.nextInt();
    }
       
    System.out.println("Enter Array 2 Elements"); //input elements of array2
    for(i=0; i<s2; i++)
    {
      arr2[i] = num.nextInt();
    }

    Merge(arr1, arr2);
  }


    static void Merge(int[] arr1, int[] arr2)
    {
        int temp, i, j, k, s, s1, s2;
        s1= arr1.length;
        s2= arr2.length;
        s= s1+ s2;

        int merge[] = new int[s];

        for(i=0; i<s1; i++) // merging elements of array1 and array2 in merge array 
        {
            merge[i] = arr1[i];
        }
       
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