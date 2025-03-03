// 8. Write a java program to implement super() method with parameter.
class Animal {
    Animal(String name) {
        System.out.println("Animal constructor called with name: " + name);
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name); // Calling parent class constructor with parameter
        System.out.println("Dog constructor called");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
    }
}
