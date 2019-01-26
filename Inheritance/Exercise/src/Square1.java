/*
Author: Shagun Bhardwaj(18csu202)
*/

class Square1 extends Rectangle1
{
	Square1()
	{
		super();
	}

	Square1(double side)
	{
		super(side, side);
	}

	Square1(double side, String color, boolean filled)
	{
		super(side, side, color, filled);
	}

	public void setSide(double side)
	{
		super.setLength(side);
		super.setWidth(side);
	}

	public double getSide()
	{
		return super.getLength();
	}
	
	public void setLength(double side)
	{
		super.setLength(side);
	}

	public void setWidth(double side)
	{
		super.setWidth(side);
	}

	public String toString()
   {
    	return "Side = " + getSide() + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter() + "\n" + "Color: " + super.getColor() + "\nFilled: " + super.isFilled();
   }
}
