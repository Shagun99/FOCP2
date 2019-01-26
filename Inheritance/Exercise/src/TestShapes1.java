/*
Author: Shagun Bhardwaj(18csu202)
*/
import java.util.*;

 class TestShapes1
 {
 	public static void main (String args [])
 	{
 		Scanner num = new Scanner(System.in);

 		int r, l, w, s;

 		Circle1 c1 = new Circle1();
 		Circle1 c2 = new Circle1();
 		Rectangle1 r1 = new Rectangle1();
 		Rectangle1 r2 = new Rectangle1(); 	
 		Square1 s1 = new Square1();
 		Square1 s2 = new Square1(); 			

 		System.out.println("Enter color");
 		String c = num.next();
 		c2.setColor(c);
 		r2.setColor(c);
 		s2.setColor(c);

 		System.out.println("\n" + "Enter true for filled else enter false");
 		boolean b = num.nextBoolean();
 		c2.setFilled(b);
 		r2.setFilled(b);
 		s2.setFilled(b);

 		System.out.println("\n" + "Enter radius of Circle");
 		r = num.nextInt();
 		c2.setRadius(r);

 		System.out.println("\n" + "Details of Circle1");

 		System.out.println(c1.toString());
 	
 		System.out.println("\n" + "Details of Circle2");
 		System.out.println(c2.toString());

 		System.out.println("\n" + "Enter length of Rectangle");
 		r = num.nextInt();
 		r2.setLength(r);

 		System.out.println("\n" + "Enter width of Rectangle");
 		r = num.nextInt();
 		r2.setWidth(r);

		System.out.println("\n" + "Details of Rectangle1");
 		System.out.println(r1.toString());

 		System.out.println("\n" + "Details of Rectangle2");
 		System.out.println(r2.toString());

 		System.out.println("\n" + "Enter side of Square");
 		s = num.nextInt();
 		s2.setSide(r);

		System.out.println("\n" + "Details of Square1");
 		System.out.println(s1.toString());

 		s2.setSide(s);
 		System.out.println("\n" + "Details of Square2");
 		System.out.println(s2.toString());
 	}
 }