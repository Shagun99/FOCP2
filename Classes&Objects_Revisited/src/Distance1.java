/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose:  Write a program to calculate the distance between two points (x1, y1) and (x2, y2). All numbers and return values should be of type double. 
*/
import java.util.*;
import java.lang.Math.*;
class Point1
{
	private double a, b;

	public Point1()
	{
		a= 0;
		b= 0;
	}
	public Point1(double x)
	{
		a= x;
	}
	public Point1(double x, double x2)
	{
		a= x;
		b= x2;
	}
	/*void setpt1(double x)
	{
		x= x;
		this.y1= y1;
	}
	void setpt2(double y)
	{
		this.x2= x2;
		y= y;
	}*/
	public double getpt1()
	{
		return a;
	}
	public double getpt2()
	{
		return b;
	}
	
}

class Distance1
{
	static void calcDistance(Point1 pt1, Point1 pt2)
	{
		System.out.println("x1 = "+ pt1.getpt1() + "\tx2 = " + pt2.getpt1() + "\ny1 = " + pt1.getpt2() + "\ty2 = " + pt2.getpt2());
		System.out.println("Distance between points = " + Math.sqrt(Math.pow((pt1.getpt1()-pt2.getpt1()),2) + Math.pow((pt1.getpt2()-pt2.getpt2()),2)));
	}
	
	public static void main(String args[])
	
	{
        double x, y, x2, y2;
        double distance;
	    Scanner num= new Scanner(System.in);
 		
	    System.out.println("enter value of x");
        x= num.nextDouble();
        System.out.println("enter value of y");
        y= num.nextDouble();
        System.out.println("enter value of x2");
        x2= num.nextDouble();
        System.out.println("enter value of y2");
        y2= num.nextDouble();
	  
	   Point1 pt1 = new Point1(x, y);

	   Point1 pt2 = new Point1(x2, y2);	

	   calcDistance(pt1, pt2);
	}
}