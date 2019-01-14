/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose:Write a Java program to display the following character rhombus structure.
*/
import java.util.*;

public class char_rhombus {
    public static void main(String args[])
    {
        String cont;
        do
        {
            System.out.println("Input the number of rows");
            Scanner rows = new Scanner(System.in);
            int n = rows.nextInt();
            int count = 1, sp= 1, i, j, space;
            char ch= 'A';

            for (i= 1; i< (n*2); i++) // for loop to control rows
            {
                for (space= n- sp; space> 0; space--) //for loop to print spaces before first characters of each row
                {
                    System.out.print(" ");
                }
                if (i< n) 
                {
                    sp++;
                } 
                else 
                {
                    sp--;
                }
                for (j= 0; j< count; j++) //for loop to print characters
                {
                    System.out.print(ch);
                    if (j< count/ 2) 
                    {
                        ch++;
                    } 
                    else 
                    {
                        ch--;
                    }
                }
                if (i< n)
                {
                    count+= 2;
                } 
                else
                {
                    count-= 2;
                }
                ch= 'A';
                System.out.println();
            }

            System.out.println("Press Y to continue with another value and N to exit");
            Scanner again = new Scanner(System.in);
            cont = again.next();
        }while(!(cont.equals("N") || cont.equals("n")));
    }
}