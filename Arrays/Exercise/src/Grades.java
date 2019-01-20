/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: Write a program that uses a two-dimensional float array grades to store the grades of students on multiple exams. 
   There are a total of 10 students and 5 subjects. A student can opt for any number of courses with a minimum of 2 and maximum of 5 subjects. 
   Each row of the array represents grades of a single student for the entire set of subjects opted by him, and each column represents the grades of all the students who took a particular exam.
   Write an application that will read all this information and summarize the result.
*/

import java.util.*;

public class Grades
{
	public static void main(String args[])
	{ 
		Scanner marks = new Scanner(System.in);
        int[][] arr = new int[10][]; 
        int i, j;
        int n, grade;
  
        for(i= 0; i< 10; i++)  // loop to make 2-D array into jagged array
        {
        	System.out.println("Enter number of subjects for student" + (i+1));
        	n = marks.nextInt();
        	if((n >= 2) && (n <=5))
        	{
        		arr[i] = new int[n];
        	}
        	else
        	{
        		System.out.println("ERROR: Number of subjects can vary from 2 to 5");
        		n = marks.nextInt();
        		arr[i] = new int[n];
        	}
        }
        
        for (i= 0; i< 10; i++)  // loop to initialize elements of jagged array 
        {
            for(j=0; j< arr[i].length ; j++)
            {
            	System.out.println("Enter marks of student " + (i+1) + " for subject " + (j+1));
        		grade = marks.nextInt();
            	arr[i][j] = grade;
            }
        }
  
        System.out.println("Display of Result");  // loop to display the elements of 2-D jagged array 
        for (i= 0; i< 10; i++) 
        { 
        	System.out.println("Student " + (i+1));
            for (j= 0; j< arr[i].length ; j++) 
            {
                System.out.print(arr[i][j] + " "); 
            }
            System.out.println(""); 
        } 
    } 
} 