/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: Write a program to read two distances in feet and inches and find their sum. 
			Solve the question with:
			i.	A static method definition for finding the sum of two distances in feet and inches.
			ii.	The function sum returns a distance.
 */
import java.util.*;
public class FeetInches1
{
	public static void main(String args[]) 
	{
		Dist1 d1= new Dist1();
		Dist1 d2= new Dist1();
		Dist1 d3= new Dist1();
		
		d1.setFeet();
		d1.setInches();
		d2.setDist();
		d3.sum(d1, d2);
	}
}

class Dist1
{
	Scanner dist =new Scanner(System.in);
	float feet;
	float inches;

	Dist1()
	{
		feet= 1;
		inches= 1;
	}
	Dist1(float x, float y)
	{
		feet= x;
		inches= y;
	}
	
	public void setFeet()
	{
		System.out.println("Enter feet: ");
		feet= dist.nextInt();
	}

	public void setInches()
	{
		System.out.println("Enter inches: ");
		inches= dist.nextInt();
	}

	public void setDist()
	{
		System.out.println("Enter feet: ");
		feet= dist.nextInt();
		System.out.println("Enter inches: ");
		inches= dist.nextInt();
	}

	public float getFeet()
	{
		return feet;
	}

	public float getInches()
	{
		return inches;
	}
	
	public void sum(Dist1 d1, Dist1 d2)
	{
		int i = (int)d1.getInches() + (int)d2.getInches();
		feet = d1.getFeet() + d2.getFeet() + (i/12);
		inches = i % 12;
		System.out.println("Sum of distances = "+ feet +" feet  "+ inches +" inches ");
	}
}