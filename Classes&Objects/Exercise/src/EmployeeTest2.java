/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: Create a class called Employee that includes three instance variables—a first name (type String), a last name (type String) and a monthly salary (double). 
            Provide a constructor that initializes the three instance variables. If the monthly salary is not positive, ask the user to re-enter a positive value. 
            Write a test application named EmployeeTest that demonstrates class Employee’s capabilities. 
            Create two Employee objects and display each object’s yearly salary. Then give each Employee a 10% raise and display each Employee’s yearly salary again.
            Solve the given questions with Address defined as a separate class and used in Employee. 
            Address class should include the following instance variables: First Line and Second Line and Pin code. 
            Constructor and other member function definitions of class Employee should be modified accordingly.
*/
import java.util.*;

class Employee2
{
    Scanner emp = new Scanner(System.in);
    String fname, lname;
    double salary;

    Address2 add1 = new Address2();
    Address2 add2 = new Address2();

    String address = add2.getAdd();

    public double yrSal() //method to find yearly salary
    {
      return (salary*12);
    }

    public double incSal() //method to find increased yearly salary
    {
      return ((salary+(salary*0.1))*12);
    }

    public String Add()
    {
      add1.setAdd();
      address= add1.getAdd();
      return address;
    }

    public void displayDetail() //method to display employee details
    {

      System.out.println("First name: "+ fname);
      System.out.println("Last name: "+ lname);
      System.out.println("Monthly salary: "+ salary);
      System.out.println("Yearly salary: "+ yrSal());
      System.out.println("Increased yearly salary: "+ incSal());
      System.out.println("Address: " + address);
    }

    Employee2(String fname, String lname, double salary) //non-parameterized constructor
    { 
      this.fname= fname;
      this.lname= lname;
      this.salary= salary;
    }

    Employee2() //parameterized constructor
    { 
      this.fname="Rajesh";
      this.lname="Kumar";
      this.salary=5000;      
    }
  
}

public class EmployeeTest2
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
      sal = num.nextDouble();
    }

  	Employee2 e1 = new Employee2(); //e1 and e2 are the objects created of Employee class. 
    Employee2 e2 = new Employee2(); 
    e1.lname= lname;
    e1.fname= fname;
    e1.salary= sal;
    e1.Add();
  	e1.displayDetail();
    //e2.Add();
    e2.displayDetail();
  }
}



class Address2  
{

  Scanner emp = new Scanner(System.in);

  String fline;
  String sline;
  int pin;

  public Address2(String fLine, String sLine, int pin)
    { 
        this.fline= fLine;
        this.sline= sLine;
        this.pin= pin;
    }

    public Address2()
    { 
        this.fline= "56A";
        this.sline= "South City-1";
        this.pin= 122001;
    }

    public void setAdd()
    {
      System.out.println("Enter address");
      System.out.println("Enter First Line");
      fline = emp.nextLine(); 
      System.out.println("Enter Second Line");
      sline = emp.nextLine(); 
      System.out.println("Enter Pin Code");
      pin = emp.nextInt();

    }

    public String getAdd()
    {
      fline= fline;
      sline= sline;
      pin= pin;
      return (fline + " " + sline + " " + pin);
    }
}