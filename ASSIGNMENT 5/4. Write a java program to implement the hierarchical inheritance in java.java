// 4. Write a java program to implement the hierarchical inheritance in java.
class Animal {
    void eat() {
    System.out.println("Animal is eating");
    }
    }
    class Dog extends Animal { // Hierarchical inheritance
    void bark() {
    System.out.println("Dog is barking");
    }
    }
    class Cat extends Animal { // Hierarchical inheritance
    void meow() {
    System.out.println("Cat is meowing");
    }
    }
    public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
    Dog dog = new Dog();
    dog.eat(); // Inherited method
    dog.bark(); // Child class method
    Cat cat = new Cat();
    cat.eat(); // Inherited method
    cat.meow(); // Child class method
    }
    }