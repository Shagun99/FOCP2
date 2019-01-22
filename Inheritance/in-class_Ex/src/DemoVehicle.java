/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: Write a program to read number of tyres from user and create an object of that class to display the output using display() method.
*/

import java.util.*;

class Vehicle
{
	void display()
	{
		System.out.println("This is a vehicle");
	}
}

class Bike extends Vehicle
{
	void display()
	{
		System.out.println("This is a Bike");
	}
}

class Car extends Vehicle
{
	void display()
	{
		System.out.println("This is a Car");
	}
}

class DemoVehicle
{
public static void main(String args[])
{
	Scanner num= new Scanner(System.in);
	System.out.println("Enter number of tyres");
	int N = num.nextInt();

	switch(N)
	{
	case 2: Bike b = new Bike();
			b.display();
			break;
	case 4: Car c = new Car();
			c.display();
			break;
	default: Vehicle v = new Vehicle();
			v.display();
	}
}
}