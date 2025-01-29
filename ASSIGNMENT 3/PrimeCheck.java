// 5. Write a Java program to check whether a number is prime or not. 

public class PrimeCheck {
    public static void main(String[] args) {
        int number = 29;
        boolean isPrime = true;
        for(int i = 2; i <= number / 2; ++i) {
            if(number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");
    }
}