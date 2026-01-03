

// 1. Exception CASE-1: Problem without exception handling

public class ExceptionCase1 {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int result = a / b; // This will cause ArithmeticException
        System.out.println("Result: " + result);
    }
}

// 2. Exception CASE-2: Exception properly handled

public class ExceptionCase2 {
    public static void main(String[] args) {
        int a = 10, b = 0;
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}

// 3. Exception CASE-3: Exception occurs but not handled

public class ExceptionCase3 {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int result = a / b; // No try-catch block, program crashes
        System.out.println("Result: " + result);
    }
}

// 4. Java Multi-Catch Block

public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[10] = 50; // ArrayIndexOutOfBoundsException
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}

// 5. Java Nested Try Statement

public class NestedTryExample {
    public static void main(String[] args) {
        try {
            try {
                int arr[] = {1, 2, 3};
                System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner Catch: Array index out of bound!");
            }
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Outer Catch: Division by zero!");
        }
    }
}

// 6. Java throw Keyword

public class ThrowExample {
    public static void validateAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        }
        System.out.println("You are eligible to vote.");
    }
    public static void main(String[] args) {
        validateAge(16); // Throws exception
    }
}

// 7. Java throws Keyword

public class ThrowsExample {
    public static void divide() throws ArithmeticException {
        int result = 10 / 0; // Throws ArithmeticException
    }
    public static void main(String[] args) {
        try {
            divide();
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}

// 8. Finally Block Examples

public class FinallyExample {
    public static void main(String[] args) {
        // Case 1: Finally without Exception
        try {
            System.out.println("No exception occurs.");
        } finally {
            System.out.println("Finally block executes.");
        }

        // Case 2: Exception occurs but not handled
        try {
            int a = 10 / 0;
        } finally {
            System.out.println("Finally block executes even after an exception.");
        }

        // Case 3: Exception occurs and handled
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception handled.");
        } finally {
            System.out.println("Finally block executes.");
        }
    }
}

// 9. User-Defined Exception (CheckArgument)

class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}
public class CheckArgument {
    public static void main(String[] args) {
        try {
            if (args.length < 5) {
                throw new CheckArgumentException("Less than 5 arguments provided.");
            }
            int sum = 0;
            for (String arg : args) {
                sum += Integer.parseInt(arg);
            }
            System.out.println("Sum of numbers: " + sum);
        } catch (CheckArgumentException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format in arguments.");
        }
    }
}
