/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: Write a program to read two distances in feet and inches and find their sum. 
*/

import java.util.*;
public class FeetInches
{
	public static void main(String args[]) 
	{
		dist d1= new dist();
		dist d2= new dist();
		dist d3= new dist();
		
		d1.setFeet();
		d1.setInches();
		d2.setDist();
		d3.sum(d1, d2);
	}
}

class dist
{
	Scanner dist =new Scanner(System.in);
	float feet;
	float inches;

	dist()
	{
		feet= 1;
		inches= 1;
	}
	dist(float x, float y)
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
	
	public void sum(dist d1, dist d2)
	{
		int i = (int)d1.getInches() + (int)d2.getInches();
		feet = d1.getFeet() + d2.getFeet() + (i/12);
		inches = i % 12;
		System.out.println("Sum of distances = "+ feet +" feet  "+ inches +" inches ");
	}
}