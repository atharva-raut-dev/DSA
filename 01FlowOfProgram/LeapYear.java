//Input a year and find whether it is a leap year or not.
import java.util.Scanner;
class LeapYear
{
    public static void main(String args[])
    {
        Scanner a1 = new Scanner(System.in);
        System.out.println("Enter your year:- ");
        int year = a1.nextInt();
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)) )
        {
            System.out.println("The year is a Leap Year");
        }
        else
        {
            System.out.println("The year is not a Leap Year");
        }
    
    }
}