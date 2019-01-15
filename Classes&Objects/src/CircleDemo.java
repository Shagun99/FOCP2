/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: Write a program that computes area of circle using 2 classes.
*/
public class CircleDemo
{
  public static void main(String args[]) 
  {
  	Circle c = new Circle(); //c is created as an object of Circle class
  	c.radius=2;
  	c.displayArea();
  }
}
class Circle
  {
  	double radius;
  	double findArea() //method to find area
  	{
		return radius* radius* 3.14159;
  	}
  	void displayArea() //method to display area
  	{
  		System.out.println("Area =" + findArea()); 
  	}
  }
