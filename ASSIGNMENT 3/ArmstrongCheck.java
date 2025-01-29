// 7. Write a Java program to check whether a given number is Armstrong Number or not.
public class ArmstrongCheck {
     
    public static void main(String[] args) {
        int number = 153, originalNumber, remainder, result = 0;
        originalNumber = number;
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}