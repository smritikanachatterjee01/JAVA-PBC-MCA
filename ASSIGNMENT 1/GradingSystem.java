
    import java.util.Scanner;

public class GradingSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the student's percentage: ");
        double percentage = input.nextDouble();

        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("The student's grade is: " + grade);

        input.close(); // Close the scanner to prevent resource leaks
    }
}

