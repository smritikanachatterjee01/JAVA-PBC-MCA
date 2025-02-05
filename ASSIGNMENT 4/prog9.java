class Main {
    int value;  // Instance variable

    // Constructor with a parameter that has the same name as the instance variable
    Main(int value) {
        this.value = value;  // Using 'this' to refer to the instance variable and suppress the local variable
    }

    void showValue() {
        int value = 20;  // Local variable with the same name as the instance variable
        System.out.println("Local value: " + value);      // Refers to the local variable
        System.out.println("Instance value: " + this.value);  // Refers to the instance variable using 'this'
    }

    public static void main(String[] args) {
        Main obj = new Main(100);  // Passing 100 to the constructor
        obj.showValue();  // Calls showValue() method
    }
}
