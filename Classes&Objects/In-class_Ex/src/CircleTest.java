/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: Create a class Circle with instance variable radius and member functions:
            a) area() b) circumference() c) display(). 
            Write a test application named CircleTest that demonstrates class Circle’s capabilities.
*/
import java.util.*;
public class CircleTest
{
  public static void main(String args[]) 
  {
  	Circle c1 = new Circle(); //c1 and c2 are objects of Circle class
    Circle c2 = new Circle(); 
    System.out.println("enter radius");
    Scanner num = new Scanner(System.in); 
    double rad = num.nextDouble();  
  	c1.radius= rad;
  	c1.display();
    c2.display();
  }
}
class Circle
  {
  	double radius;
  	double area() //method to find area
  	{
		return radius* radius* 3.14159;
  	}
    double circumference() //method to find circumference
    {
      return 2*radius*3.14159;
    }
  	void display() //method to display area and circumference
  	{
  		System.out.println("Area =" + area()); 
      System.out.println("Circumference =" + circumference()); 
  	}
    void Circle(double radius) //non parameterized constructor
    { 
        this.radius= radius;
    }
    Circle() //parameterized constructor
    { 
        this.radius= 1;
    }
  }
