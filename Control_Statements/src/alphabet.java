/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: Write a Java program that asks the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
*/
import java.util.*;
public class alphabet 
{
  public static void main(String[] args)
    {
        System.out.println("Input an alphabet");
        Scanner letter = new Scanner(System.in);
        String alpha = letter.next();
        char ch=alpha.charAt(0);

        if (alpha.length() > 1)
        {
            System.out.println("Error! Enter a letter.");
        }
        else if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')))
        {
            System.out.println("Error! Entered character is not an alphabet");
        }
        else if (alpha.equals("a") || alpha.equals("e") || alpha.equals("i") || alpha.equals("o") || alpha.equals("u") || alpha.equals("A") || alpha.equals("E") || alpha.equals("I") || alpha.equals("O") || alpha.equals("U"))
        {
            System.out.println("Entered character is vowel");
        }
        else
        {
            System.out.println("Entered character is consonant");
        }
    }
}