//5. Write a Java program to find the sum of diagonal elements in a 2D array.
public class DiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i]; // Primary diagonal
            sum += arr[i][arr.length - 1 - i]; // Secondary diagonal
        }

        System.out.println("Sum of diagonal elements: " + sum);
    }
}