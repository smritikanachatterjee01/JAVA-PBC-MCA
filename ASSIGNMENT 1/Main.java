// FactorialCalculator.java (Separate class)
public class FactorialCalculator {
    public long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            long fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }
    }
}

// Main.java (Main program)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = input.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            FactorialCalculator calculator = new FactorialCalculator(); // Create an object
            long factorial = calculator.calculateFactorial(num); // Call the method
            System.out.println("The factorial of " + num + " is: " + factorial);
        }
        input.close();
    }
}