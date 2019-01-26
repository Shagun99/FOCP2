/*
Author: Shagun Bhardwaj(18csu202)
*/
class Circle1 extends Shape1
{
	private double Radius;
	
	Circle1()
	{
		this.Radius=1.0;
	}
	
	Circle1(double r)
	{
		this.Radius=r;
	}

	Circle1(double r, String color, boolean filled)
	{
		super(color, filled);
		this.Radius = r;
	}
	
	public double getRadius ()
	{
		return Radius;
	}
	
	public void setRadius (double r)
	{
		this.Radius = r;
	}
	
	
	public double getArea()
	{
		double area = 3.14* Radius* Radius;
		return area;
	}

	public double getPerimeter()
	{
		double perimeter = 2*3.14*Radius;
		return perimeter;
	}

	public String toString()
   {
      return "Radius" + Radius + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter() + "\n" + super.toString();
   }

}
