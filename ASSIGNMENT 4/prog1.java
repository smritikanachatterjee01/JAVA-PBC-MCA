class OverloadExample {
    // Overloaded method with one integer parameter
    void display(int a) {
        System.out.println("Integer: " + a);
    }

    // Overloaded method with two integer parameters (Different Number of Parameters)
    void display(int a, int b) {
        System.out.println("Two Integers: " + a + ", " + b);
    }

    // Overloaded method with one double parameter (Different Data Type)
    void display(double a) {
        System.out.println("Double: " + a);
    }

    // Overloaded method with a string parameter (Different Data Type)
    void display(String msg) {
        System.out.println("String: " + msg);
    }

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();

        // Calling different overloaded methods
        obj.display(10);        // Calls method with int parameter
        obj.display(10, 20);    // Calls method with two int parameters
        obj.display(5.5);       // Calls method with double parameter
        obj.display("Hello");   // Calls method with String parameter
    }
}
