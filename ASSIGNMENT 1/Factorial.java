public class Factorial {
    public static void main(String[] args) {
        int num = 5; // Declare and initialize the number for which to calculate the factorial
        long factorial = 1; // Initialize factorial to 1 (important!)

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            for (int i = 1; i <= num; i++) {
                factorial *= i; // Multiply factorial by i in each iteration
            }
            System.out.println("The factorial of " + num + " is: " + factorial);
        }
    }
}