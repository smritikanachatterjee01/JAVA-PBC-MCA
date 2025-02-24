// 5. Write a java program to implement the multilevel inheritance in java.
class Animal {
    void eat() {
    System.out.println("Animal is eating");
    }
    }
    class Dog extends Animal { // First level inheritance
    void bark() {
    System.out.println("Dog is barking");
    }
    }
    class Puppy extends Dog { // Second level inheritance
    void weep() {
    System.out.println("Puppy is weeping");
    }
    }
    public class MultilevelInheritanceExample {
    public static void main(String[] args) {
    Puppy puppy = new Puppy();
    puppy.eat(); // Grandparent method
    puppy.bark(); // Parent method
    puppy.weep(); // Child method
    }
    }
