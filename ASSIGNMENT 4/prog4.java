class Main {
    // Constructor with no parameters
    Main() {
        this(10);  // Calls the constructor with an integer parameter
        System.out.println("Default Constructor Called");
    }

    // Constructor with an integer parameter
    Main(int x) {
        System.out.println("Parameterized Constructor Called with value: " + x);
    }

    public static void main(String[] args) {
        prog10 obj = new prog10();  // Calls the default constructor
    }
}
