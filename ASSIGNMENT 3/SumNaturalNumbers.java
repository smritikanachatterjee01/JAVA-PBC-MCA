//8. Write a Java program to calculate the sum of natural numbers up to a certain range  
public class SumNaturalNumbers {
    public static void main(String[] args) {
        int range = 100, sum = 0;
        for(int i = 1; i <= range; ++i) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}