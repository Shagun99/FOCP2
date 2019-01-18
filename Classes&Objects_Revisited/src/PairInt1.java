/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: Given an array of pairs of integers. The task is to sort the array with respect to second element of the pair.
            Examples:
            Input: [(1, 2), (3, 5), (2, 6), (1, 7)]
            Output: [(1, 2), (3, 5), (2, 6), (1, 7)]

            Input: [(10, 20), (20, 30), (5, 6), (2, 5)] 
            Output: [(2, 5), (5, 6), (10, 20), (20, 30)]
*/

import java.util.*; 

class Pair1 
{ 
    int x; 
    int y; 
    int i,j;
    Scanner num = new Scanner(System.in); 

    void setval1()
    {
        System.out.println("Enter first element of pair");
        x= num.nextInt(); 
    }
  
    void setval2()
    {
        System.out.println("Enter second element of pair");
        y= num.nextInt(); 
    }  
  
    int getval1()
    {
        return x;
    }
  
    int getval2()
    {
        return y;
    }

    void display(Pair1[] pr) 
    { 
        Pair1 temp= new Pair1();

            for ( i = 0; i < 5; i++) 
        {
            for ( j = i + 1; j < 5; j++) 
            {
                if (pr[i].getval2() > pr[j].getval2()) 
                {
                    temp = pr[i];
                    pr[i] = pr[j];
                    pr[j] = temp;
                }
            }
        }
        for(i=0; i< 5; i++)
        {
            System.out.println("("+pr[i].getval1() +", "+ pr[i].getval2()+")"); 
        } 
    }

    public Pair1()     // Non-Parameterized Constructor 
    { 
        this.x = 0; 
        this.y = 0; 
    } 
} 
  
  
class PairInt1
{ 
    public static void main(String[] args) 
    { 
        Scanner num = new Scanner(System.in); 
  
        int i, x, y; 

        Pair1[] pr= new Pair1[5];
        Pair1 pr1= new Pair1();

        for(i=0; i< 5; i++)
        {
            
                pr[i]= new Pair1();
                pr[i].setval1();
                pr[i].setval2(); 
            
        }

        System.out.println("After sorting with respect to second element of the pair");
        pr1.display(pr);
    } 
} 