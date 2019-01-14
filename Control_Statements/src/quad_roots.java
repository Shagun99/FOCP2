/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: Write a Java program to solve quadratic equations (use if, else if and else) 
*/
public class quad_roots
{
  public static void main(String args[]) 
  {
    int a, b, c;
    a = 1;
    b = 4;
    c = 3;
    double result = b*b - 4.0*a*c;
	if (result > 0.0) {
		double r1 = -(-b + Math.pow(result, 0.5)) / (2.0 * a);
		double r2 = -(-b - Math.pow(result, 0.5)) / (2.0 * a);
		System.out.println("The roots of the equation " + a +"x^2+ "+ b+"x + "+c + " =0 are " + r1 + " and " + r2);
	}
	else if (result == 0.0) {
		double r1 = -b / (2.0 * a);
		System.out.println("The roots of the equation " + a +"x^2 + "+ b+"x + "+c + " =0 is " + r1);
	}
	else {
		System.out.println("The equation " + a +"x^2 + "+ b+"x + "+ c +" =0 has no real roots.");
	}
  }
}
