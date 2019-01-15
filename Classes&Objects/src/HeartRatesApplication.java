/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: Create a class called HeartRates. The class attributes should include the person’s first name, last name and date of birth (consisting of separate attributes for the month, day and year of birth). 
            The class should have a constructor that receivesthis data as parameters. For each attribute provide set and get methods. The class also shouldinclude the following methods:
            a)  a method that calculates and returns the person’s age (in years)
            b)  a method that calculates and returns the person’s maximum heart rate (the formula for calculating your maximum heart rate in beats per minute is 220 minus your age in Years) 
            c)  a method that calculates and returns the person’s target heart rate (target heart rate is a range that’s 50–85% of your maximum heart rate. 
            Write a Java application that prompts for two person’s information, instantiates object of class HeartRates and prints the information from that object—including the person’s first name, last name and date of birth—then calculates and prints the person’s age in (years), maximum heart rate and target-heart-rate range.
*/
import java.util.*;
public class HeartRatesApplication 
{
    public static void main(String[] args)
    {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter First Name");
        String fname = data.nextLine();
        System.out.println("Enter Last Name");
        String lname = data.nextLine();
        System.out.println("Enter Date of Birth");
        System.out.println("Enter day");
        int month = data.nextInt();
        System.out.println("Enter month");
        int day = data.nextInt();
        System.out.println("Enter year");
        int year = data.nextInt();
 
        HeartRates h1 = new HeartRates(fname, lname, day, month, year);
        h1.fname= fname;
        h1.lname= lname;
        h1.day= day;
        h1.month= month;
        h1.year= year;
        System.out.println("Name: "+ h1.getFname() +" " + h1.getLname());
        System.out.println("Age in years: "+ h1.getAge());
        System.out.println("Maximum Heartrate: "+ h1.MaxHeartRates());
        h1.targetHeartRate();
    }
}
 class HeartRates 
 {
    String fname, lname; //Initializing variables
    int month, day, year= 0;
 
    HeartRates(String fname, String lname, int month, int day, int year) //non-parameterized Constructor
    {
        this.fname = fname;
        this.lname = lname;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    void setFname(String fname) 
    {
        fname= fname;
    }
    String getFname() 
    {
        return fname;
    }
    void setLname(String lname) 
    {
        lname= lname;
    } 
    String getLname() 
    {
        return lname;
    }
    void setDoB(int month, int day, int year) 
    {
        month = month;
        day = day;
        year = year;
    }
    void getDoB() 
    {
        System.out.println("Date of Birth: "+ day +"/"+ month +"/"+ year);
    }
 
    int getAge()
    {
        return (2019- year);
    }

    int MaxHeartRates() 
    {
        return (220- getAge());
    }
    void targetHeartRate() //method to display the targeted heartrate range
    {
    System.out.print("Target Heart Rate Range: "+ (MaxHeartRates()* 0.5) + " to "+ (MaxHeartRates()* 0.85));
    }
  }