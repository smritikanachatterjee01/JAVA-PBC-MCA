// 18. Write a java program to observe the utility of public access specifier.

// Class with public access specifier
class MyClass {
    // Public field
    public int number;

    // Public method
    public void displayNumber() {
        System.out.println("Number: " + number);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of MyClass
        MyClass obj = new MyClass();

        // Access and modify the public field
        obj.number = 10;

        // Call the public method
        obj.displayNumber();
    }
}
