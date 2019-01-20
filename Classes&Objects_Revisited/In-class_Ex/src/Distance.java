/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: Write a program to calculate the distance between two points (x1, y1) and (x2, y2). All numbers and return values should be of type double. 
            Use a static method definition for calculating the distance between two points.
*/

import java.util.*;
import java.lang.Math.*;

class Point
{
  private double x1;
  private double x2;
  
  Point()
  {
    this.x1=0;
    this.x2=0;
  }
  
  Point(double x1,double x2)
  {
    this.x1=x1;
    this.x2=x2;
  }
  
  void setval1(double x1)
  {
    this.x1=x1;
  }
  
  void setval2(double x2)
  {
    this.x2=x2;
  }  
  
  double getval1()
  {
    return x1;
  }
  
  double getval2()
  {
    return x2;
  }
  
  double calcDistance(Point p2) 
  {
  double dist=Math.sqrt(Math.pow((getval1()-p2.getval1()),2) + Math.pow((getval2()-p2.getval2()),2));
  return dist;
  }
}

class Distance
{
  public static void main(String args[])
  {
    double dst, y1, y2, x1, x2;
    Scanner num = new Scanner(System.in);
    
    System.out.println("enter x1");
    x1=num.nextDouble();
    System.out.println("enter x2");
    x2=num.nextDouble();
    System.out.println("enter y1");
    y1=num.nextDouble();
    System.out.println("enter y2");
    y2=num.nextDouble();
    
    Point p1=new Point();
    p1.setval1(x1);
    p1.setval2(x2);
    
    Point p2=new Point();
    p2.setval1(y1);
    p2.setval2(y2);
    
    dst= p1.calcDistance(p2);
    System.out.println("Distance between points = " + dst);
  }
}