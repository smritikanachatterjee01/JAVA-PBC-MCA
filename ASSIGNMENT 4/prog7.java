class Main {
    // A method that returns the current instance of the class
    Main getInstance() {
        return this;  // Returning the current object using 'this'
    }

    // A method to display a message
    void displayMessage() {
        System.out.println("This is the current instance of the class.");
    }

    public static void main(String[] args) {
        Main obj = new Main();  // Create an instance of Main
        
        // Call getInstance() and chain displayMessage() on the same object
        obj.getInstance().displayMessage();  // 'this' is used to return the current instance
    }
}
