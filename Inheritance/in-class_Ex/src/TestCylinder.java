/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: Write an application TestCylinder that uses the given class definition to maintain and display; a) Radius  b) Height c) base area and d) volume of cylinder.
*/

import java.util.*;

class Circle 
{
	private double Radius ;
	private String Colour;
	
	Circle ()
	{
		this.Radius=1.0;
		this.Colour="red";
	}
	
	Circle (double r)
	{
		this.Radius=r;
	}

	Circle (double r , String colour)
	{
		this.Radius=r;
		this.Colour=colour;
	}
	
	public double getRadius ()
	{
		return Radius;
	}
	
	public void setRadius (double r)
	{
		this.Radius=r;
	}
	
	public String getColour ()
	{
		return Colour;
	}
	
	public void setColour( String colour)
	{
		this.Colour=colour;
	}
	
	public double getArea( )
	{
		double area= 3.14*Radius*Radius;
		return area;
	}

}

class Cylinder extends Circle
{
      private double Height;
      
      Cylinder()
      {
      	this.Height = 1.0;
      }
      
      Cylinder(double r)
      {
      	this.setRadius(r);

      }
      
      Cylinder(double r,double h)
      {
      	this.setRadius(r);
      	this.Height = h;
      }
      
      Cylinder ( double r,double h,String colour)
      {
      	this.setRadius(r);
      	this.Height = h;
      	this.setColour(colour);
      }

	  public void setHeight( double h)
      {
        this.Height = h;
      }

      public double getHeight()
      {
      	return Height;
      }

      public double getVolume ()
      {
      	double volume = (super.getArea())*Height;
      	return volume; 
      }
 }

 class TestCylinder
 {
 	public static void main (String args [])
 	{
 		Scanner num = new Scanner(System.in);

 		int n;

 		Cylinder c1 = new Cylinder();
 		Cylinder c2 = new Cylinder();

 		System.out.println("Enter radius");
 		n = num.nextInt();
 		c2.setRadius(n);

 		System.out.println("Enter height");
 		n = num.nextInt();
 		c2.setHeight(n);

		System.out.println("Enter colour");
 		String c = num.next();
 		c2.setColour(c);

 		System.out.println("Details of Cylinder1");

 		System.out.println( "Radius = "+  c1.getRadius());
 		System.out.println( "Height = "+ c1.getHeight()); 		
 		System.out.println( "Volume = "+  c1.getVolume());
 		System.out.println( "Colour: "+ c1.getColour());
 	
 		System.out.println("\nDetails of Cylinder2");

		System.out.println( "Radius = "+  c2.getRadius());
 		System.out.println( "Height = "+ c2.getHeight()); 		
 		System.out.println( "Volume = "+  c2.getVolume());
 		System.out.println( "Colour: "+ c2.getColour());

 	}
 }