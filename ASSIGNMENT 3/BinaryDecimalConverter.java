// 6. Write a Java program to convert a Binary Number to Decimal and Decimal to Binary. 
import java.util.Scanner;

public class BinaryDecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose an option:");
        System.out.println("1. Convert Binary to Decimal");
        System.out.println("2. Convert Decimal to Binary");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a binary number: ");
                String binary = scanner.next();
                int decimal = binaryToDecimal(binary);
                System.out.println("Decimal Equivalent: " + decimal);
                break;
                
            case 2:
                System.out.print("Enter a decimal number: ");
                int decNum = scanner.nextInt();
                String bin = decimalToBinary(decNum);
                System.out.println("Binary Equivalent: " + bin);
                break;
                
            default:
                System.out.println("Invalid choice!");
        }
        
        scanner.close();
    }

   
    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    
    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }
}
