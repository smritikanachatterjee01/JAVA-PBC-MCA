// 2. Write a java program to implement interface.
// Define the interface
interface Animal {
    void makeSound();
}

// Implement the interface in a class
class Dog implements Animal {
    // Provide implementation for the makeSound method
    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of Dog
        Dog myDog = new Dog();
        // Call the makeSound method
        myDog.makeSound();
    }
}
