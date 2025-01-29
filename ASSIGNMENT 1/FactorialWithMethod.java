import java.util.Scanner;

public class FactorialWithMethod {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = input.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = calculateFactorial(num);
            System.out.println("The factorial of " + num + " is: " + factorial);
        }
        input.close();
    }

    public static long calculateFactorial(int n) {
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