import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number (a): ");
        int a = input.nextInt();

        System.out.print("Enter the second number (b): ");
        int b = input.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        int temp = a; // Store the value of a in a temporary variable
        a = b;       // Assign the value of b to a
        b = temp;    // Assign the value of temp (original a) to b

        System.out.println("After swapping: a = " + a + ", b = " + b);
        input.close();
    }
}