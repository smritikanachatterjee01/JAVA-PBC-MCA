class Main {
    int value;  // Instance variable

    // Constructor with a parameter that has the same name as the instance variable
    Main(int value) {
        this.value = value;  // Using 'this' to refer to the instance variable
    }

    void displayValue() {
        System.out.println("Instance variable value: " + this.value);  // Accessing the instance variable using 'this'
    }

    public static void main(String[] args) {
        Main obj = new Main(10);  // Passing 10 to the constructor
        obj.displayValue();  // Calls the method to display the value of the instance variable
    }
}
