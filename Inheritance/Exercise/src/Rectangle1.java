/*
Author: Shagun Bhardwaj(18csu202)
*/

class Rectangle1 extends Shape1 
{
	private double width;
	private double length;

	Rectangle1()
	{
		this.width = 1.0;
		this.length = 1.0;
	}

	Rectangle1(double width, double length) 
	{
		this.width = width;
		this.length = length;
	}
	
	Rectangle1(double width, double length, String color, boolean filled) 
	{
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth()
	{
		return width;
	}
	
	public void setWidth(double width)
	{
		this.width = width;
	}

	public double getLength()
	{
		return length;
	}
	
	public void setLength(double length)
	{
		this.length = length;
	}

	public double getArea() 
	{
		double area = length*width;
		return area;
	}

	public double getPerimeter()
	{
		double perimeter = 2*(length + width);
		return perimeter;
	}

	public String toString()
   {
    	return "Length = " + getLength() + "\nWidth = " + getWidth() + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter() + "\n" + super.toString();
   }
}
