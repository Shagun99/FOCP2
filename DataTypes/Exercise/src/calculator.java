/* Author:
   Version:1.0.0
   Purpose:
*/
class calculator
{
  public static void main(String args[]) 
  {
  	int num1, num2, sum, diff, prod, quot, rem;
//initialising numbers
  	num1= 20;
  	num2= 7;
//addition of numbers
  	sum= num1+ num2;
//subtraction of numbers  	
  	diff= num1-num2;
//multiplication of numbers  	
  	prod= num1* num2;
//division of numbers  	
  	quot= num1/num2;
//modulus of numbers
  	rem= num1% num2;

  	System.out.println("number1= " + num1);
  	System.out.println("number2= " + num2);
  	System.out.println("sum= " + sum);
  	System.out.println("difference= " + diff);
  	System.out.println("product= " + prod);
  	System.out.println("quotient= " + quot);
  	System.out.println("remainder= " + rem);

  }
}
