// 7. Implementation of method overriding in java.
class Animal {
    void sound() {
    System.out.println("Animal makes a sound");
    }
    }
    class Dog extends Animal {
    @Override
    void sound() { // Method overriding
    System.out.println("Dog barks");
    }
    }
    public class MethodOverridingExample {
    public static void main(String[] args) {
    Animal dog = new Dog();
    dog.sound(); // Calls overridden method
    }
    }