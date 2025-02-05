// 3. Implementation of this keyword to invoke current class method.
class Example {
    // Method to display a message
    void display() {
        System.out.println("Inside display() method");
    }

    // Another method calling display() using 'this'
    void show() {
        System.out.println("Inside show() method");
        this.display(); // Invoking the current class method
    }

    public static void main(String[] args) {
        Example obj = new Example();
        obj.show(); // Calls show() method, which in turn calls display() using 'this'
    }
}
