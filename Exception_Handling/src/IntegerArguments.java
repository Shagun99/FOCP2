/*
Author: Shagun Bhardwaj(18csu202)
Version: 1.0.0
Purpose: Write a program that takes 5 integer command line arguments.
		 Create a user defined Exception named CheckArgumentException to check the number of arguments passed through command line.
		 If the number of arguments is less than five, throw the CheckArgumentException, else print the addition of all five numbers.
*/

import java.util.*;

class CheckArgument extends Exception
{
}

class IntegerArguments
{
     public static void main(String args[])
     {
         int i, j, n;
         int ans= 0;

         Scanner num = new Scanner(System.in);
         int s[]=new int[5];
         try
        {
              int cnt=0;
              for(i=0;i<5;i++)
             {
             	n = num.nextInt();
                    s[i]= n;
                    cnt++;

                    if(s.length >5)
                    {
                          throw new CheckArgument();
                    }
                    /*else if(s.length>5)
                    {
                           throw new CheckArgument();
                    }*/
             }
 
             for(i=0;i<s.length;i++)
            {
                   ans=ans+s[i];
             }
   }
   catch(CheckArgument m)
  {
         System.out.println("Passed 5 Integer");
   }    
   System.out.println("The sum is " + ans);
  }
}