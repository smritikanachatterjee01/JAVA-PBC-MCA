// 4. Write a Java program to calculate Sum of two 2-dimensional arrays.
public class SumOf2DArrays {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2}, {3, 4}};
        int[][] arr2 = {{5, 6}, {7, 8}};
        int[][] sum = new int[2][2];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("Sum of the arrays:");
        for (int[] row : sum) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}