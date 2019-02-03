abstract class Shape
{
    public abstract double display_area();
}

class Rectangle extends Shape
{
    private final double width, length;

    public Rectangle()
    {
        this(1,1);
    }
    public Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
    }

    public double display_area()
    {
        return width * length;
    }
}

class Triangle extends Shape
{
    private final double a, b, c;

    public Triangle()
    {
        this(1,1,1);
    }

    public Triangle(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double display_area()
    {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

public class TestShapes
{
    public static void main(String[] args)
    {

        double width = 5, length = 10;
        Shape rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length + "\nResulting area: " + rectangle.display_area());

        double a = 3, b = 4, c = 5;
        Shape triangle = new Triangle(a,b,c);
        System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c + "\nResulting Area: " + triangle.display_area());
    }
}