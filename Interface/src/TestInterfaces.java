import java.util.*;

interface GeometricObject
{
double getPerimeter();
double getArea();
}

abstract class Circle implements GeometricObject
{
	protected double radius = 1.0;

	Circle(double radius)
	{
		this.radius = radius;
	}

	public double getPerimeter()
	{
		double perimeter = 2*3.14*radius;
		return perimeter;
	}

	public double getArea()
	{
		double area = 3.14*radius*radius;
		return area;
	}
}

interface Resizable
{
	void resize(int percent);
}

class ResizableCircle extends Circle implements Resizable
{
	ResizableCircle(double radius)
	{
		super(radius);
	}

	public void resize(int percent)
	{
		this.radius = (radius*percent/100);
	}
}

public class TestInterfaces
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		double r = sc.nextDouble();

		ResizableCircle c = new ResizableCircle(r);

		System.out.println("Radius of Circle2 = " + c.radius);

		System.out.println("Area of Circle2 = " + c.getArea());
		System.out.println("Perimeter of Circle2 = " +c.getPerimeter());

		int rs = sc.nextInt();
		c.resize(rs);

		System.out.println("Radius of Circle after resizing = " + c.radius);

		System.out.println("Area of Circle = " + c.getArea());
		System.out.println("Perimeter of Circle = " +c.getPerimeter());
	}
}
