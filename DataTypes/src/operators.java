/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose:Write a program to display the results of different relational operators and logical operators in Java on two Integer values and two Boolean values. Input values to be given within the program.
*/
class operators
{
  public static void main(String args[]) 
  {
  	int num1, num2;
//initialising numbers
  	num1= 20;
  	num2= 7;
    System.out.println("num1= "+ num1);
    System.out.println("num2= "+ num2);
//using equality and relational operators
  	if(num1==num2)
      System.out.println("numbers are equal");
  	if(num1!=num2)
      System.out.println("numbers are not equal");
  	if(num1<num2)
      System.out.println(num1 +" is less than "+ num2);
  	if(num1>num2)
      System.out.println(num1 +" is greater than "+ num2);
  	if(num1<=num2)
      System.out.println(num1 +" is less than or equal to "+ num2);
    if(num1>=num2)
      System.out.println(num1 +" is greater than or equal to "+ num2);    
//using logical operators
    if((num1 == 20) && (num2 == 7))
      System.out.println("num1 is 20 AND num2 is 7");
    if((num1 == 7) || (num2 == 7))
      System.out.println("num1 is 7 OR num2 is 7");

    boolean a= true, b= false;
// using logical operators
    boolean c= a==b; //equal to
    boolean d= a!=b; //not equal to
    boolean e= a||b; //OR
    boolean f= a && b; //AND
    boolean g= !a; //not
    boolean h= !b;
//Displaying output of logical operators
    System.out.println("a is "+ a);
    System.out.println("b is "+ b);
    System.out.println("a == b is "+ c);
    System.out.println("a != b is "+ d);
    System.out.println("a OR b is "+ e);
    System.out.println("a AND b is "+ f);
    System.out.println("!a is "+ g);
    System.out.println("!b is "+ h);
  }
}