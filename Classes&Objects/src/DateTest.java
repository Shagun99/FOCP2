/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: 2.	Create a class called Date that includes three instance variables— month (type int), day (type int) and year (type int). Provide a method displayDate that displays the month, day and year separated by forwardslashes (/). 
   				Write a test application named DateTest that demonstrates class Date’s capabilities.
*/
import java.util.*;
public class DateTest
{
  public static void main(String args[]) 
  {
  	Scanner num = new Scanner(System.in); 
    System.out.println("Enter day");
    int dat = num.nextInt();  
  	System.out.println("Enter month");
  	int mnth = num.nextInt(); 
  	System.out.println("Enter year");
  	int yr = num.nextInt(); 
  	Date d1 = new Date();
    Date d2 = new Date(); 
    d1.day= dat; //instance variable
    d1.month= mnth;
    d1.year= yr;
  	d1.displayDate();
    d2.displayDate();
  }
}
class Date
  {
  	int day, month, year;

  	void displayDate() //method to display date in given format
  	{
  		System.out.println(day+"/"+month+"/"+year);
  	}

    void Date(int day, int month, int year) //non-parameterized constructor
    { 
        this.day= day;
        this.month= month;
        this.year= year;
    }

    Date() //parameterized constructor
    { 
		this.day=1;
        this.month=1;
        this.year=2000;   
    }
  }