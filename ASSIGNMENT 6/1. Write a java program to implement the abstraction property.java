// 1. Write a java program to implement the abstraction property.
// Interface
interface Animal {
    void makeSound(); // Abstract method
    void sleep();    // Abstract method
}

// Class implementing the interface
class Dog implements Animal {
    public void makeSound() {
        System.out.println("The dog barks: Woof! Woof!");
    }

    public void sleep() {
        System.out.println("The dog is sleeping.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // Output: The dog barks: Woof! Woof!
        myDog.sleep();      // Output: The dog is sleeping.
    }
}