class Point2D
{
   private float x;
   private float y;

   public Point2D()
   {
   this.x = 0;
   this.y = 0;
   }

   public Point2D(float x,float y) 
   {
     this.x = x;
     this.y = y;
   }

   public void setX(float x)
   {
      this.x = x;
   }

   public float getX()
   {
      return x;
   }

   public void setY(float y)
   {
      this.y = y;
   }

   public float getY()
   {
      return y;
   }

   public String toString()
   {
      return "(" + x + ", " + y + ")" ;
   }
}

class Point3D extends Point2D
{
  private float z;

  public Point3D() 
  {
    super();
    this.z = 0;
  }
  
  public Point3D(float x, float y, float z)
  {
    super(x, y);
    this.z = z;
  }

  public void setZ(float z)
   {
      this.z = z;
   }

   public float getZ()
   {
      return z;
   }

   public String toString()
   {
      return "(" + super.getX() + ", " + super.getY() + ", " + z + ")" ;
   }
}

class PointTest
{
  public static void main(String[] args) 
  {
    Point2D pt2a = new Point2D(1,1);

    System.out.println("Value of 2D point a");      
    System.out.println(pt2a.toString());

    Point2D pt2b = new Point2D();
    System.out.println("Value of 2D point b");      
    System.out.println(pt2b.toString());

    pt2b.setX(3);
    pt2b.setY(4);

    System.out.println("New value of 2D point b");
    System.out.println("x = " + pt2b.getX());
    System.out.println("y = " + pt2b.getY());

    Point3D pt3a = new Point3D();
    System.out.println("Value of 3D point a");
    System.out.println(pt3a.toString());

    Point3D pt3b = new Point3D(1,2,3);
    System.out.println("Value of 2D point b");
    System.out.println(pt3b.toString());
    
    pt3b.setX(2);
    pt3b.setY(4);
    pt3b.setZ(6);

    System.out.println("New value of 3D point b");
    System.out.println("x = " + pt3b.getX());
    System.out.println("y = " + pt3b.getY());
    System.out.println("z = " + pt3b.getZ());

   }
}