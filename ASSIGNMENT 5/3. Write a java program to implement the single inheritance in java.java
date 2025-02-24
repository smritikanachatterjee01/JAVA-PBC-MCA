// 3. Write a java program to implement the single inheritance in java.
class Animal {
    void eat() {
    System.out.println("Animal is eating");
    }
    }
    class Dog extends Animal { // Single inheritance
    void bark() {
    System.out.println("Dog is barking");
    }
    }
    public class SingleInheritanceExample {
    public static void main(String[] args) {
    Dog dog = new Dog();
    dog.eat(); // Inherited method
    dog.bark(); // Child class method
    }
    }