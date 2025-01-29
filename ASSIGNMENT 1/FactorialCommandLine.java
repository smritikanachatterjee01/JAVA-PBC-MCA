public class FactorialCommandLine {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number as a command-line argument.");
            return; // Exit the program
        }

        try {
            int num = Integer.parseInt(args[0]); // Parse the argument
            if (num < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                long factorial = 1;
                for (int i = 1; i <= num; i++) {
                    factorial *= i;
                }
                System.out.println("The factorial of " + num + " is: " + factorial);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}