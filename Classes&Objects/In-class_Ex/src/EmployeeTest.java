/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: Create a class called Employee that includes three instance variables—a first name (type String), a last name (type String) and a monthly salary (double). 
            Provide a constructor that initializes the three instance variables. If the monthly salary is not positive, ask the user to re-enter a positive value. 
            Write a test application named EmployeeTest that demonstrates class Employee’s capabilities. 
            Create two Employee objects and display each object’s yearly salary. Then give each Employee a 10% raise and display each Employee’s yearly salary again.
*/
import java.util.*;
public class EmployeeTest
{
  public static void main(String args[]) 
  {
  	Scanner num = new Scanner(System.in); 
    System.out.println("Enter first name");
    String fname = num.next();  
  	System.out.println("Enter last name");
  	String lname = num.next(); 
  	System.out.println("Enter monthly salary");
  	double sal = num.nextDouble();
    if(sal<0)
    {
      System.out.println("Enter a positive value");
    } 
  	Employee e1 = new Employee(); //e1 and e2 are the objects created of Employee class. 
    Employee e2 = new Employee(); 
    e1.lname= lname;
    e1.fname= fname;
    e1.salary= sal;
  	e1.displayDetail();
    e2.displayDetail();
  }
}
class Employee
  {
  	String fname, lname;
    double salary;

  	double yrSal() //method to find yearly salary
    {
      return (salary*12);
    }
    double incSal() //method to find increased yearly salary
  	{
  		return ((salary+(salary*0.1))*12);
  	}
  	void displayDetail() //method to display employee details
  	{
  		System.out.println("First name: "+ fname);
      System.out.println("Last name: "+ lname);
      System.out.println("Monthly salary: "+ salary);
      System.out.println("Yearly salary: "+ yrSal());
      System.out.println("Increased yearly salary: "+ incSal());
  	}

    void Employee(String fname, String lname, double salary) //non-parameterized constructor
    { 
      this.fname= fname;
      this.lname= lname;
      this.salary= salary;
    }

    Employee() //parameterized constructor
    { 
		  this.fname="Lakshay";
      this.lname="Bhardwaj";
      this.salary=50000;   
    }
  }