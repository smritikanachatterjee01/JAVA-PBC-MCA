// 4. Write a Java program to check whether a number is palindrome or not
public class PalindromeCheck {
    public static void main(String[] args) {
        int number = 121, reversed = 0, original = number;
        while(number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        if(original == reversed)
            System.out.println(original + " is a palindrome.");
        else
            System.out.println(original + " is not a palindrome.");
    }
}