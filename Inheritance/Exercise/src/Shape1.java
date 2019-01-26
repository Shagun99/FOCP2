/*
Author: Shagun Bhardwaj(18csu202)
*/

class Shape1
{
	private String color;
	private boolean filled;

	Shape1()
	{
		this.color = "Red";
		this.filled = true;
	}

	Shape1(String color, boolean filled)
	{
		this.color = color;
		this.filled = filled;
	}

	public String getColor ()
	{
		return color;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	
	public boolean isFilled()
	{
		return filled;
	}

	public String toString()
   {
      return "Color: " + color + "\nFilled: " + filled;
   }
	
}