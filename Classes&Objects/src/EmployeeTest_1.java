/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: Create a class Employee that includes the following: name, year of joining, salary, address. 
            Write a test application named EmployeeTest that demonstrates class Employee’s capabilities by displaying the output as follows for:
            Name       Year of joining        Address
            Ram         1994                64C Vasant Kunj 110070
            Sam         2000                68D Dwarka 110037
            Ana         1999                26B R.K Puram 110022

*/
import java.util.*;
public class EmployeeTest_1
{
  public static void main(String args[]) 
  {
  	Scanner emp = new Scanner(System.in); 
    System.out.println("Enter number of employees");
    int num = emp.nextInt(); 
    int i;
    Employee[] e= new Employee[num];
    Employee e1= new Employee();

    for(i=0; i<num; i++)
    {
      e[i]= new Employee();
      e[i].setDetails(); 
    }

    System.out.println("Name \t\tYear of Joining \t Salary \t Address");
    for(i=0; i<num; i++) 
    { 
      e[i].displayDetail();   
    } 
    e1.displayDetail();
  }
}


class Employee1
  {
  	String name; 
    String address;
    int yoj, num, i;
    double sal;
    
    Scanner emp = new Scanner(System.in); 
    Employee1[] e= new Employee1[num];

    void setDetails()
    {
      System.out.println("Enter name");
      name= emp.next();  

      System.out.println("Enter year of joining");
      yoj= emp.nextInt(); 
    
      System.out.println("Enter monthly salary");
      sal= emp.nextDouble();
    
      System.out.println("Enter address");
      address= emp.next();    
    }

  	void displayDetail()
  	{
        System.out.println(name +"\t\t"+ yoj +" \t\t\t "+ sal +" \t "+ address);
  	}

    void Employee1(String name, String address, double sal, int yoj) 
    { 
      this.name= name;
      this.yoj= yoj;
      this.sal= sal;
      this.address= address;
    }

    Employee1() 
    { 
		  this.name= "Animesh";
      this.yoj= 2010;
      this.sal= 50000;
      this.address= "56A South City-1 122001";   
    }
  }