/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: Write a Java program to read numbers in an integer array of size 5 and display the following (using functions for each functionality):
			i)	its elements.
			ii)	Sum of all the elements
			iii)	Largest number in the array
			iv)	Smallest number in the array
			v)	Second largest number in the array
			vi)	Sum of alternate elements in the array
			vii)	Count of even numbers in the array
			viii)	Occurrence of a given number in the array and its frequency

*/
import java.util.*;
public class ArrayFunc
{
   public static void main(String args[])
   {
       int i, l;
       double oc;
       int arr[] = new int[5];
       Scanner num = new Scanner(System.in);

       System.out.println("Enter 5 numbers");
       for(i=0; i<5; i++)
       {
           arr[i] = num.nextInt();
       }
       System.out.println("enter number to find occurrence");
	   int x= num.nextInt();

	   System.out.println("Elements entered are:");
       elements(arr);
       System.out.println("Sum of elements entered is");
       sum(arr);
       System.out.println("Largest element entered is");
       l=largestNum(arr);
       System.out.println("Smallest element entered is");
       smallestNum(arr, l);
       System.out.println("Second largest element entered is");
       secLargest(arr, l);
       System.out.println("Sum of alternate elements entered is");
       sumAlt(arr);
       System.out.println("Count of even element entered is");
       even(arr);
       System.out.println("Occurrence of given element is");
       oc= occurrence(arr, x);
       System.out.println("Frequency of given element is");
       freq(oc);
    }

   static void elements(int[] arr) 
   {
    int i;
    for (i = 0; i <5; i++) 
    {
        System.out.println(arr[i]);
    }
   }

   static void sum(int[] arr) 
   {
    int i, sum=0;
    for (i = 0; i <5; i++) 
    {
    	sum= sum+ arr[i];
    }
    System.out.println(sum);
   }

   static int largestNum(int[] arr) 
   {
    int i, large= arr[0];
    for (i = 1; i <5; i++) 
    {
    	if (arr[i] > large) 
        { 
        	large = arr[i]; 
        } 
    }
    System.out.println(large);
    return large;
   }

   static void smallestNum(int[] arr, int l) 
   {
    int i;
    int small= l;
    for (i = 0; i <5; i++) 
    {
        if (arr[i] < small) 
        { 
            small = arr[i]; 
        } 
    }
    System.out.println(small);
   }

   static void secLargest(int[] arr, int l) 
   {
    int i, seclarge;
    int large= l;
	seclarge= 0;
    for (i = 0; i <5 ; i++) 
    { 
        if (arr[i] > seclarge && arr[i] < large) 
        { 
            seclarge = arr[i]; 
        } 
    }
    System.out.println(seclarge);
	}
   

   static void sumAlt(int[] arr) 
   {
    int i, sumalt=0;
    for (i = 0; i <5; i=i+2) 
    {
    	sumalt= sumalt+ arr[i];
    }
    System.out.println(sumalt);
   }

   static void even(int[] arr) 
   {
    int i, count=0;
    for (i = 0; i <5; i++) 
    {
    	if(arr[i] %2 == 0)
    	{
    		count++;
    	}
    }	
    System.out.println(count);
   }

   static int occurrence(int[] arr, int x) 
   {
    int i, occ=0;
    for (i = 0; i <5; i++) 
    {
		if (x == arr[i])
		{
			occ++;
		}     
	}
    System.out.println(occ);
    return occ;
   }

   static void freq(double occ) 
   {
    System.out.println(occ/5);
   }
}