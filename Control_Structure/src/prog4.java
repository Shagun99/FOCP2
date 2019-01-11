import java.util.*;
public class prog4
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in);
        int digit;
        System.out.print("Enter a positive number: ");
        digit = input.nextInt();
        int power = 1;
        while (power <= digit) {
            power *= 10;
        }
        power /= 10;
        while (power > 0) {
            System.out.print(digit/power + "   ");
            digit %= power;
            power /= 10;
        }
    }
}