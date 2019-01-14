/* Author: Shagun Bhardwaj(18csu202)
   Version:1.0.0
   Purpose: Write a Java program that takes a number from the user between 1 and 12 and displays the name of the corresponding month until the user wants to exit the program.
*/
import java.util.Scanner;
public class months {
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        System.out.print("Input number: ");
        int month = num.nextInt();

        System.out.println(getMonthName(month));
    }
    public static String getMonthName(int month) {
        String monthName = "";
        switch (month) 
        {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August";break;
            case 9: monthName = "September";break;
            case 10: monthName = "October";break;
            case 11: monthName = "November";break;
            case 12: monthName = "December";break;
            default:monthName = "Invalid Month range";
        }

        return monthName;
    }
}