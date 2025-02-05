class Main {
    // Constructor that takes an object of type Main as argument
    Main(Main obj) {
        System.out.println("Constructor with object argument called!");
        System.out.println("Object passed: " + obj);
    }

    // Constructor with no parameters
    Main() {
        // Initialize the object first and then call the constructor with the 'this' keyword
        System.out.println("Inside the default constructor");
        Main temp = new Main(this);  // Passing current object as argument to another constructor
    }

    public static void main(String[] args) {
        Main obj = new Main(); // Calls the default constructor
    }
}
