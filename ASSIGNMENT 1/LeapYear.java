import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        boolean isLeapYear;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                isLeapYear = year % 400 == 0; // Divisible by 400 is a leap year
            } else {
                isLeapYear = true; // Divisible by 4 but not 100 is a leap year
            }
        } else {
            isLeapYear = false; // Not divisible by 4 is not a leap year
        }

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        input.close();
    }
}